package Constructor;

public class Overloading_Constructor {

    String name, gender;
    int age;

    Overloading_Constructor() {
        System.out.println("no information");
    }

    Overloading_Constructor(String st, int a) {
        name = st;
        age = a;
    }

    Overloading_Constructor(String st, String st2, int a) {
        name = st;
        gender = st2;
        age = a;
    }

    void info() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println();
    }
}
