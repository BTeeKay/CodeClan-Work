const express = require('express');
const ObjectId = require('mongodb').ObjectId;

const createRouter = function (collection) {

  const router = express.Router();

  router.get('/', function (req, res) {
    collection
    .find()
    .toArray()
    .then((docs) => res.json(docs))
    .catch((error) => {
      console.error(error)
      res.status(500)
      res.json({ 
      status: 500,
      error: error})
    })
  });

  router.get('/:id', function (req, res) {

    const id = req.params.id;
    collection
    .findOne({_id:ObjectId(id)})
    .then((doc) => res.json(doc))
    .catch((error) => {
      console.error(error);
      res.status(500);
      res.json({
        status:500,
        error: error
      });
    })
  });

  router.post('/', function (req, res) {
    const newGame = req.body;
    collection
    .insertOne(newGame)
    .then(() => collection.find().toArray())
    .then((docs) => res.json(docs))
    .catch((err) => {
      console.error(err);
      res.status(500);
      res.json({ status: 500, error: err });
    });
  })

router.delete('/:id', function (req, res) {
    const id = req.params.id;
    collection
    .deleteOne({_id:ObjectId(id)})
    .then((docs) => res.json(docs))
    .catch((error) => {
      console.error(error);
      res.status(500);
      res.json({
        status:500,
        error: error
      });
  })
})

router.put('/:id', function (req, res) {
  const id = req.params.id;
  const updatedGame = req.body;
  collection
  .updateOne(
    { _id:ObjectId(id) },
    {$set: updatedGame}
    )
  .then((result) => res.json(result))

});



  return router;

};

module.exports = createRouter;
