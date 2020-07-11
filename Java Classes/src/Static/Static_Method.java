package Static;

public class Static_Method {
    public static void main(String[] args) {
        sm sb=new  sm();
        sb.dis();
        sm.dis1();
    }
}

class sm{
    
    int a=10;
    
    void dis(){
        
        System.out.println("not static");
    }
   static void dis1(){
       //dis();  static can't use non_static mathod
       //System.out.println(a);  static can't use non_static mathod
         System.out.println("static");
    }
}