
 
import java.util.Scanner;



public class  act2.java{

   
    public static void main(String[] args) {
         
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter the First Number:");
      int num1 = input.nextInt();
      System.out.print("Enter the Second Number:");
      int num2 = input.nextInt();
      System.out.print("Enter the Third Number:");
      int num3 = input.nextInt();
      
      int greatest = num1;
      
      if (num2 > greatest) {
          greatest = num2;
      if (num3 > greatest) {
          greatest = num3;
      }   
      }

      
            System.out.print(" The greatest number is :" + greatest);
            input.close();
    }
    
}

    

 





