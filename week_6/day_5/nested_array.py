students = [['Harry', 40], ['Barry', 30], ['Dave', 50], ['Aorse', 40]]
# student1= students[1]
# students.remove(student1)
# for student in students:
#     print(student)
scoreArray = []
studentArrayAnswer = []

for student in students:
    scoreArray.append(student[1])

lowestScore = min(scoreArray)

while lowestScore in scoreArray:
    scoreArray.remove(lowestScore)

secondLowestScore = min(scoreArray)

for student in students:
    if student[1] == secondLowestScore:
        studentArrayAnswer.append(student[0])

studentArrayAnswer.sort()
print(studentArrayAnswer)


    