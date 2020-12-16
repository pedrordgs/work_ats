import pandas as pd
import math


df=pd.read_csv('sonarqube_results.csv')


#FINDING MAX AND MIN

p=df['code_smells'].max()
q=df['code_smells'].min()
m=df['code_smells'].mean()

print('Max code smells - ' + str(p))
print('Min code smells - ' + str(q))
print('Mean code smells - ' + str(math.ceil(m)))

print('\n')

p=df['bugs'].max()
q=df['bugs'].min()
m=df['bugs'].mean()

print('Max bugs - ' + str(p))
print('Min bugs - ' + str(q))
print('Mean bugs - ' + str(math.ceil(m)))

