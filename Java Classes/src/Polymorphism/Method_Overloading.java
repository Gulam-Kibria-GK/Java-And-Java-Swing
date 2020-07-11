package Polymorphism;

public class Method_Overloading {
    public static void main(String[] args) {
        over ab=new over();
        ab.add();
        ab.add(10,10);
        ab.add(10,10,10);
        ab.add(10.0,10.0);
        ab.add(10,'9');
    }
}

class over{
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(double a,double b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b-c);
    }
    void add(int a,char b){
        System.out.println(a+(b-48));
    }
    void add(){
        System.out.println("no data");
    }
}