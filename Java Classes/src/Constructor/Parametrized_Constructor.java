 package Constructor;

public class Parametrized_Constructor {

    public static void main(String[] args) {
        Op ab;//object declare
        ab = new Op("kibria", "male", 15);//object create
        //ab.info();
        ab.print();

        Op bc = new Op("raza", "male", 14);
        //  bc.info();
        bc.print();

    }

}

class Op {

    String name, gender;
    int age;

//    void info(String st,String st2,int a){
//        name=st;
//        gender=st2;
//        age=a;
//    }
    Op(String st, String st2, int a) {
        name = st;
        gender = st2;
        age = a;
    }

    void print() {
        System.out.println(name);
        System.out.println(gender);
        System.out.println(age);
        System.out.println();
    }
}
