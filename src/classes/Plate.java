package classes;

public class Plate extends Dish {

    private int radius;
    private int plateDepth;
    private String nameOfCollection;

    Plate()
    {
        radius=-1;
        plateDepth=-1;
        nameOfCollection="undefined";
    }

    Plate(String material , String color , int radius , int plateDepth , String nameOfCollection){
        this.nameOfCollection=nameOfCollection;
        this.plateDepth=plateDepth;
        this.radius=radius;
        this.color=color;
        this.material=material;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setNameOfCollection(String nameOfCollection) {
        this.nameOfCollection = nameOfCollection;
    }

    public void setPlateDepth(int plateDepth) {
        this.plateDepth = plateDepth;
    }

    public int getPlateDepth() {
        return plateDepth;
    }

    public int getRadius() {
        return radius;
    }

    public String getNameOfCollection() {
        return nameOfCollection;
    }

    @Override
    public String toString() {
        return "Параметры тарелки" +
                "\nРадиус тарелки:" + radius +
                "\nГлубина тарелки:" + plateDepth +
                "\nНазвание коллекции:" + nameOfCollection +
                "\nМатериал:" + material +
                "\nЦвет тарелки:" + color +
                "\n_________________";
    }

    public void crackPlate(){
        System.out.println("Тарелка треснула");
    }

    public void plateRolled(){
        System.out.println("Тарелка покатилась");
    }
}
