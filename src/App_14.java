import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.print.DocFlavor.STRING;

public class App_14 {
    public static void main(String[] args) throws Exception {
        int[] test;
        test = new int[5];

        test[0]=80;
        test[1]=60;
        test[2]=22;
        test[3]=50;
        test[4]=90;

        for (int i = 0; i < 5; i++) {
            System.out.println("第"+(i+1)+"個人分數是"+test[i]);
        }
    }
}
