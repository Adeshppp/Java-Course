
public class Demo {
    public static void main(String[] args) {
        int i = 10;
        int j = 5;
        int k = 0;
        int[] nums = new int[6];
        String str = null;
        try {
            k = i / j;
            System.out.println(nums[1]);
            System.out.println(nums[5]);
            System.out.println(str.length());
        } catch (ArithmeticException e) {
            System.out.println("Can not divided by zero");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound exception");
        } catch (Exception e) {
            System.out.println("Something went wrong..." + e);
        } finally {
            System.out.println("Finally block");
        }
        System.out.println("result is " + k);

    }
}
