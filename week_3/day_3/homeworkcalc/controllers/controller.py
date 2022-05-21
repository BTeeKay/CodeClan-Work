from app import app
from flask import render_template
from modules.calculator import *

@app.route("/")
def index():
    return render_template("index.html")

@app.route("/add/<num1>/<num2>")
def addin(num1, num2):
    answer = add(int(num1), int(num2))
    return render_template("answer.html", num1=num1, num2=num2, answer=answer, calc="add")

@app.route("/subtract/<num1>/<num2>")
def subin(num1, num2):
    answer = subtract(int(num1), int(num2))
    return render_template("answer.html", num1=num1, num2=num2, answer=answer, calc="subtract")

@app.route("/multiply/<num1>/<num2>")
def multin(num1, num2):
    answer = multiply(int(num1), int(num2))
    return render_template("answer.html", num1=num1, num2=num2, answer=answer, calc="multiply")

@app.route("/divide/<num1>/<num2>")
def divin(num1, num2):
    answer = divide(int(num1), int(num2))
    return render_template("answer.html", num1=num1, num2=num2, answer=answer, calc="divide")

