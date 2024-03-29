from db.run_sql import run_sql

from models.author import Author
from models.book import Book

import repositories.author_repository as author_repo
def save(book):
    sql = "INSERT INTO books (title, genre, pages, author_id) VALUES (?, ?, ?, ?) RETURNING *"
    values = [book.title, book.genre, book.pages, book.author.id]
    results = run_sql(sql, values)
    id = results[0]["id"]
    book.id = id
    return book

def select_all():
    books = []

    sql = "SELECT * FROM books"
    results = run_sql(sql)

    for row in results:
        author = author_repo.select(row['author_id'])
        book = Book(row['title'], row['genre'], row['pages'], author, row['id'])
        books.append(book)
    return books

def select(id):
    book = None
    sql = "SELECT * FROM books WHERE id = ?"
    values = [id]
    result = run_sql(sql, values)[0]

    if result is not None:
        author = author_repo.select(result['user_id'])
        book = Book(result['title'], result['genre'], result['pages'], author, result['id'])
    return book


def delete_all():
    sql = "DELETE FROM books"
    run_sql(sql)


def delete(id):
    sql = "DELETE FROM books WHERE id = ?"
    values = [id]
    run_sql(sql, values)


def update(book):
    sql = "UPDATE books SET (title, genre, pages, author) = (?, ?, ?, ?) WHERE id = ?"
    values = [book.title, book.genre, book.pages, book.author.id, book.id]
    run_sql(sql, values)