class Student:

    def __init__(self, name, cohort):
        self.name = name
        self.cohort = cohort
    
    def talk(self):
        text = "I can talk!"
        return text
    
    def say_favourite_language(self, answer):
        text = f"I love {answer}"
        return text

