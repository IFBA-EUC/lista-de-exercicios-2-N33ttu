import java.util.Scanner;

public class Quest_06_github {
    public static void main(String[] args) {
        Scanner Scan = new Scanner (System.in);

        String qtd;
        int num;

        System.out.println("Digite o número: ");
        num = Scan.nextInt();
        qtd = Integer.toString(num);
        System.out.printf("O número "+ num + " tem " + qtd.length()+ " números");

        Scan.close();


        
    }
    
}
