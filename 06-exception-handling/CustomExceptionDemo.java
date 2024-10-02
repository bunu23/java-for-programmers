
public class CustomExceptionDemo {
    public static void checkValue(int value) throws CustomException {
        if (value < 0) {
            throw new CustomException("value cannot be negative " + value);
        } else {
            System.out.println("value is " + value);
        }
    }

    public static void main(String[] args) {
        try {
            checkValue(-10);
        } catch (CustomException e) {
            System.out.println("caught custom exception " + e.getMessage());
        }

        try {
            checkValue(12);
        } catch (CustomException e) {
            System.out.println("caught custom exception " + e.getMessage());
        }
    }

}
