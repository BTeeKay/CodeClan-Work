from db.run_sql import run_sql

from models.album import Album
from models.artist import Artist

import repositories.artist_repository as artist_repository

def save(album):
    sql = f"INSERT INTO albums (title, artist_id, genre) VALUES (?, ?, ?) RETURNING *"
    values = [album.title, album.artist.id, album.genre]
    results = run_sql(sql, values)
    id = results[0]['id']
    album.id = id 
    return album

def delete_all():
    sql = "DELETE FROM albums"
    run_sql(sql)

def select(id):
    album = None
    sql = "SELECT * FROM albums WHERE id = ?"
    values = [id]
    result = run_sql(sql, values)[0]

    if result != None:
        artist = artist_repository.select(result['artist_id'])
        album = Album(result['title'], artist.id, result['genre'])

### EXTENSIONS


def delete(id):
    sql = "DELETE FROM albums WHERE id = ?"
    values = id
    run_sql(sql, id)

def select_all():
    albums = []
    sql = "SELECT * FROM albums"
    results = run_sql(sql)

    for row in results:
        artist = artist_repository.select(row["artist_id"])
        album = Album(row['title'], artist, row['genre'])
        albums.append(album)
    return albums

def update(album):
    pass
