const names = ["Fred", "Kate", "Cindy", "Ricky", "Keith"];
console.log(names);

// const [fred, kate, , ricky] = names;
// console.log(ricky);

const [fred, kate, ...remainingNames] = names;
console.log(remainingNames);

const person = {
    name: "Joni",
    age: 76
  }

const { name, age } = person;             // CHANGED

console.log(name);
console.log(age);