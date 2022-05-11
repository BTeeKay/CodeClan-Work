class Pub:
    def __init__(self, name, number):
        self.name = name
        self.till = number
        self.drinks = []
        self.food = []
    
    def check_age(self, customer):
        check = False
        if customer.age < 18:
            check = True
        return check
    
    def check_drunk(self, customer):
        check = False
        if customer.level > 20:
            check = True
        return check
    
    def add_drinks(self, drinks, amount):
        
        if len(self.drinks) == 0:
            drinks.stock = amount
            self.drinks.append(drinks)
        else:
            for drink in range(len(self.drinks)):
                if self.drinks[drink].name == drinks.name:
                    self.drinks[drink].stock += amount
                else:
                    drinks.stock = amount
                    self.drinks.append(drinks)
    
    def add_foods(self, foods, amount):
        
        if len(self.food) == 0:
            foods.stock = amount
            self.food.append(foods)
        else:
            for food in range(len(self.food)):
                if self.food[food].name == foods.name:
                    self.food[food].stock += amount
                else:
                    foods.stock = amount
                    self.food.append(foods)
    
    def remove_foods(self, foods, amount):
        for food in range(len(self.food)):
                if self.food[food].name == foods.name:
                    if self.food[food].stock >= amount:
                        self.food[food].stock -= amount
                    else:
                        return "No"
    
    def remove_drinks(self, drinks, amount):
        for food in range(len(self.drinks)):
                if self.drinks[food].name == drinks.name:
                    if self.drinks[food].stock >= amount:
                        self.drinks[food].stock -= amount
                    else:
                        return "No"
  
    def drink_stock(self):
        total = 0
        for drink in self.drinks:
            total += drink.stock
        return total
        
    def food_stock(self):
        total = 0
        for food in self.food:
            total += food.stock
        return total

    def check_drink(self, drink):
        for d in range(len(self.drinks)):
            if self.drinks[d].name == drink.name:
                return True
        return False

    def sell_drink(self, customer, drink):
        if self.check_drink(drink):
            pass
