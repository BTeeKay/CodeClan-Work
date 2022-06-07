const assert = require('assert');
const Taxi = require('../taxi');

describe('Taxi', function(){

    let taxi;

    this.beforeEach(function(){
        taxi = new Taxi("Toyota", "Prius", "Brian")
    });

    it('should have a manufacturer', function(){

        const actual = taxi.manufacturer;
        assert.strictEqual(actual, "Toyota")

    });

    it('should have a model', function(){

        const actual = taxi.model;
        assert.strictEqual(actual, "Prius");

    });

    it('should have a driver', function(){

        const actual = taxi.driver;
        assert.strictEqual(actual, "Brian");

    });

    describe('passengers', function(){

        it('should start with no passengers', function(){

            const actual = taxi.passengers;
            assert.deepStrictEqual(actual, [])

        })

        it('should be able to return numnber of passengers', function(){

            const actual = taxi.numberOfPassengers();
            assert.equal(actual, 0)
        });

        it('should be able to add passengers', function () {
            taxi.addPassenger('Mike');
            const actual = taxi.numberOfPassengers();
            assert.strictEqual(actual, 1);
          });
          
        it('should be able to remove a passenger by name', function () {
            taxi.addPassenger('Mike');
            taxi.addPassenger('Lucas');
            taxi.removePassengerByName('Lucas');
            const expected = ['Mike']
            const actual = taxi.passengers;
            assert.deepStrictEqual(actual, expected);
        });
        
        it('should be able to remove all passengers', function () {
            taxi.addPassenger('Mike');
            taxi.addPassenger('Lucas');
            taxi.removeAllPassengers();
            const actual = taxi.numberOfPassengers();
            assert.strictEqual(actual, 0);
        });

    });

});
