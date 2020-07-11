
package Constructor;

public class Overloading1 {
    public static void main(String[] args) {
        Overloading_Constructor ab = new Overloading_Constructor();
        ab.info();
        Overloading_Constructor bc = new Overloading_Constructor("kibria", 15);
        bc.info();
        Overloading_Constructor ca = new Overloading_Constructor("raza", "male", 19);
        ca.info();
    }
}
