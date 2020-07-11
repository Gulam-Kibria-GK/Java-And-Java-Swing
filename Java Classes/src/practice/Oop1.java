package practice;

public class Oop1 {

    public static void main(String[] args) {
        Oop ab;//object declare
        ab = new Oop();//object create
        ab.name = "kibria";
        ab.gender = "male";
        ab.age = 15;
        System.out.println(ab.name);
        System.out.println(ab.gender);
        System.out.println(ab.age);
        System.out.println();

        Oop bc = new Oop();
        bc.name = "raza";
        bc.gender = "male";
        bc.age = 14;
        System.out.println(bc.name);
        System.out.println(bc.gender);
        System.out.println(bc.age);
        System.out.println();

    }

}
