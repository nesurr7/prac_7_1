package classes;

public class Cup extends Dish{
    private int cupDepth;
    private int yearOfProd;
    private int sizeOfCup;

    Cup(){
        cupDepth=-1;
        yearOfProd=-1;
        sizeOfCup=-1;
    }

    Cup(String material , String color , int cupDepth , int sizeOfCup , int yearOfProd){
        this.sizeOfCup=sizeOfCup;
        this.yearOfProd=yearOfProd;
        this.cupDepth=cupDepth;
        this.color=color;
        this.material=material;
    }

    public void setCupDepth(int cupDepth) {
        this.cupDepth = cupDepth;
    }

    public void setSizeOfCup(int sizeOfCup) {
        this.sizeOfCup = sizeOfCup;
    }

    public void setYearOfProd(int yearOfProd) {
        this.yearOfProd = yearOfProd;
    }

    public int getCupDepth() {
        return cupDepth;
    }

    public int getYearOfProd() {
        return yearOfProd;
    }

    public int getSizeOfCup() {
        return sizeOfCup;
    }

    @Override
    public String toString() {
        return "Параметры Кружки:"+
                "\nГлубина кружки:" + cupDepth +
                "\nГод производства:" + yearOfProd +
                "\nРазмер кружки:" + sizeOfCup +
                "\nМатериал:" + material +
                "\nЦвет:" + color +
                "\n______________";
    }

    public void moveCup(){
        System.out.println("Чашка двинулась с места");
    }

    public void jumpCup(){
        System.out.println("Чашка прыгнула в сторону посуды");
    }
}
