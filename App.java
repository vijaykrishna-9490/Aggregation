class Pilot{
    String name;
    // constructor for name
    public Pilot(String name){
        this.name = name;
    }
    // method for fly
    void fly(){
        System.out.println("flying the plane");
    }

}

class Airlines {
    String airname;
    Pilot pilot;
    //constructor air lines
    public Airlines(String airname, Pilot pilot){
        this.airname = airname;
        this.pilot = pilot;

    }

    public void operate(){
        System.out.println(airname+"Operating");
        pilot.fly();
    }
}
public class App {
    public static void main(String[] args)
    {
        Pilot jhon = new Pilot("jhon");
        Airlines airlines = new Airlines("INdigo", jhon);
        airlines.operate();
        airlines = null;
        jhon.fly();  

    }
 
}