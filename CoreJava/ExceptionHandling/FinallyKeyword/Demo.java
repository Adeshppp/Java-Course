import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) throws Exception {
        int num = 0;
        BufferedReader br = null;

        // try catch finally
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            br.close();
        }

        // try with resources
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            num = Integer.parseInt(bfr.readLine());
            System.out.println(num);
        }
    }
}
