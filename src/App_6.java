import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.print.DocFlavor.STRING;

public class App_6 {
    public static void main(String[] args) throws Exception {
        System.out.println("�O�_���k��");

        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char letter = str.charAt(0);
        if (letter == 'Y' || letter == 'y') {
            System.out.println("�O�k��");
        }
        else if (letter=='N'||letter=='n') {
            System.out.println("�O�k��");
        }
        else  System.out.println("�԰����ɾ�");
    }
}
