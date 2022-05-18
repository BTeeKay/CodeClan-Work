from models.orders import Order
from datetime import datetime

order1 = Order("Dev", datetime(2022, 5, 18), 1, "Grand Theft Auto", 18, 0)
order2 = Order("Josh", datetime(2022, 5, 17), 1, "God of War", 18, 1)
order3 = Order("Princess", datetime(2022, 5, 16), 1, "Super Mario Sunshine", 13, 2)
order4 = Order("Louise", datetime(2020, 5, 15), 100, "tetris", 5, 3)
order5 = Order("Mick", datetime(2022, 5, 10), 1, "Civ 6", 13, 4)

orders = [order1, order2, order3, order4, order5]