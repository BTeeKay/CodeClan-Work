from db.run_sql import run_sql
from models.location import Location
from models.user import User

def save(user):
    sql = "INSERT INTO users( name ) VALUES ( ? ) RETURNING id"
    values = [user.name]
    results = run_sql( sql, values )
    user.id = results[0]['id']
    return user


def select_all():
    users = []

    sql = "SELECT * FROM users"
    results = run_sql(sql)
    for row in results:
        user = User(row['name'], row['id'])
        users.append(user)
    return users


def select(id):
    user = None
    sql = "SELECT * FROM users WHERE id = ?"
    values = [id]
    result = run_sql(sql, values)[0]

    if result is not None:
        user = User(result['name'], result['id'] )
    return user


def delete_all():
    sql = "DELETE FROM users"
    run_sql(sql)


def locations(user):
    locations = []
    
    sql = "SELECT locations.* FROM locations INNER JOIN visits on locations.id = visits.location_id WHERE user_id = ?"
    values = [user.id]
    results = run_sql(sql, values)

    for row in results:
        location = Location(row['name'], row['category'], row['id'])
        locations.append(location)
    return locations