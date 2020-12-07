from sonarqube import SonarQubeClient

url = 'http://localhost:9000'
username = "admin"
password = "admin"
sonar = SonarQubeClient(sonarqube_url=url, username=username, password=password)


projects = list(sonar.projects.search_projects())
for p in projects:
    component = sonar.measures.get_component_with_specified_measures(component=p['key'],
                                                                 fields="metrics,periods",
                                                                 metricKeys="code_smells,bugs,vulnerabilities")
    print(component)
