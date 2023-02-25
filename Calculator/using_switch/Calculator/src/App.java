import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        char operator; // -, +, *, /
        double num1, num2, result;


        //ask user to enter an operator 
        Scanner input = new Scanner(System.in);
        // reading from system in 
        System.out.println("Enter an operator: -, +, *, /");
        operator = input.next().charAt(0);

        //ask the user to inter the first and second nums 
        System.out.println("Enter first number");
        num1 = input.nextDouble(); 
        System.out.println("Enter second number");
        num2 = input.nextDouble();

        // using the switch method to do execute
        switch(operator) {
            case '+':
                result = num1 + num2;
                System.out.println(result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println(result);
            break;

            case '/':
                if (num2 != 0)
                {result = num1 / num2;}else{result = 0;}
                System.out.println(result);
            break;

            case '*':
            result = num1 * num2;
            System.out.println(result);
            break; 

            default:
            System.out.println("Invalid input");
            break; 

        }
        input.close();


    }
}
