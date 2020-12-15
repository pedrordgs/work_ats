from sonarqube import SonarQubeClient
import csv


url = 'http://localhost:9000'
username = "admin"
password = "admin"
# connect to sonarqube
sonar = SonarQubeClient(sonarqube_url=url, username=username, password=password)

# set fieldnames to csv
fieldnames = ['name', 'bugs', 'code_smells', 'vulnerabilities']

# get all projects on sonarqube
projects = list(sonar.projects.search_projects())

with open('sonarqube_results.csv', 'w', newline='') as file:
    # create a csv writer
    writer = csv.DictWriter(file, fieldnames = fieldnames)
    writer.writeheader()

    for p in projects:
        # get measures from sonarqube for project p
        component = sonar.measures.get_component_with_specified_measures(component=p['key'],
                                                                     fields="metrics,periods",
                                                                     metricKeys="code_smells,bugs,vulnerabilities")

        # create project p dictionary with name and measures
        project = {'name': component['component']['name']}
        for measure in component['component']['measures']:
            project[measure['metric']] = measure['value']
        # write project p to csv
        writer.writerow(project)

