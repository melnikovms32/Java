package by.gsu.mslab;

public class Subject{
    private String name;
    private Material material;
    private double volume;

    public Subject(){

    }

    public Subject(String name,Material material, double volume){
        this.name = name;
        this.volume = volume;
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getMass(){
        return material.getDENSITY() * volume;
    }

    @Override
    public String toString() {
        return name + ";" + material + ";" + volume + ";" + getMass();
    }
}
