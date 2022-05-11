import unittest
from src.customer import Customer
from src.drink import Drink
from src.food import Food

class TestCustomer(unittest.TestCase):
    
    def setUp(self):
        self.customer1 = Customer("Lou", 100, 16)
        self.customer2 = Customer("Bob", 40, 30)
    
    def test_customer_has_name(self):
        self.assertEqual("Lou", self.customer1.name)
    
    def test_customer_has_age(self):
        self.assertEqual(16, self.customer1.age)
    
    def test_customer_has_wallet(self):
        self.assertEqual(100, self.customer1.wallet)
    
    def test_customer_purchased_empty(self):
        self.assertEqual(0, len(self.customer1.items_purchased))
    
    def test_purchase(self):
        drink = Drink("cat", 5.5, 5)
        food = Food("horse", 22.50, 3)
        self.customer1.buy_drink(drink)
        self.customer1.buy_food(food)
        self.assertEqual(2, len(self.customer1.items_purchased))
        self.assertEqual(2, self.customer1.level)
