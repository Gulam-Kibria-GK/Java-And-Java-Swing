package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        List<String> st=new ArrayList();
        st.add("kibria");
        st.add("abid");
        st.add("arif");
        st.add("nayem");
        st.add("hamja");
        st.add("seym");
        st.add("sofik");
        st.add("korim");
        Collections.sort(st);
        
        for(String x :st)
        {
            System.out.print(x+" ");
        }
        
        System.out.println("");
    }
}
