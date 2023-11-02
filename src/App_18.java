import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.print.DocFlavor.STRING;

public class App_18 {
    public static void main(String[] args) throws Exception {
        int[] test={80,60,90,10,50};
        
        for (int i = 0; i < test.length; i++) {
            System.out.println("第"+(i+1)+"個人分數是"+test[i]);
        }
        System.out.println("考試人數為"+test.length+"人");        
    }
}
