import java.util.Scanner;
public class ReverseTriangle{
      public static void main(String arg[])
      {
          Scanner sc=new Scanner(System.in);
          int row=sc.nextInt();
          for(int i=row;i>0;i--)
          {
            for(int j=i;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
          }
      }
}