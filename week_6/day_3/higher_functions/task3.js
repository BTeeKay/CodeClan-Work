const add = function (x, y, z) {
    z(x,y)
};

const z = function(x, y) {

    console.log((x+y))

};

add(2,2,z);