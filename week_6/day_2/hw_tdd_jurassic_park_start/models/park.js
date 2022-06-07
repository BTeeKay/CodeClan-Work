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

module.exports = Park;