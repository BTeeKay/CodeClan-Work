const Traveller = function(journeys) {
  this.journeys = journeys;
};

Traveller.prototype.getJourneyStartLocations = function() {
  var results = this.journeys.map((start) => start.startLocation);
  return results;
};

Traveller.prototype.getJourneyEndLocations = function () {
  var results = this.journeys.map((start) => start.endLocation);
  return results;
};

Traveller.prototype.getJourneysByTransport = function (transport) {
  var results = this.journeys.filter(journey => journey.transport === transport);
  return results;
};

Traveller.prototype.getJourneysByMinDistance = function (minDistance) {
  var results = this.journeys.filter(journey => journey.distance >= minDistance);
  return results
};

Traveller.prototype.calculateTotalDistanceTravelled = function () {
  var total = 0;
  this.journeys.forEach(journey => total += journey.distance);
  return total;
};

Traveller.prototype.getUniqueModesOfTransport = function () {
  var newList = []
  this.journeys.forEach(journey => {
    if (newList.indexOf(journey.transport) === -1) {
      newList.push(journey.transport)
    }});
    return newList
  };


module.exports = Traveller;
