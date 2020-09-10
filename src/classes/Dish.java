package classes;

public abstract class Dish {

    protected String material;
    protected String color;

    Dish(){
        material="undefined";
        color="undefined";
    }

    Dish(String material , String color){
        this.material=material;
        this.color=color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }


    @Override
    public abstract String toString();
}
