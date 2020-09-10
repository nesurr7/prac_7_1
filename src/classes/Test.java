package classes;

public class Test {
    public static void main(String[] args) {
        Cup cup=new Cup("Дерево","Белый",20,5,2015);
        System.out.println(cup.toString());
        Plate plate=new Plate("Фарфор","Серый",24,3,"Asia");
        System.out.println(plate.toString());
    }
}
