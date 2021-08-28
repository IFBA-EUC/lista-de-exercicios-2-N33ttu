import java.lang.Math;
import java.util.Scanner;


public class Quest_02_github {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        Double distancia, X1, Y1, Z1, X2, Z2, Y2;

        System.out.println("Digite o valor de x1: ");
        X1 = Scan.nextDouble();
        System.out.println("Digite o valor de y1: ");
        Y1 = Scan.nextDouble();
        System.out.println("Digite o valor de z1: ");
        Z1 = Scan.nextDouble();
        System.out.println("Digite o valor de x2: ");
        X2 = Scan.nextDouble();
        System.out.println("Digite o valor de y2: ");
        Y2 = Scan.nextDouble();
        System.out.println("Digite o valor de z2: ");
        Z2 = Scan.nextDouble();

        distancia = Math.sqrt(Math.pow((X2 - X1), 2) + Math.pow((Y2 - Y1), 2) + Math.pow((Z2 - Z1),2));

        System.out.printf("A distância é de: %f", distancia);

        Scan.close();

    }

}
