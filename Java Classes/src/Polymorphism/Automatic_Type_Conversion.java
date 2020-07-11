package Polymorphism;

public class Automatic_Type_Conversion {
          public static void main(String[] args) {
        ove ab=new ove();
        ab.add();
        ab.add(10,10);
        ab.add(10,10,'3');
        ab.add(10.0,10.0);
        ab.add(10,'9');
    }
}

class ove{
    void add(double a,double b){
        System.out.println(a+b);
    }
    void add(int a,double b,int c){
        System.out.println(a+b-(c-48));
    }
    void add(int a,char b){
        System.out.println(a+(b-48));
    }
    void add(){
        System.out.println("no data");
    }
}
    

