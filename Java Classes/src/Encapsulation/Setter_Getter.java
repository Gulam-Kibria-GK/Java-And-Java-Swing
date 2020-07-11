package Encapsulation;

public class Setter_Getter {
    public static void main(String[] args) {
        parson ab=new parson();
        ab.setAge(17);
        ab.setName("Kibria");
        ab.getName();
        ab.getAge();
        ab.dis();
    }
}

class parson{
    private String name;
   private int age;

    public String getName(){
        return name;
    }

    public void setName(String na) {
        name = na;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int ag) {
        age = ag;
    }
    
   
    void dis(){
        System.out.println(name);
        System.out.println(age);
    }
}