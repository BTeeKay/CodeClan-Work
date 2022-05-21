import unittest
from models.players import *
from modules.game import *
class TestGame(unittest.TestCase):
    
    def setUp(self):
        self.p1 = Player("Brian", "")
        self.p2 = Player("Tina", "")
    
    def test_rock_beats_scissors_player1_win(self):
        self.p1.choice = "rock"
        self.p2.choice = "scissor"
        self.assertEqual("Player1 wins", first_game(self.p1, self.p2))
    
    def test_paper_beats_rock_player1_win(self):
        self.p1.choice = "paper"
        self.p2.choice = "rock"
        self.assertEqual("Player1 wins", first_game(self.p1, self.p2))
    
    def test_scissor_beats_paper_player1_win(self):
        self.p1.choice = "scissor"
        self.p2.choice = "paper"
        self.assertEqual("Player1 wins", first_game(self.p1, self.p2))
    
    def test_rock_beats_scissors_player2_win(self):
        self.p1.choice = "scissor"
        self.p2.choice = "rock"
        self.assertEqual("Player2 wins", first_game(self.p1, self.p2))
    
    def test_paper_beats_rock_player2_win(self):
        self.p1.choice = "rock"
        self.p2.choice = "paper"
        self.assertEqual("Player2 wins", first_game(self.p1, self.p2))
    
    def test_scissor_beats_paper_player2_win(self):
        self.p1.choice = "paper"
        self.p2.choice = "scissor"
        self.assertEqual("Player2 wins", first_game(self.p1, self.p2))
    
    def test_draw_rock_rock(self):
        self.p1.choice = "rock"
        self.p2.choice = "rock"
        self.assertIsNone(first_game(self.p1, self.p2))
    
    def test_draw_paper_paper(self):
        self.p1.choice = "paper"
        self.p2.choice = "paper"
        self.assertIsNone(first_game(self.p1, self.p2))
    
    def test_draw_scissor_scissor(self):
        self.p1.choice = "scissor"
        self.p2.choice = "scissor"
        self.assertIsNone(first_game(self.p1, self.p2))
