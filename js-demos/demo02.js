
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

var vivek = createPerson("Vivek", 100);
vivek.eat("Lunch");
vivek.move("Home", "Office");

var john = createPerson("John", 15);
john.eat("Breakfast");
john.move("School", "Home");