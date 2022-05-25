from db.run_sql import run_sql

from models.author import Author
from models.book import Book

def save(book):
    sql = "INSERT INTO books (title, genre, pages, author) VALUES (?, ?, ?, ?) RETURNING *"
    values = [book.title, book.title, book.genre, book.author.id]
    results = run_sql(sql, values)
    id = results[0]["id"]
    book.id = id
    return book

def select_all():
    books = []

    sql = "SELECT * FROM books"
    results = run_sql(sql)

    for row in results:
        book = Author(row['title'], row['genre'], row['pages'], row['author'], row['id'])
        books.append(book)
    return books