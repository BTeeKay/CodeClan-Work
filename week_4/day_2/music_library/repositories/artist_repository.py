from db.run_sql import run_sql

from models.artist import Artist
from models.album import Album

def save(artist):
   sql = "INSERT INTO artists (name) VALUES (?) RETURNING *"
   values = [artist.name]
   result = run_sql(sql, values)
   id = result[0]['id']
   artist.id = id
   return artist

def delete_all():
    sql = "DELETE FROM artists"
    run_sql(sql)

def select(id):
    artist = None
    sql = "SELECT * FROM artists WHERE id = ?"
    values = [id]
    result = run_sql(sql, values)[0]

    if result != None:
        artist = Artist(result['name'])
    return artist 

def albums(artist):
    albums = []
    sql = "SELECT * FROM albums WHERE artist_id = ?"
    values = [artist.id]
    results = run_sql(sql, values)

    for row in results:
        album = Album(row["title"], artist, row['genre'])
        albums.append(album)

### EXTENSIONS

def select_all():
    pass

def delete(id):
    pass

def update(artist):
    pass
