import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.print.DocFlavor.STRING;

public class App_19 {
    public static void main(String[] args) throws Exception {
        
        System.out.println("�п�J���ӤH������");

        int num[]= new int[5];
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }
        

        for (int s = 0; s < num.length ; s++) {
           for (int i = s+1; i < num.length; i++) {
                if (num[i]>num[s]) {
                    int temp = num[i];
                    num[i] = num[s];
                    num[s] = temp;
                }
           }
        }

        for (int i = 0; i < num.length; i++) {
            System.out.println("��"+(i+1)+"�W�����ƬO"+num[i]);
        }
    }
}
