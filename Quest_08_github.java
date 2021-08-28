import java.util.Scanner;

public class Quest_08_github {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        int f, val_01 = 0, val_02 = 0, result, qtd = 0;

        System.out.println("Numero: ");
        qtd = Scan.nextInt();
        while(val_01 < 1){
            result = val_01;
            val_01 = result;
            System.out.printf(" "+result+"");
            val_01++;
            }
            if(val_01 == 1){
                for (f = 1;f <= qtd; f++){
                    result = val_01 + val_02;
                    val_01 = val_02;
                    val_02 = result;

                    System.out.printf(" "+result+" ");

                    Scan.close();
               
                }
            }
    }
    
}
