import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.print.DocFlavor.STRING;

public class App_12 {
    public static void main(String[] args) throws Exception {
        System.out.println("�п�J�j���(1-10)");

        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 10; i++) {
            System.out.println("��"+i+"���B�z");
            if (i==num) break;
        }
    }
}
