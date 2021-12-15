import java.util.Scanner;

public class taskOne {
    static Scanner input = new Scanner(System.in);
    static Function func = new Function();
    static HalfDivision div = new HalfDivision();
    static Newton newton = new Newton();
    static ViewData view = new ViewData();
    static SimpleIterations simple = new SimpleIterations();
    public static void main(String[] args) {
        double exact[] = {0.01, 0.001, 0.00001, 0.0000001};
        double funcRoots[][] = new double[2][exact.length];
        double temp[] = new double[2];
        System.out.println("Введите отрезок [a,b]");
        double a = input.nextDouble();
        double b = input.nextDouble();
        CheckHalfDivision(a, b, exact, funcRoots, temp);
        ReworkHalfDivision(a,b,exact,funcRoots,temp);
        view.ViewData(exact, funcRoots);
        System.out.println();
        CheckNewton(a,b,exact, funcRoots, temp);
        view.ViewData(exact, funcRoots);
        System.out.println();
        CheckSimple(a,b,exact, funcRoots, temp);
        view.ViewData(exact, funcRoots);


    }
    static void CheckHalfDivision(double a, double b, double exact[],double funcRoots[][], double temp[] ) {
        if (func.Function(a) * func.Function(b) < 0) {
            for (int i = 0; i < exact.length; i++) {
                temp = div.halfDivivison(a, b, exact[i]);
                funcRoots[0][i] = temp[0];
                funcRoots[1][i] = temp[1];
            }
        }
    }
    static void ReworkHalfDivision(double a, double b, double exact[],double funcRoots[][], double temp[] ) {
        while (func.Function(a) * func.Function(b) >= 0) {
            System.out.println("Вы ввели отрезок на котором нет корней");
            System.out.println("Повторите ввод");
            a = input.nextDouble();
            b = input.nextDouble();
            CheckHalfDivision(a, b, exact, funcRoots, temp);
        }
    }
    static void CheckNewton(double a, double b, double exact[], double funcRoots[][], double temp[]){
        for (int i = 0; i < exact.length; i++) {
            temp = newton.Newton(a, b, exact[i]);
            funcRoots[0][0] = temp[0];
            funcRoots[1][0] = temp[1];
        }
    }
    static void CheckSimple(double a, double b, double exact[], double funcRoots[][], double temp[]){
        for (int i = 0; i < exact.length; i++) {
            temp = simple.Simple(a, b, exact[i]);
            funcRoots[0][0] = temp[0];
            funcRoots[1][0] = temp[1];
        }
    }
}
