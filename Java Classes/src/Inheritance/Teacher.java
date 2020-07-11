package Inheritance;

public class Teacher {
    public static void main(String[] args) {
        teacher1 ab=new teacher1();
        ab.name="Kibria";
        ab.age=19;
        ab.qu="BSC in CSE";
        ab.dis2();
        System.out.println();
        teacher1 bc=new teacher1();
        bc.name="raza";
        bc.age=18;
        bc.qu="BSC in CSE";
        bc.dis2();
        
    }
}


class teacher1 extends person{
    //name,age,dis()//
    String qu;
    void dis2(){
        dis();
        System.out.println(qu);
    }
}
class person{
    String name;
    int age;
    void dis(){
        System.out.println(name);
        System.out.println(age);
    }
}