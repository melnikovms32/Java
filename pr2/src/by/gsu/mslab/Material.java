package by.gsu.mslab;

public class Material {
    private String name;
    public final double DENSITY;

    public Material(){
        this(null, 0);
    }

    public Material(String newName, double newDens){
        name = newName;
        DENSITY = newDens;
    }

    public String getName() {
        return name;
    }


    public String toString(){
        return name+";"+DENSITY;
    }
}
