package by.gsu.mslab;

public class Material {
    private String material;
    private double DENSITY;

    public Material(){

    }

    public Material(String material, double DENSITY){
        this.material = material;
        this.DENSITY = DENSITY;
    }

    public double getDENSITY() {
        return DENSITY;
    }

    public void setDENSITY(double DENSITY) {
        this.DENSITY = DENSITY;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String toString(){
        return material + ";" + DENSITY;
    }
}
