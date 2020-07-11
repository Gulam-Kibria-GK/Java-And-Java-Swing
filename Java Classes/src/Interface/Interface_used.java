 
package Interface;

public class Interface_used {
    public static void main(String[] args) {
        dog ab=new dog();
        ab.eat();
        cat bc=new cat();
        bc.eat();
    }
}

interface animal{
    void eat();
}
class dog implements animal{
    public void eat(){
        System.out.println("dogssssssssssss");
    }
    
}
class cat implements animal{
    public void eat(){
        System.out.println("cattttttttttttt");
    }
    
}