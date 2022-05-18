from app import app
from flask import render_template
from models.todo_list import tasks

horses = tasks
@app.route('/')
def index():
    return "hello world"

@app.route('/tasks')
def tasks():
    return render_template("index.html", name="Brian", tasks=horses)
