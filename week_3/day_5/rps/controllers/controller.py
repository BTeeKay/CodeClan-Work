from flask import render_template, request
from app import app
from models.player_list import *
from modules.game import *
import random

@app.route("/")
def index():
    return render_template("index.html", title="Main Page")

@app.route("/<c1>/<c2>")
def take_choice(c1, c2):
    p1 = Player("Player 1", c1)
    p2 = Player("Player 2", c2)
    result = first_game(p1, p2)

    return render_template("answer.html", title="Result", c1=c1, c2=c2, result=result)

@app.route("/play")
def play():
    return render_template("play.html", title="Play", c1="")

@app.route("/play", methods=['POST'])
def play_pc():
    options = ["rock", "paper", "scissor"]
    player_answer = request.form['answer']
    p1.choice = player_answer
    p2.choice = random.choice(options)
    result = first_game(p1, p2)
    return render_template("play.html", title="Play", result=result, c1=player_answer, c2=p2.choice)