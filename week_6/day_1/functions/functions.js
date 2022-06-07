// console.log(sayHello("Hi", "Brian"))

// function sayHello(greeting = "Hello", pName = "World!"){
//     return `${greeting}, ${pName}!`
// };

// var add = function(firstNumber, secondNumber) {
//     return firstNumber + secondNumber;
// };

// console.log(add(2, 2))
// Task: 20 minutes

// 1. Declare a named function that takes an array of numbers, and returns the sum, or total, of all of the numbers in the array.
// 2. Define an anonymous function expression that takes two arguments:
// * an object, for example, { name: 'Wojtek', age: 30 }
// * a string, for example, 'name'

// Your function should return true if the given string is a key on the given object and 
// false if the object does not have a key that matches the string. Store this function in 
// an appropriately named variable to invoke it.

function add_array(list){
    var total = 0
    for (var i = 0; i < list.length; i++){
        total = (list[i] + total);
    };
    return total;
};
numbas = [1, 2, 3, 4, 5]
answer = add_array(numbas)
console.log(answer)

var nameList = [
    {name: "Brian"},
    {name: "Bob"}
];

var array_conditions = function(name, nameList) {
for (var i = 0; i < nameList.length; i++){
    if (nameList[i].name === name) {
        return true
    };
};
return false
};

console.log(array_conditions("Bob", nameList))
