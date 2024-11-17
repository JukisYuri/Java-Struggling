package YourselfLearning.Hackerrank;

import java.io.*;

public class loops {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nhập số bất kì: ");
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i=1; i<=10; i++){
            int result = N*i;
            System.out.println(N + "*" + i + "=" + result);
        }
        bufferedReader.close();
    }
}