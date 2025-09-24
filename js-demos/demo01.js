
var vivek = new Object();

//now we have an object that doesn't have any properties or behaviors

//we can add properties dynmically
vivek.name = "Vivek";
vivek.age = 100;
vivek.city = "Bangalore";

vivek.eat=function(food){
    console.log(`${this.name} is eating ${food}`);
}

vivek.move=function(from, to){
    console.log(`${this.name} is moving from ${from} to ${to}`);
}

vivek.eat("Lunch");
vivek.move("Home", "Office");