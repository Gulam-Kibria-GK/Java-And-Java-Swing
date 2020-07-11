/*******
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 ********/

package Array;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        int [][] number=new int[4][];
        Scanner input=new Scanner(System.in);
        
        //array col.. size decliar before...
        
        
        number[0]=new int[1];
        number[1]=new int[2];
        number[2]=new int[3];
        number[3]=new int[4];
        System.out.println("enter 10 data :");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                number[i][j]=input.nextInt();
            }
        }
        
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                System.out.print(number[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
