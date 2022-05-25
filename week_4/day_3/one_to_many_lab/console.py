import pdb
from models.author import Author
from models.book import Book

import repositories.author_repository as author_repo 
import repositories.book_repository as book_repo

author_repo.delete_all()
book_repo.delete_all()

author1 = Author("Brian Kerr", 30)
author1 = author_repo.save(author1)
author2 = Author("Tina Munro", 32)
author2 = author_repo.save(author2)

book1 = Book("Harry Potter and The Strange Cat", "Horror", 500, author1)
book1 = book_repo.save(book1)
book2 = Book("The Lord of The Rings", "Gangnam Style", 700, author2)
book2 = book_repo.save(book2)

author_repo.select_all()

pdb.set_trace()