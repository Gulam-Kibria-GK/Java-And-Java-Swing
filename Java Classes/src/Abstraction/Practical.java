 package Abstraction;

public class Practical {
    public static void main(String[] args) {
        mob ab;
        ab=new rahim();
        ab.sm();
        ab.call();
        ab=new karim();
        ab.sm();
        ab.call();
    }
}
 
abstract class mob{
    abstract void sm();
    void call(){
        System.out.println("call");
    }
}
class rahim extends mob{
    void sm(){
        System.out.println("My name is palash");
    }
}
class karim extends mob{
    void sm(){
        System.out.println("My name is palash2");
}
}
