package practice;

public class Return_method {
    public static void main(String[] args) {
    ret ab = new ret();
    int x = ab.mul(5);
    System.out.println(x);
    int y = ab.mul(6);
    System.out.println(y);
    }
    
} 

class ret {

    int mul(int a) {
        return a * a;
    }
}
