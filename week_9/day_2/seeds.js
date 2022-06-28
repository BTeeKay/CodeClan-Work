use zoo;

db.dropDatabase();

db.animals.insertMany([
    {
        name: "Barry",
        type: "Polar Bear"
    },
    {
        name: "Jimmy",
        type: "Penguin",
        age: 1
    },
])