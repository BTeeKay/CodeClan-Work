const Pet = require('./pet.js');
const Person = require('./person.js');

const scooby = new Pet('Scooby Doo', 'Dog');

const shaggy = new Person('Shaggy Kerr', scooby);

scooby.eat('Scooby Snack');
shaggy.greet();
shaggy.feedPet("horse");