import java.util.Scanner;

public class IT24103815Lab5Q1 {
        public static void main(String[]args)
        {
          //Create an object called scanner to scanner class
          Scanner scanner = new Scanner (System.in);
       
          // prompt user to enter the first integer
          System.out.print("Enter the first integer:");
          int num1 = scanner.nextInt();

          // prompt user to enter the second integer 
          System.out.print("Enter the second integer:");
          int num2 = scanner.nextInt();
 
          // prompt user to enter the third integer 
          System.out.print("Enter the third integer:");
          int num3 = scanner.nextInt();
           
          // Initialize vatiables
          int smallest, largest;
         
          // Determine the smallest integer
          if (num1 <= num2 && num1 <= num3)
           {
             smallest = num1;
          } else if (num2<= num1 && num2<= num3)
           {
             smallest = num2;
          } else 
           {
             smallest = num3;
          }

          // Determine the largest integer
          if (num1 >= num2 && num1>= num3) 
           {
            largest = num1;
          } else if (num2>= num1 && num2>= num3)
           {
            largest = num2;
          } else 
           {
            largest = num3;
          }
          
          System.out.println( );

          // Display the entered numbers 
          System.out.println("User entered numbers are : " + num1 + " " + num2 + " " + num3 );
          
          // Display the result
          System.out.println("The smallest integer is: " + smallest);
          System.out.println("The largest integer is: " + largest);
   
          // close the scanner
          scanner.close();
     }
  }