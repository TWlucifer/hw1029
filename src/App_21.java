import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

import javax.print.DocFlavor.STRING;

public class App_21 {
    public static void main(String[] args) throws Exception {
        int[][] test= new int[2][5];
        
        Random random = new Random();

        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[0].length; j++) {
                test[i][j]=random.nextInt(101);
            }
        }

        for (int i = 0; i < test[1].length; i++) {
            System.out.println("第"+(i+1)+"個人國語分數是"+test[0][i]);
            System.out.println("第"+(i+1)+"個人數學分數是"+test[1][i]);    
        }
    }
}
