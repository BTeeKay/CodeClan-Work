from modules.bank_account import get_account_name

account = {
    "holder_name": "John",
    "balance": 500,
    "type": "business"
}

print(get_account_name(account))