const assert = require('assert');
const Park = require('../models/park.js');
const Dinosaur = require('../models/dinosaur.js');

describe('Park', function() {

  let dinosaur1;
  let dinosaur2;
  let dinosaur3;
  let park;

  beforeEach(function () {
    dinosaur1 = new Dinosaur('t-rex', 'carnivore', 50);
    dinosaur2 = new Dinosaur('triceratops', 'herbivore', 30);
    dinosaur3 = new Dinosaur('stegosaurus', 'herbivore', 35);
    park = new Park('Cumbernauld', 25);
  })

  it('should have a name', function(){

    const actual = park.name;
    const expected = 'Cumbernauld';
    assert.equal(actual, expected)

  });

  it('should have a ticket price', function(){

    const actual = park.ticketPrice;
    const expected = 25;
    assert.equal(actual, expected)

  });

  it('should have a collection of dinosaurs', function(){

    const actual = park.dinosaurs;
    const expected = [];
    assert.deepEqual(actual, expected);

  });

  it('should be able to add a dinosaur to its collection', function(){

    park.addDinosaur(dinosaur1);
    const actual = park.dinosaurs;
    const expected = [dinosaur1]
    assert.deepEqual(actual, expected)

  });

  it('should be able to remove a dinosaur from its collection', function(){

    park.addDinosaur(dinosaur1);
    park.addDinosaur(dinosaur2);
    park.removeDinosaur(dinosaur1);
    const actual = park.dinosaurs;
    const expected = [dinosaur2]
    assert.deepEqual(actual, expected)

  });

  it('should be able to find the dinosaur that attracts the most visitors', function(){

    park.addDinosaur(dinosaur1);
    park.addDinosaur(dinosaur2);
    park.addDinosaur(dinosaur3);
    const actual = park.highestViewingDino();
    const expected = 50;
    assert.strictEqual(actual, expected)

  });

  it('should be able to find all dinosaurs of a particular species', function(){

    park.addDinosaur(dinosaur1);
    park.addDinosaur(dinosaur2);
    park.addDinosaur(dinosaur3);
    const actual = park.findDinoSpecies('t-rex');
    const expected = [dinosaur1]
    assert.deepEqual(actual, expected)

  });

  it('should be able to calculate the total number of visitors per day', function(){

    park.addDinosaur(dinosaur1);
    park.addDinosaur(dinosaur2);
    park.addDinosaur(dinosaur3);
    const actual = park.totalVisitorsPerDay();
    const expected = 115;
    assert.strictEqual(actual, expected)

  });

  it('should be able to calculate the total number of visitors per year', function(){

    park.addDinosaur(dinosaur1);
    park.addDinosaur(dinosaur2);
    park.addDinosaur(dinosaur3);
    const actual = park.totalVisitorsPerYear();
    const expected = 41975;
    assert.strictEqual(actual, expected)

  });

  it('should be able to calculate total revenue for one year', function(){

    park.addDinosaur(dinosaur1);
    park.addDinosaur(dinosaur2);
    park.addDinosaur(dinosaur3);
    const actual = park.totalYearRevenue();
    const expected = 1049375;
    assert.strictEqual(actual, expected)
  });

});
