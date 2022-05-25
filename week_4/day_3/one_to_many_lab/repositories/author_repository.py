from db.run_sql import run_sql

from models.author import Author
from models.book import Book

def save(author):
    sql = "INSERT INTO authors (name, age) VALUES (?, ?) RETURNING *"
    values = [author.name, author.age]
    results = run_sql(sql, values)
    id = results[0]["id"]
    author.id = id
    return author

def select_all():
    authors = []

    sql = "SELECT * FROM authors"
    results = run_sql(sql)

    for row in results:
        author = Author(row['name'], row['age'], row['id'])
        authors.append(author)
    return authors

def select(id):
    author = None
    sql = "SELECT * FROM authors WHERE id = ?"
    values = [id]
    result = run_sql(sql, values)[0]

    if result is not None:
        author = Author(result['name'], result['age'], result['id'] )
    return author


def delete_all():
    sql = "DELETE FROM authors"
    run_sql(sql)


def delete(id):
    sql = "DELETE FROM authors WHERE id = ?"
    values = [id]
    run_sql(sql, values)


def update(author):
    sql = "UPDATE authors SET (name, age) = (?, ?) WHERE id = ?"
    values = [author.name, author.age, author.id]
    run_sql(sql, values)

def get_books(author):
    books = []

    sql = "SELECT * FROM books WHERE author_id = ?"
    values = [author.id]
    results = run_sql(sql, values)

    for row in results:
        book = Book(row['title'], row['genre'], row['pages'], row['author_id'], row['id'] )
        books.append(book)
    return books