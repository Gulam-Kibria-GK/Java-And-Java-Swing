package Static;

public class Part1 {
    public static void main(String[] args) {
        student ab=new student("Kibria",33);
        ab.print();
        student ab2=new student("raza",34);
        ab2.print();
    }
}

class student{
    String name;
    int id;
    static String university="NEUB";

    student(String st,int a){
        name=st;
        id=a;
    }

    
    
    void print(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(university);
        
    }
    
}