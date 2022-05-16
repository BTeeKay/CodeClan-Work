import unittest
from src.pub import Pub
from src.customer import Customer
from src.food import Food
from src.drink import Drink

class TestPub(unittest.TestCase):
    
    def setUp(self):
        self.pub1 = Pub("21 misfits", 100.00)
        self.customer1 = Customer("Lou", 100, 16)
        self.customer2 = Customer("Bob", 100, 30)
        self.drink1 = Drink("Dark and Stormy", 4.50, 1)
        self.drink2 = Drink("Venom", 7.75, 2)
        self.food1 = Food("Pizza", 8.00, 2)
        self.food2 = Food("Burger", 6, 1)
    
    def test_pub_has_name(self):
        self.assertEqual("21 misfits", self.pub1.name)
    
    def test_pub_has_till(self):
        self.assertEqual(100.00, self.pub1.till)
    
    def test_customer_age_true(self):
        self.assertTrue(self.pub1.check_age(self.customer1))

    def test_customer_age_false(self):
        self.assertFalse(self.pub1.check_age(self.customer2))
    
    def test_customer_drunk_true(self):
        self.customer1.level = 22
        self.assertTrue(self.pub1.check_drunk(self.customer1))
    
    def test_customer_drunk_false(self):
        self.customer1.level = 2
        self.assertFalse(self.pub1.check_drunk(self.customer1))
    
    def test_add_drink(self):
        self.pub1.add_drinks(self.drink1, 2)
        self.pub1.add_drinks(self.drink1, 6)
        self.assertEqual(8, self.pub1.drinks[0].stock)

    def test_add_food(self):
        self.pub1.add_foods(self.food1, 9)
        self.pub1.add_foods(self.food1, 6)
        self.assertEqual(15, self.pub1.food[0].stock)
    
    def test_remove_food(self):
        self.pub1.add_foods(self.food1, 3)
        self.pub1.remove_foods(self.food1, 2)
        self.assertEqual(1, self.pub1.food[0].stock)
    
    def test_remove_food_false(self):
        self.pub1.add_foods(self.food1, 3)
        self.assertEqual("No", self.pub1.remove_foods(self.food1, 4))
    
    def test_remove_drink(self):
        self.pub1.add_drinks(self.drink1, 3)
        self.pub1.remove_drinks(self.drink1, 2)
        self.assertEqual(1, self.pub1.drinks[0].stock)
    
    def test_check_drink(self):
        self.pub1.add_drinks(self.drink1, 1)
        self.assertTrue(self.pub1.check_drink(self.drink1))
    
    def test_sell_drinks(self):
        self.pub1.add_drinks(self.drink1, 3)
        self.pub1.sell_drink(self.customer1, self.drink1)
        self.assertEqual(104.50, self.pub1.till)
        self.assertEqual(95.5, self.customer1.wallet)

    def test_sell_foods(self):
        self.pub1.add_foods(self.food1, 3)
        self.pub1.sell_foods(self.customer1, self.food1)
        self.assertEqual(108.00, self.pub1.till)
        self.assertEqual(92.00, self.customer1.wallet)

    

