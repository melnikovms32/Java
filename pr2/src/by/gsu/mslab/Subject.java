package by.gsu.mslab;

public class Subject{
    private String subjName;
    private Material material;
    private double volume;

    public Material getMaterial() {
        return material;
    }

    public Subject(){

    }

    public Subject(String newName,Material newMaterial, double newVolume){
        subjName = newName;
        volume = newVolume;
        material = newMaterial;
    }

    public String getName() {
        return subjName;
    }

    public void setName(String name) {
        this.subjName = name;
    }


    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public double getMass(){
        return material.DENSITY * volume;
    }

    @Override
    public String toString() {
        return subjName + ";" + material + ";" + volume + ";" + getMass();
    }
}
