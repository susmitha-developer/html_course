'''a=int(input("enter ur value:")) 
b=int(input("enter ur value:")) 
name=input("enter ur name") 
name=input("enter ur mobile")   

print(name)

print(a+b)'''

'''a=1
while(a<10):
    print(a)
    a=a+1'''

'''while(True):
    print("hi")
    break'''
result=[]
print("stu details")
while(True):


    a=int(input("1 upload details 2 result 3 exit"))
    if(a==1): 
        b=int(input("no of stu:"))
        for i in range(b):
            name=input("enter name:")
            age=int(input("enter ur age:"))
            loactiion=input("location:")
            result.extend([name,age,loactiion])
        print("upload succ")
        print(result)

    if(a==2):
        d=enter ur res
        for i in result:
            
            if(result[i]==d):
                d=result[i+0]
                e=result[i+1]+1
                print("reg is",d)

    

    elif(a==3):
        print("thanks for ur viste")
        break
