import unittest
from src.fizzbuzz import *

class TestFizzBuzz(unittest.TestCase):

    def test_returns_fizz_when_passed_3(self):
        self.assertEqual("fizz", fizz_buzz(9))
    
    def test_returns_buzz_when_passed_5(self):
        self.assertEqual("buzz", fizz_buzz(5))
    
    def test_returns_fizzbuzz_when_passed_15(self):
        self.assertEqual("fizzbuzz", fizz_buzz(15))
    
    def test_returns_number_when_not_divisible_by_3_5(self):
        self.assertEqual(7, fizz_buzz(7))
