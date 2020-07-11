
package Static;

public class part3 {
    public static void main(String[] args) {
        st s1=new st();
        s1.print();
        st s2=new st();
        s2.print();
        st s3=new st();
        s3.print();
    }
}

class st{
    static  int c=0;
    st(){
        c++;
    }
    void print(){
        System.out.println(c);
    }
}