package Array;

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        int [] arr={-2,30,2,5,8,97};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[5-i]+" ");
        }
    }
}
