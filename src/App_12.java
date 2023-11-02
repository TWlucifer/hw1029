import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.print.DocFlavor.STRING;

public class App_12 {
    public static void main(String[] args) throws Exception {
        System.out.println("請輸入迴圈數(1-10)");

        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 10; i++) {
            System.out.println("第"+i+"次處理");
            if (i==num) break;
        }
    }
}
