public class GaussMethod {
    public static double[] Gauss(double[][] matrix){
        double[][] matrixClone = new double[matrix.length][matrix.length+1];
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++){
                matrixClone[i][j] = matrix[i][j];
            }
        }
        for (int k = 0; k < matrix.length; k++){
            for (int i = 0; i < matrix.length+1; i++) {
                matrixClone[k][i] = matrixClone[k][i]/ matrix[k][k];
            }
            for (int i = k+1; i < matrix.length ; i++) {
                double num = matrixClone[i][k]/matrixClone[k][k];
                for (int j = 0; j < matrix.length + 1; j++){
                    matrixClone[i][j] = matrixClone[i][j] - matrixClone[k][j]*num;
                }
            }
            for (int i = 0; i <= matrix.length; i++) {
                for (int j = 0; j <= matrix.length + 1;j++){
                    matrix[j][i] = matrixClone[j][i];
                }
            }
        }
        for (int k = matrix.length - 1; k > -1; k--){
            for (int i = matrix.length; i > -1; i--){
                matrixClone[k][i] = matrixClone[k][i]/matrix[k][k];
            }
            for (int i = k -1; i > -1; i--){
                double num = matrixClone[i][k]/matrixClone[k][k];
                for (int j = matrix.length; j > -1; j--){
                    matrixClone[i][j] = matrixClone[i][j] - matrixClone[k][k];
                }
            }
        }
        double[] answer = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            answer[i] = matrixClone[i][matrix.length];
        }
        return answer;
    }
    public static double[] GaussTwo(double[][] matrix){
        double[][] matrixClone = new double[matrix.length][matrix.length+1];
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++){
                matrixClone[i][j] = matrix[i][j];
            }
        }
        for (int k = 0; k < matrix.length; k++){
            for (int i = 0; i < matrix.length+1; i++) {
                matrixClone[k][i] = matrixClone[k][i]/ matrix[k][k];
            }
            for (int i = k+1; i < matrix.length ; i++) {
                double num = matrixClone[i][k]/matrixClone[k][k];
                for (int j = 0; j < matrix.length + 1; j++){
                    matrixClone[i][j] = matrixClone[i][j] - matrixClone[k][j]*num;
                }
            }
            for (int i = 0; i <= matrix.length; i++) {
                for (int j = 0; j <= matrix.length + 1;j++){
                    matrix[j][i] = matrixClone[j][i];
                }
            }
        }
        for (int k = matrix.length - 1; k > -1; k--){
            for (int i = matrix.length; i > -1; i--){
                matrixClone[k][i] = matrixClone[k][i]/matrix[k][k];
            }
            for (int i = k -1; i > -1; i--){
                double num = matrixClone[i][k]/matrixClone[k][k];
                for (int j = matrix.length; j > -1; j--){
                    matrixClone[i][j] = matrixClone[i][j] - matrixClone[k][k];
                }
            }
        }
        double[] answer = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            answer[i] = matrixClone[i][matrix.length];
        }
        return answer;
    }
}
