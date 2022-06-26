
import random

full_team = ["nadia", "bob", "cammy", "nick", "andy", "shuna", "louise", "chris", "simona", "dev", "jonny", "ken",
"euan", "josh", "iain", "ian", "gillian", "ally", "michael", "kieran"]


random.randrange(1, 5)
team1 = []
team2 = []
team3 = []
team4 = []
team5 = []

counter = 0
while counter <=3:
    if len(team1) <=4:
        team = random.choice(full_team)
        team1.append(team)
        full_team.remove(team)
        counter += 1

counter = 0
while counter <=3:
    if len(team2) <=4:
        team = random.choice(full_team)
        team2.append(team)
        full_team.remove(team)
        counter += 1

counter = 0
while counter <=3:
    if len(team3) <=4:
        team = random.choice(full_team)
        team3.append(team)
        full_team.remove(team)
        counter += 1

counter = 0
while counter <=3:
    if len(team4) <=4:
        team = random.choice(full_team)
        team4.append(team)
        full_team.remove(team)
        counter += 1

counter = 0
while counter <=3:
    if len(team5) <=4:
        team = random.choice(full_team)
        team5.append(team)
        full_team.remove(team)
        counter += 1
        
   
print(team1)
print(team2)
print(team3)
print(team4)
print(team5)