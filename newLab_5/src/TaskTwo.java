import java.util.Scanner;

public class TaskTwo {
    static Scanner input = new Scanner(System.in);
    static FunctionTwo func = new FunctionTwo();
    static ViewTwo view = new ViewTwo();
    public static void main(String[] args){
        double xi = input.nextDouble();
        double[] h = {1, 0.1, 0.01, 0.001, 0.0001, 0.00001,0.000001, 0.0000001, 0.00000001 };
        for (int i = 0; i < h.length; i++) {
            double y_left = func.Function(xi - h[i]);
            double y_rigth = func.Function(xi + h[i]);
            double yi = func.Function(xi);
            double y = (y_rigth - y_left)/2*h[i];
            double left = (yi - y_left)/h[i];
            double right = (y_rigth - yi)/h[i];
            view.View(left, right, y, h[i]);

        }
    }
}
