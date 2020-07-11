package Inheritance;

public class Inheriting_Private {

    public static void main(String[] args) {

        teacher ab = new teacher();
        ab.setName("Kibria");
        ab.setAge(18);
        ab.setQu("BSC IN CSE");
        ab.dis();
    }
}

class teacher extends person1 {
    //getname,getage//
    //setname,steage//
     private String qu;

    public String getQu() {
        return qu;
    }

    public void setQu(String qu) {
        this.qu = qu;
    }
     
    void dis() {
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getQu());
    }

}

class person1 {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
