
function createPerson(name, age,city="Unknown") {
    var person = new Object();

    //now we have an object that doesn't have any properties or behaviors

    //we can add properties dynmically
    person.name = name;
    person.age = age;
    person.city = city;

    person.eat = function (food) {
        console.log(`${this.name} is eating ${food}`);
    }

    person.move = function (from, to) {
        console.log(`${this.name} is moving from ${from} to ${to}`);
    }

    return person;

}


function teachDriving(person, vehicle) {
    //I may not add drive to person not of age.
    if(person.age<18){
        return console.log(`${person.name} is too young to learn driving`);
    }

    //if person already knows driving, we just add new licence
    if(person.licences && person.drive){
        person.licences.push(vehicle);
        return console.log(`${person.name} has learned to drive ${vehicle}`);
    }

    //teach driving from scratch
    person.licences = [vehicle];
    person.drive = function (veichle) {
        if(this.licences.includes(veichle)){
            console.log(`${this.name} is driving ${veichle}`);
        }else{
            console.log(`${this.name} is not licensed to drive ${veichle}`);
        }
    }

}


var vivek= createPerson("Vivek", 100);
var john= createPerson("John", 16);

teachDriving(vivek, "Car");
teachDriving(vivek, "Bike");
teachDriving(john, "Car");  


vivek.drive("Car"); //works
vivek.drive("Truck"); //not licensed. but drive behavior exists.
john.drive("Car"); //john doesn't have drive behavior.