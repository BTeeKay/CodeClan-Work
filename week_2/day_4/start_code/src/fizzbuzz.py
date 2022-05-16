from multiprocessing.connection import answer_challenge


def fizz_buzz(number):
    answer = ""
    
    if number % 3 == 0:
        answer += "fizz"
    
    if number % 5 == 0:
        answer += "buzz"
    
    if answer == "":
        return number
    return answer