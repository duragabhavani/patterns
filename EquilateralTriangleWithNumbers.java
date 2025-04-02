import java.util.Scanner;
public class EquilateralTriangleWithNumbers {
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int rows=sc.nextInt();
       int cols=sc.nextInt();
       for(int i=0;i<=rows;i++)
       {
        for(int j=0;j<cols-i;j++)
        {
           System.out.print(" ");
        }
        for(int k=0;k<=i;k++){
            System.out.print((i+1)+" ");
        }       
        System.out.println();
       }
       
    }
}
