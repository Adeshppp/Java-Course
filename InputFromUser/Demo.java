import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws Exception {
        // System.out.print("enter a number : ");
        // buffer reader
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        // int num = Integer.parseInt(bf.readLine());
        // bf.close();
        // System.out.println(" BufferedReade : Entered Number is " + num);

        System.out.print("enter another number :  ");
        // Scanner class
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println("Scanner :Entered Number is " + number);

    }
}
