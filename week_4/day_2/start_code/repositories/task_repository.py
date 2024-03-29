from db.run_sql import run_sql

from models.task import Task
from models.user import User
from repositories import user_repository

def select_all():  
    tasks = [] 

    sql = "SELECT * FROM tasks"
    results = run_sql(sql)

    for row in results:
        completed = True if row['completed'] == 1 else False
        user = user_repository.select(row['user_id'])
        task = Task(row['description'], user, row['duration'], completed, row['id'] )
        tasks.append(task)
    return tasks 

def save(task):
    sql = f"INSERT INTO tasks (description, user_id, duration, completed) VALUES (?, ?, ?, ?) RETURNING *"
    values = [task.description, task.user.id, task.duration, task.completed]
    results = run_sql(sql, values)
    id = results[0]['id']
    task.id = id
    return task

def delete_all():
    sql = "DELETE FROM tasks"
    run_sql(sql)

def select(id):
    task = None
    sql = "SELECT * FROM tasks WHERE id = ?"
    values = [id]
    result = run_sql(sql, values)[0]

    if result != None:
        completed = True if result['completed'] == 1 else False
        user = user_repository.select(result['user_id'])
        task = Task(result["description"], user.id, result["duration"], completed, result['id'])
    return task

def delete(id):
    sql = "DELETE FROM tasks WHERE id = ?"
    values = [id]
    run_sql(sql, values)

def update(task):
    sql = "UPDATE tasks SET (description, user_id, duration, completed) = (?, ?, ?, ?) WHERE id = ?"
    values = [task.description, task.user.id, task.duration, task.completed, task.id]
    run_sql(sql, values)
