
//BAD DESIGN: NO ONE IS ABSOLUTE SON.
public class Son extends Person{
    
    public Son(String name){
        super(name);
    }

    public void play(String game){
        System.out.println(this.name + " is playing " + game);
    }
}