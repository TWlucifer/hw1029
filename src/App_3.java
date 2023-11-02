import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App_3 {
    public static void main(String[] args) throws Exception {
        System.out.println("請輸入整數");

        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        if (num==1) System.out.println("輸入1");
        else System.out.println("選擇1以外的數字");
    }
}
