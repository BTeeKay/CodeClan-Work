const ourForEach = function (array, callback) {
    for (const element of array) {
        callback(element);
    }

};

const numbers = [1, 2, 3, 4, 5];

ourForEach(numbers, (number) => {
    console.log(number)
})