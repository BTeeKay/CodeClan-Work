const express = require('express');
const cors = require('cors');
const app = express();

app.use(cors());

app.get('/', function (req, res) {

    // res.send('Hello, Nick and Ken!')
    res.json({
        message: "Hello, World!"
    })
});

app.listen(9000, function () {

    console.log('App Running on port 9000')
});