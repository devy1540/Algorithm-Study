package 종합.출력하기007;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        int count = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] n = br.readLine().split(" ");
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            for(int i = 0; i < Integer.parseInt(n[0]); i++) {
                for(int j = 0; j < Integer.parseInt(n[1]); j++) {
                    for(int k = 0; k < Integer.parseInt(n[2]); k++) {
                        bw.write(i + " " + j + " " + k + "\n");
                        count++;
                    }
                }
            }
            bw.write(String.valueOf(count));
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
