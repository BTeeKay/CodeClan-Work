scores = [4, 5, 4, 3, 6, 6, 2, 1]

def get_second_highest_score(scores):

    highest = max(scores)
    while highest in scores:
        scores.remove(highest)
    
    print(max(scores))

get_second_highest_score(scores)

