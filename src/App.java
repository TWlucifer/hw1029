import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("�п�J���");

        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        if (num==1) {
            System.out.println("��J1");
            System.out.println("���1");

        }
        System.out.println("�����B�z");
    }
}
