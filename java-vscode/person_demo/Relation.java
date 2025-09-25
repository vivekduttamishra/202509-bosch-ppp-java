public class Relation{
    String type;
    Person person;

    public Relation(String type, Person person){
        this.type = type;
        this.person = person;
    }

    @Override
    public String toString(){
        return this.type + ": " + this.person.name;
    }

    //getter-setter
    public String getType(){
        return this.type;
    }
    public Person getPerson(){
        return this.person;
    }
}