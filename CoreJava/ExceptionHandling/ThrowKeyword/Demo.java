
class CustomException extends Exception {
    CustomException(String str) {
        super(str);
    }
}

public class Demo {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 10 / i;
            if (j < i)
                throw new CustomException("Not valid operation");

        } catch (CustomException e) {
            j = 10 / 1;
            System.out.println("Can not divided by zero " + e);

        } catch (Exception e) {
            System.out.println("Something went wrong..." + e);

        }
        System.out.println(j);

    }
}
