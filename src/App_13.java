import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.print.DocFlavor.STRING;

public class App_13 {
    public static void main(String[] args) throws Exception {
        System.out.println("�п�J�n���L���j���(1-10)");

        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 10; i++) {
            if (i==num) continue;
            System.out.println("��"+i+"���B�z");
        }
    }
}
