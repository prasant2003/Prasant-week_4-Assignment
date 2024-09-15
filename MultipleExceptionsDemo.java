// Custom exception class
package Assignment4;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class MultipleExceptionsDemo {

    
    public static void checkValue(int value) throws CustomException {
        if (value < 0) {
            throw new CustomException("Value cannot be negative");
        }
    }

    public static void main(String[] args) {
        try {
            // Example 1: NullPointerException
            String str = null;
            System.out.println(str.length());  // This will throw NullPointerException
            
            
            int result = 10 / 0; // This will throw ArithmeticException
            
           
            checkValue(-1); // This will throw CustomException

        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
            e.printStackTrace();
        } catch (CustomException e) {
            System.out.println("Caught a CustomException: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            
            System.out.println("Caught a general exception: " + e.getMessage());
            e.printStackTrace();
        } finally {
            
            System.out.println("Execution completed.");
        }
        
    }
}
