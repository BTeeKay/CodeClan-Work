
def first_game(p1, p2):
    
    r = "rock"
    s = "scissor"
    p = "paper"

    if p1.choice == r and p2.choice == s:
        return "Player1 wins"
    
    if p1.choice == r and p2.choice == p:
        return "Player2 wins"
    
    if p1.choice == s and p2.choice == p:
        return "Player1 wins"
    
    if p1.choice == s and p2.choice == r:
        return "Player2 wins"
    
    if p1.choice == p and p2.choice == r:
        return "Player1 wins"
    
    if p1.choice == p and p2.choice == s:
        return "Player2 wins"
    
    return None

