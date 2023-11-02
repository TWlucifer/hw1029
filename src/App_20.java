import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import javax.print.DocFlavor.STRING;

public class App_20 {
    public static void main(String[] args) throws Exception {
        
        System.out.println("請輸入五個人的分數");

        Integer num[]= new Integer[5];
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }
        

        Arrays.sort(num,Collections.reverseOrder());

        for (int i = 0; i < num.length; i++) {
            System.out.println("第"+(i+1)+"名的分數是"+num[i]);
        }
    }
}
