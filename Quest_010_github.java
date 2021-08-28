import java.util.Scanner;

public class Quest_010_github {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        double invest, jur, val_tot = 0;
        String retorno;

        System.out.printf("Digite o valor do investimento: ");
        invest = Scan.nextDouble();
        System.out.printf("Digite o valor dos juros: ");
        jur = Scan.nextDouble();

        do{
            for(int b = 1; b <=12; b++){

                invest = invest + (invest * jur);
                val_tot = val_tot + invest;

            }
            System.out.printf("\nValor depois de ano:R$ %f", val_tot);
            Scan.nextLine();
            System.out.printf("\n\nDeseja processar mais um ano (s= sim, n = não)? ");
            retorno = Scan.nextLine();
            invest = val_tot;

        }while("s".equals(retorno) || "S".equals(retorno));

        Scan.close();


        
    }
    
}
