import java.util.Scanner;
 public class IT24103815Lab5Q2 {
    public static void main(String[]args)
   {
    //Create an object called scanner to Scanner class
    Scanner scanner = new Scanner(System.in);
   
    // Prompt user to enter the number of new members introduced: ");
    System.out.print("Enter the number of new members introduced: ");
    int newMembers = scanner.nextInt();
  
    // Validate the input
    if (newMembers < 0)
    {
     System.out.println("Input must be a number 0 or greater");
    } else {
       // Check the prize 
       switch (newMembers) {
           case 0:
              System.out.println("No prize");
              break;
           case 1:
              System.out.println("Prize is a : Pen");
              break;
           case 2:
              System.out.println("Prize is a : Umbrella");
              break;
           case 3:
              System.out.println("Prize is a : Bag");
              break;
           case 4: 
              System.out.println("Prize is a : Travelling Chair"); 
              break; 
           default: 
              System.out.println("Prize is a : Headphone"); 
              break;
   }
}
 // Close the scanner
 scanner.close();
}
}