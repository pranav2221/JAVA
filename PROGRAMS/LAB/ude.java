class TooLongAdditionException extends Exception {
    public TooLongAdditionException(String message) {
        super(message);
    }
}
class NegativeAnswerException extends Exception {
    public NegativeAnswerException(String message) {
        super(message);
    }
}
class TooLongMultiplicationException extends Exception {
    public TooLongMultiplicationException(String message) {
        super(message);
    }
}
class Operation {
    public int add(int a, int b) throws TooLongAdditionException{
        if (a + b > 1000) {
          throw new TooLongAdditionException("Addition result is too long");
        }
        return a + b;
    }
    public int subtract(int a, int b) throws NegativeAnswerException {
        if (a - b < 0) {
            throw new NegativeAnswerException("Subtraction result is negative");
        }
        return a - b;
    }
    public int multiply(int a, int b) throws TooLongMultiplicationException {
        if (a * b > 5000) {
            throw new TooLongMultiplicationException("Multiplication result is too long");
        }
        return a * b;
    }
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
public class ude {
    public static void main(String[] args) {
        Operation op = new Operation();
        try {
            int result = op.add(300, 800);
            System.out.println("Addition result: " + result);
            result = op.subtract(300, 200);
            System.out.println("Subtraction result: " + result);
            result = op.multiply(20, 20);
            System.out.println("Multiplication result: " + result);
            result = op.divide(100, 2);
            System.out.println("Division result: " + result);
        } catch (TooLongAdditionException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NegativeAnswerException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (TooLongMultiplicationException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}