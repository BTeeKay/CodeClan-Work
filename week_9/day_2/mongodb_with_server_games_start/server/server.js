const express = require('express');
const app = express();
const cors = require('cors')
const MongoClient = require('mongodb').MongoClient;
const createRouter = require('./helpers/create_router');

app.use(express.json());
app.use(cors());

MongoClient.connect('mongodb://localhost:27017')
.then((client) => {
  const db = client.db('games_hub');
  const gamesCollection = db.collection('games');
  const gamesRouter = createRouter(gamesCollection);
  app.use('/api/games', gamesRouter)
})
.catch(console.error)

app.listen(9000, function () {
  console.log(`Listening on port ${ this.address().port }`);
});
