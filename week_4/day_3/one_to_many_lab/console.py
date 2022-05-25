import pdb
from models.author import Author
from models.book import Book

import repositories.author_repository as author_repo 
import repositories.book_repository as book_repo

author1 = Author("Brian Kerr", 30)
author1.id = author_repo.save(author1)

author_repo.select_all()

pdb.set_trace()