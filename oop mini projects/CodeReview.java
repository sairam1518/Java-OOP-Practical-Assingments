
public class CodeReview {

    public static void main(String[] args) {

        int firstNumber = 10;
        int secondNumber = 20;

        int sum = calculateSum(firstNumber, secondNumber);

        displayResult(sum);
    }

    // Calculates the sum of two numbers
    static int calculateSum(int a, int b) {
        return a + b;
    }

    // Displays the result
    static void displayResult(int result) {
        System.out.println("Sum: " + result);
    }
}
