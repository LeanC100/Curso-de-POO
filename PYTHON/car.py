from account import Account

class Car:
    id = int
    license = str
    driver = Account("","")
    passegenger = int

    def __init__ (self, license,driver):
        self.license = license
        self.driver = driver

    def toPrint():
        print(f'license: {license}')

    def setId(self, id):
        self.__id = int(id)
        print("Passengers asgindados : " + str(self.__id))

    def getId(self):
        if self.__Id != int:
            print(self.__Id)

    def setLicense(self, license):
        self.__license = str(license)
        print("Passengers asgindados : " + str(self.__license))

    def getLicense(self):
        if self.__license != str:
            print(self.__license)

    def setDriver(self, driver):
        self.__driver = Account(driver)
        print("Passengers asgindados : " + str(self.__driver))

    def getDriver(self):
        if self.__driver != Account:
            print(self.__driver)

    def setPassegenger(self, passegenger):
            self.__passegenger = int(passegenger)
            print("Passengers asgindados : " + str(self.__passegenger))

    def getPassenger(self):
        if self.__passegenger != int:
            print(self.__passegenger)
