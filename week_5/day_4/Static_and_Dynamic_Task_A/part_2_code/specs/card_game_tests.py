import unittest
from src.card import Card
from src.card_game import CardGame

class TestCardGame(unittest.TestCase):
    
    def setUp(self):
        self.card1 = Card("Spade", 1)
        self.card2 = Card("Spade", 6)
        self.game = CardGame()

    def test_is_ace(self):
        cat = self.game.check_for_ace(self.card1)
        self.assertEqual(1, cat)
    
    def test_six_higher_one(self):
        cat = self.game.highest_card(self.card2, self.card1)
        self.assertEqual(6, cat.value)
    
    def test_total_card_7(self):
        cards = [self.card1, self.card2]
        total = self.game.cards_total(cards)
        self.assertEqual("You have a total of 7", total)