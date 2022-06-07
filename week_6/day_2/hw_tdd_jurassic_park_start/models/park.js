const Park = function(name, price) {
    this.name = name;
    this.ticketPrice = price;
    this.dinosaurs = [];
};

Park.prototype.addDinosaur = function(dinosaur){
    
    this.dinosaurs.push(dinosaur);

};

Park.prototype.removeDinosaur = function(dinosaur){

    let index = this.dinosaurs.indexOf(dinosaur);
    this.dinosaurs.splice(index, 1)
};

Park.prototype.highestViewingDino = function(){

    var highest = 0
    for (var dinosaur of this.dinosaurs){
        if (dinosaur.guestsAttractedPerDay > highest){
            highest = dinosaur.guestsAttractedPerDay
        }
    }
    return highest

};

Park.prototype.findDinoSpecies = function(species){

    let fullList = []
    for (var dinosaur of this.dinosaurs){
        if (dinosaur.species === species){
            fullList.push(dinosaur)
        }
    };
    return fullList

};

Park.prototype.totalVisitorsPerDay = function(){

    let total = 0
    for (var dinosaur of this.dinosaurs){
        total += dinosaur.guestsAttractedPerDay
    };
    return total

};

Park.prototype.totalVisitorsPerYear = function(){

    return this.totalVisitorsPerDay() * 365

};

Park.prototype.totalYearRevenue = function(){

    return this.totalVisitorsPerYear() * this.ticketPrice;

};

module.exports = Park;