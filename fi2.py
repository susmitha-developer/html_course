# Account Transfer using Thread (Without Global)

import threading
import time


class Bank:

    def __init__(self):
        self.balance = 10000
        print("construct call")



    def withdraw(self):

        print("Withdraw Started")

        temp = self.balance
        time.sleep(3)

        temp = temp - 3000
        self.balance = temp

        print("After Withdraw :", self.balance)

        

    def deposit(self):

        print("Deposit Started")

        temp = self.balance
        time.sleep(3)

        temp = temp + 5000
        self.balance = temp

        print("After Deposit :", self.balance)


# Object
obj = Bank()


# Threads
t1 = threading.Thread(target=obj.withdraw)
t2 = threading.Thread(target=obj.deposit)

# Start
t1.start()
t2.start()

# Wait
t1.join()
t2.join()

print("Final Balance :", obj.balance)