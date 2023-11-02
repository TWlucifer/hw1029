import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.print.DocFlavor.STRING;

public class App_6 {
    public static void main(String[] args) throws Exception {
        System.out.println("是否為男生");

        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char letter = str.charAt(0);
        if (letter == 'Y' || letter == 'y') {
            System.out.println("是男生");
        }
        else if (letter=='N'||letter=='n') {
            System.out.println("是女生");
        }
        else  System.out.println("戰鬥直升機");
    }
}
