
//...........****************..........
console.log('....Assignment 1.....')

//Empty Array
 let fruits=[];
//add Fruits  to the array
fruits.push('apple','banana','orange')

//Remove first fruit
fruits.splice(0,1)

//add fruit at the end off array
fruits.push('grapes');

//update second fruit in the array
fruits[1]='pear';
console.log(fruits)

//...........****************..........

console.log('....Assignment 2.....')
//Empty Object
let person={};
//add properties in object
 person={
    name : "john",
    age: 30,
    city : "New York"
}
//Remove age property of object
delete person.age;

//add a new property of object
person.job = 'Engineer'

//update property of object
person.city='San Francisco'
console.log(person)

//...........****************..........

console.log('....Assignment 3.....')
//creating an array and add objects to the array
let cars=[
    { make: "Toyota",model:"Camry",year:2018},
    { make: "maruti",model:"maruti alto",year:2019},
    { make: "Tata motors",model:"tata nexon",year:2017}
 ];

 //remove the first object
cars.shift()
console.log(cars)
//add new object
cars.push({make: "Honda",model:"Civic",year:2020});
console.log(cars)

//update property
cars[1].model="Accord";
console.log(cars)

      

    












