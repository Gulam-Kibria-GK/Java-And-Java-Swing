package practice;

public class Oop {

    String name, gender;
    int age;
    void info(String st,String st2,int a){
       name=st;
       gender=st2;
       age=a;
   }
//    Oop(String st, String st2, int a) {
//        name = st;
//        gender = st2;
//        age = a;
//    }

    void print() {
        System.out.println(name);
        System.out.println(gender);
        System.out.println(age);
        System.out.println();
    }
}
