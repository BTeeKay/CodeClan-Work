const murderer = 'Professor Plum';

const changeMurderer = function() {
murderer = 'Mrs. Peacock';
}
    
const declareMurderer = function() {
return `The murderer is ${murderer}.`;
}
    
changeMurderer();
const verdict = declareMurderer();
console.log(verdict);

// murderer is orig a const variable so cant be changed
// so it should stay professor Plum