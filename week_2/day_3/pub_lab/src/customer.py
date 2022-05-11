from unicodedata import name


class Customer:
    def __init__(self, name, wallet, age):
        self.name = name
        self.wallet = wallet
        self.age = age
        self.level = 0
        self.items_purchased = []
    
    def buy_drink(self, drink):
        if self.wallet >= drink.price:
            self.wallet -= drink.price
            self.items_purchased.append(drink)
            self.level += drink.level
    
    def buy_food(self, food):
        if self.wallet >= food.price:
            self.wallet -= food.price
            self.items_purchased.append(food)
            self.level -= food.level
            