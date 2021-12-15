//taskOne
public class Newton {
    static Function func = new Function();
    static Derivative der = new Derivative();
    public static double[] Newton(double a,double b, double e){
        double answer[] = new double[2];
        double x0 = a;
        double xk = a - func.Function(a)/der.Derivative(a);
        double k = 0; //счетчик
        while(Math.abs(xk - x0) < e){
            x0 = xk;
            xk = xk - func.Function(x0)/der.Derivative(x0);
            k++;
        }
        answer[0] = xk;
        answer[1] = k;
        return answer;
    }
}
