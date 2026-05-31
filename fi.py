result=[]
#print(len(result))
#result[0]
#result[1]
name=input("enter ur name:")
dep=input("enter ur department:")
score=int(input("enter ur score:"))
result.extend([name,dep,score])
print(result)


for i in range(0, len(result), 3):
    print(result[i])

for i in range(0, len(result), 3):
    name = result[i]
    dep = result[i + 1]
    sc = result[i + 2]

    print("name is", name)
    print("department is", dep)
    print("score is", sc)