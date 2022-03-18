#Classes of Cars

class Car:
     'This class represents a Car'

     def __init__(self, manufacturer,model,make,transmission,color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

     def accelerate(self):
        print(self.manufacturer + " " + self.model + " has started moving")
 
     def stop(self):
        print(self.manufacturer + " " + self.model + " has stopped moving")

Car1 = Car("Tesla", "S", "2021", "Automatic", "Black")
Car2 = Car("Honda City", "Civic", "2018", "Manual", "White")
Car3 = Car("Hyundai", "i20", "2014", "Manual", "White")

Car1.accelerate()
Car1.stop()