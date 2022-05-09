class Team:

    def __init__(self, name, players, coach):
        self.name = name
        self.players = players
        self.coach = coach
        self.points = 0
    
    def add_player(self, player):
        self.players.append(player)

    def has_player(self, name):
        
        players = self.players
        found = False
        for player in players:
            if name == player:
                found = True

        return found


    def play_game(self, result):
        if result:
            self.points += 3
        else:
            pass
