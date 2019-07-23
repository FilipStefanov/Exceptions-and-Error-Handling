import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      try {
          int n = Integer.parseInt(scanner.nextLine());
          System.out.println(Math.sqrt(n));
      }catch (IllegalArgumentException e){
          System.out.println("Invalid number");
      }finally {
          System.out.println("Good bye");
      }
    }
}
