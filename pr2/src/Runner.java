import by.gsu.mslab.Material;
import by.gsu.mslab.Subject;

public class Runner {
    public static void main(String[] args){
        Material steel = new Material("steel",7850.0);
        Material cooper = new Material("copper", 8500);
        Subject wire = new Subject("wire", steel, 0.03);

        System.out.println(wire.toString());

        wire.setMaterial(cooper);
        System.out.println("Copper wire's mass is " + wire.getMass());

        wire.setMaterial(steel);
        System.out.println(wire.toString());
    }
}
