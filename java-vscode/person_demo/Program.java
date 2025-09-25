class Program{

    public static void main(String[] args) {

        var dashrath= new Person("Dashrath");
        var ram= new Person("Ram");
        var laxman= new Person("Laxman");
        var bharat= new Person("Bharat");
        var shatrughn= new Person("Shatrughna");
        var sita = new Person("Sita");
        var hanuman = new Person("Hanuman");

        ram.addRelation("father", dashrath);
        ram.addRelation("wife", sita);
        ram.addRelation("brother", laxman);
        ram.addRelation("brother", bharat);
        ram.addRelation("brother", shatrughn);
        ram.addRelation("friend", hanuman);

        for(var brother: ram.getRelationsByType("friend")){
            System.out.println(brother.name);
        }

    }

    static void badCode(){
        //  Person person = new Person("John");
        
        // person.eat("pizza");

        // Father mike = new Father("Mike");
        // Father ram = new Father("Ram");
        // mike.work("engineer");
        // System.out.println(mike.jack);
        // System.out.println(fam.jack);

        // Son shyam= new Son("Shyam");
    }
}