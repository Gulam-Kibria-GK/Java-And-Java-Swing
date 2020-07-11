package Array;

import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {
        int[][] number = new int[2][3];
        int[][] number1 = new int[2][3];
        Scanner input=new Scanner(System.in);
        number[0][0] = 10;
        number[0][1] = 20;
        number[0][2] = 30;
        number[1][0] = 40;
        number[1][1] = 50;
        number[1][2] = 60;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                number1[i][j]=number[i][j];
                    System.out.print(number[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("new array :");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                number[i][j]=input.nextInt();
            }
        }
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                    System.out.print(number[i][j]+" ");
            }
            System.out.println("");
        }
        
        System.out.println("sum array :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                    System.out.print(number1[i][j]+number[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
