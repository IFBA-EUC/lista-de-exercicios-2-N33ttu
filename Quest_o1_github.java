import java.util.Scanner;

public class Quest_o1_github {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);

        int a, b, c;
        
        System.out.print("Digite o coeficiente a(Obs: deve ser diferente de 0): ");
        a = one.nextInt();
        
        System.out.print("Digite o coeficiente b: ");
        b = one.nextInt();
        
        System.out.print("Digite o coeficiente c: ");
        c = one.nextInt();
       
        System.out.println();
        System.out.printf("%s\n", toString(a, b, c));

        
      }
      
      public static double delt(int a, int b, int c) {
        return(Math.pow(b, 2) - (4 * a * c)); 
      }
      
      public static String toString(int a, int b, int c) {
        String result;
        
        double d;
        d = delt(a, b, c);
        
        result = String.format("Coeficientes {a: %d; b: %d; c: %d}\n", a, b, c) +
                 String.format("Discriminante (delt): %.2f\n", d);
        
        if ((d < 0) || (a == 0))
            result = result + "Não há resultados reais, por favor tente novamente\n";
        
        if ((d == 0) && (a != 0)) {
            double x;
            x = -b / (2 * a);
            result = result + String.format("x' e x'' = %.2f\n", x);
        }
        
        if ((d > 0) && (a != 0)) {
            double x1, x2;
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            result = result + String.format("x' = %.2f\n", x1) +
                              String.format("x'' = %.2f\n", x2);
        }  
        
        return(result);



    
    }
}





