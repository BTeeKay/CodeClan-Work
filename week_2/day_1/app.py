from modules.bank_account import *

# account = {
#     "holder_name": "John",
#     "balance": 500,
#     "type": "business"
# }

# print(get_account_name(account))

bank_account = BankAccount('John', 500, 'business')
bank_account2 = BankAccount('cat', 34234234, 'business')

print(bank_account._rates)
