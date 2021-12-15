import java.util.Scanner;

public class TaskFour {
  static GaussMethod Gauss = new GaussMethod();
  static Scanner input = new Scanner(System.in);
  public static void main(String[] args){
      int n = input.nextInt();
      int m = input.nextInt();
      double[][] matrix = new double[n][m];
      in(matrix);
      Gauss.Gauss(matrix);

  }
  public static void in(double[][] matrix){

      for (int i = 0; i < matrix.length; i++) {
          for (int j = 0; j < matrix.length; j++){
              matrix[i][j] = input.nextDouble();
          }
      }
  }

}
