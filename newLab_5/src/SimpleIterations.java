//taskOne
import static java.lang.Math.*;
public class SimpleIterations {
    public static double[] Simple(double a, double b, double e){
        double answer[] = new double[2];
        double x0 = (a+b)/2;
        double x = function(x0);
        double k = 0;
        while (abs(x - x0) < e){
            x0 = x;
            x = function(x);
            k++;
        }
        answer[0] = x;
        answer[1] = k;
        return answer;
    }
    public static double function(double x){
        return sqrt(cos(x)/sin(x));
    }

}
