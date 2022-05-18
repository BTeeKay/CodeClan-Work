from pydoc import render_doc
from app import app
from flask import render_template
from models.order_list import orders


@app.route('/')
def index():
    return render_template("index.html", title="testing", orders=orders)

@app.route('/orders/<number>')
def order_page(number):
    return render_template("order.html", number=int(number), orders=orders)