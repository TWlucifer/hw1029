import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.print.DocFlavor.STRING;

public class App_5 {
    public static void main(String[] args) throws Exception {
        System.out.println("�п�J���");

        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char letter = str.charAt(0);
        switch (letter) {
            case 'a':
                System.out.println("��Ja");
                break;
            case 'b':
                System.out.println("��Jb");
                break;
                default:
                System.out.println("��Ja OR b");
                break;
        }
    }
}
