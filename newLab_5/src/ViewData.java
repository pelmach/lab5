//taskOne
public class ViewData {
    public static void ViewData(double masOne[], double masTwo[][]){
        System.out.println();
        System.out.print("Точность"+"\t");
        for (int i = 0; i < masOne.length; i++) {
            System.out.print(masOne[i]+"\t"+"\t");
        }
        System.out.println();
        System.out.print("Корень"+"\t"+"\t");
        for (int i = 0; i < masTwo[0].length; i++) {
            System.out.printf("%8f",masTwo[0][i]);
            System.out.print("\t");
        }
        System.out.println();
        System.out.print("Итерации"+"\t");
        for (int i = 0; i < masTwo[0].length ; i++) {
            System.out.printf("%1f",masTwo[1][i]);
            System.out.print("\t");
        }
    }
}
