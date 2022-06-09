package junsuk5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algo1 {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    System.out.println(resolve(N));
  }

  public static StringBuilder resolve(int N) throws IOException {
    // BufferedReader 중복??
    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder("Hello ");
    String comma = ",";
    for (int i = 0; i < N; i++) {
      if (i == N - 1) {
        comma = ".";
      }
      sb.append(br1.readLine() + comma);
    }
    return sb;
  }
}
