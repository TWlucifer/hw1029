import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.print.DocFlavor.STRING;

public class App_7 {
    public static void main(String[] args) throws Exception {
        System.out.println("��ܭ������u");
        System.out.println("��J���");

        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);
        char letter = (res==1)?'A':'B';

        System.out.println("�A���"+letter+"���u");
    }
}
