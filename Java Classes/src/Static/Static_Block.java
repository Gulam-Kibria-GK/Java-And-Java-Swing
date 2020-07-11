package Static;

public class Static_Block {
    public static void main(String[] args) {
        block.printf();
    }
}

class block{
    static int id;
    static String name;
    static {
        id=101;
        name="kibria";
        
    }
    static void printf(){
        System.out.println(id);
        System.out.println(name);
    }
}