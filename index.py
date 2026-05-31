'''class fita:

    def __init__(self):
        print("constructor call")

    def python(self):
        print("take a python class")

    def java(self):
        print("take a java class")


maha=fita()
viji=fita()

maha.java()
viji.python()'''

class fita:

    def __init__(self):
        self.name="fita stu"
        self.course="full stack"
        self.fees="0k"
        print("constructor call")

    def python(self):
        print("take a python class")

    def java(self):
        print("take a java class")


maha=fita()
viji=fita()

#maha.java()
#viji.python()

viji.name="vijaya lakshmi"
viji.course="java"

maha.name="vijaya lakshmi"
maha.course="python"

maha.fees="30k"

print("stu name",maha.name)
print("course is",maha.course)
print("paid fees",maha.fees)

print("----------")

print("stu name",viji.name)
print("course is",viji.course)
print("paid fees",viji.fees)

