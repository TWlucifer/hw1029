import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

import javax.print.DocFlavor.STRING;

public class App_15 {
    public static void main(String[] args) throws Exception {
        int[] arr = (int[])Array.newInstance(int.class, 3);

        Array.set(arr, 0, 123);
        Array.set(arr, 1, 456);
        Array.set(arr, 2, 789);
        
        System.out.println("arr[0]="+Array.get(arr,0));
        System.out.println("arr[1]="+Array.get(arr,1));
        System.out.println("arr[2]="+Array.get(arr,2));
    }
}
