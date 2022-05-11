import unittest
from src.drink import Drink

class TestDrink(unittest.TestCase):
    
    def setUp(self):
        self.drink1 = Drink("Dark and Stormy", 4.50, 1)
        self.drink2 = Drink("Venom", 7.75, 2)
    
    def test_drink_has_name(self):
        self.assertEqual("Dark and Stormy", self.drink1.name)
    
    def test_drink_has_price(self):
        self.assertEqual(4.50, self.drink1.price)