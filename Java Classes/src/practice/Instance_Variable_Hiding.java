package practice;

public class Instance_Variable_Hiding {
    public static void main(String[] args) {
        box ab=new box(10,10,10);
        box bc=new box(10,30,20);
        
        ab.dis();
        bc.dis();
    }
}  

class box{
    double le,wi,dep;
    box(double le,double wi,double dep){
        this.le=le;
        this.wi=wi;
        this.dep=dep;
    }
    void dis(){
        System.out.println(le*wi*dep);
    }
}