import java.util.ArrayList;


public class Person{
    String name;

    ArrayList<Relation> relations=new ArrayList<Relation>();

    public void addRelation(String type, Person person){
        Relation relation = new Relation(type, person);
        this.relations.add(relation);
    }

    public ArrayList<Person> getRelationsByType(String type){
        ArrayList<Person> persons = new ArrayList<Person>();
        for(Relation relation : this.relations){
            if(relation.getType().equals(type)){
                persons.add(relation.getPerson());
            }
        }
        return persons;
    }

    public Person(String name){
        this.name = name;
    }

    public void eat(String food){
        System.out.println(this.name + " is eating " + food);
    }   
}

