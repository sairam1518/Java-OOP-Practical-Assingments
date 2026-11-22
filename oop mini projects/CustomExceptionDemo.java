
class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}

class Voting {

    void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("You are not eligible to vote!");
        } else {
            System.out.println("You are eligible to vote!");
        }
    }
}

public class CustomExceptionDemo {

    public static void main(String[] args) {

        Voting v = new Voting();

        try {
            v.checkAge(16);
        }
        catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        finally {
            System.out.println("Voting eligibility check completed.");
        }
    }
}
