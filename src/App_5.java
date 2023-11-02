import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.print.DocFlavor.STRING;

public class App_5 {
    public static void main(String[] args) throws Exception {
        System.out.println("請輸入整數");

        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char letter = str.charAt(0);
        switch (letter) {
            case 'a':
                System.out.println("輸入a");
                break;
            case 'b':
                System.out.println("輸入b");
                break;
                default:
                System.out.println("輸入a OR b");
                break;
        }
    }
}
