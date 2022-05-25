from flask import Flask, render_template, request, redirect
from repositories import author_repository
from repositories import book_repository
from models.book import Book

from flask import Blueprint

books_blueprint = Blueprint("books", __name__)

@books_blueprint.route("/books")
def index():

    authors = author_repository.select_all()
    books = book_repository.select_all()

    return render_template("/books/index.html", title="Books", all_books=books, all_authors=authors)
