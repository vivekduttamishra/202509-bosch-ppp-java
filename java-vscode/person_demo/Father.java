
//BAD DESIGN. THERE SHOULD BE NO FATHER CLASS

public class Father extends Person{
    
    
    //BAD DESIGN: ALL FATEHRS OF THE WORLD HAVE SONS JACK AND MAC
    Son jack;
    Son mac;
    
    public Father(String name){
        super(name);
    }

    public void work(String job){
        System.out.println(this.name + " is working as a " + job);
    }
}