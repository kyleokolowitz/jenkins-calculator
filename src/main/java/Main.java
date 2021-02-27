import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Calculator calc = new Calculator();
    String input = "";

    System.out.println("\nWelcome to my calculator!");
    System.out.println("Enter a command:");

    while (!input.equals("quit")) {
      
      input = scanner.nextLine();
      String[] arguments = input.split(" ");

      switch(arguments[0]) {
        case "add":
          System.out.println(calc.add(Integer.parseInt(arguments[1]), Integer.parseInt(arguments[2])));
          break;

        case "subtract":
          System.out.println(calc.subtract(Integer.parseInt(arguments[1]), Integer.parseInt(arguments[2])));
          break;

        case "multiply":
          System.out.println(calc.multiply(Integer.parseInt(arguments[1]), Integer.parseInt(arguments[2])));
          break;

        case "divide":
          System.out.println(calc.divide(Integer.parseInt(arguments[1]), Integer.parseInt(arguments[2])));
          break;
        
        case "fibonacci":
          System.out.println(calc.fibonacciNumberFinder(Integer.parseInt(arguments[1])));
          break;
        
        case "binary":
          System.out.println(calc.intToBinaryNumber(Integer.parseInt(arguments[1])));
          break;
        
        case "quit":
          break;

        default:
          System.out.println("Invalid command!");
      }
      System.out.println();
    }

    scanner.close();
  }

}
