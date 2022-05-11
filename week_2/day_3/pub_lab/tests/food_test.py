import unittest
from src.food import Food

class TestFood(unittest.TestCase):
    
    def setUp(self):
        self.food1 = Food("Pizza", 8.00, 2)
        self.food2 = Food("Burger", 6, 1)
    
    def test_food_has_name(self):
        self.assertEqual("Pizza", self.food1.name)
    
    def test_food_has_price(self):
        self.assertEqual(8.00, self.food1.price)