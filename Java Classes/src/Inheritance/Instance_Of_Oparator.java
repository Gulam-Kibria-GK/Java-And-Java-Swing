package Inheritance;

public class Instance_Of_Oparator {
    public static void main(String[] args) {
        animal a=new animal();
        parson p=new parson();
        teacher3 t=new teacher3();
        
        System.out.println(a instanceof animal);
        System.out.println(p instanceof parson);
        System.out.println(t instanceof teacher3);
        System.out.println(p instanceof animal);
        System.out.println(t instanceof animal);
        System.out.println(t instanceof parson);
        System.out.println(a instanceof parson);
        System.out.println(p instanceof teacher3);
        System.out.println(a instanceof teacher3);
    }
}

class parson extends animal{
    
}

class animal{
    
}
class teacher3 extends parson{
    
}