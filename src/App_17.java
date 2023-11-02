import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.print.DocFlavor.STRING;

public class App_17 {
    public static void main(String[] args) throws Exception {
        int[] test={80,60,90,10,50};
        
        for (int i = 0; i < 5; i++) {
            System.out.println("第"+(i+1)+"個人分數是"+test[i]);
        }
    }
}
