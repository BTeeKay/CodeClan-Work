myclass = { 
    "Bob": {
        "Seat": "4B",
        "Grade": "A"
    },
    "Simona": {
        "Seat": "2F",
        "Grade": "A"
    },
    "Ally": {
        "Seat": "6H",
        "Grade": "F"
    },
    "Ken": {
        "Seat": "1A",
        "Grade": "C"
    } }
print("Previous grade: " + myclass["Ken"]["Grade"])
def update_students_grade(classdict, name, grade):
    if name in classdict:
        classdict[name]["Grade"] = grade
        return classdict[name]["Grade"]
    else:
        return "Not applicable"

grade = update_students_grade(myclass, "Ken", "A")

print("Current Grade: " + grade)