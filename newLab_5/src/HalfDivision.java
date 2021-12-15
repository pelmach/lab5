//taskOne
public class HalfDivision {
    static Function f = new Function();
    public static double [] halfDivivison(double a, double b, double e){
        double answer[] = new double[2];
        double c = (a+b)/2;
        int k = 0; //счетчик
        while(Math.abs(b-a) >= e){
            if(f.Function(a)*f.Function(b) < 0){
                b = c;
            }else{
                a = c;
            }
            c = (a+b)/2;
            k++;
        }
        answer[0] = c;
        answer[1] = k;
        return answer;
    }
}
