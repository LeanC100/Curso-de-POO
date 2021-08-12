from account import Account
from car import Car 

def main():
    car = Car ("FED-342", Account("marcelo","43.546.764"))
    
  #  car.toPrint()
    print(vars(car))
    print(vars(car.driver))
if __name__ == "__main__":
    main()

