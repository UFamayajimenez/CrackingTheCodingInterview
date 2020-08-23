package Other.Google;

import java.util.Scanner;

public class Height {

  static int solution(Integer[] A) {
      int largest = A[0];
      int numOfLines = 1;
      for(int i = 1; i < A.length; i++){
          if(A[i] >= A[i-1]){
              numOfLines++;
          }

      }
            return numOfLines;
  }

  public static void main(String[] args) {
      // Read from stdin, solve the problem, write answer to stdout.
      Scanner in = new Scanner(System.in);
      Integer[] A = {5, 4, 3, 6, 1};
      Integer[] B = {9, 12, 4, 4, 8, 9, 1, 2, 7, 3};

      System.out.print(solution(B));

        }




}
