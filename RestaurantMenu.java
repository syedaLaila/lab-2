import java.util.Scanner;

public class RestaurantMenu {
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Menu");
      System.out.println("1.Coffe - Rs.10");
      System.out.println("2.Tea - Rs.15");
      System.out.println("3.Samosa - Rs.20");
      System.out.println("4.Cold drink - Rs.25");
      System.out.println("5.Exit");
      System.out.print("Enter your choice: ");
      int choice = sc.nextInt();
      
      switch(choice) {
         case 1:
            System.out.println("Coffe - Rs.10");
            break;
         case 2:
            System.out.println("Tea - Rs.15");
            break;
         case 3:
            System.out.println("Samosa - Rs.20");
            break;
         case 4:
            System.out.println("Cold drink - Rs.25");
            break;
         case 5:
            System.exit(0);
         default:
            System.out.println("Invalid choice");
      }
      sc.close();
   }
}