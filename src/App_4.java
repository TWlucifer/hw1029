import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App_4 {
    public static void main(String[] args) throws Exception {
        System.out.println("�п�J���");

        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        if (num==1) System.out.println("��J1");
        else if(num == 2) System.out.println("��J2");
        else System.out.println("��J1 OR 2");
    }
}
