import java.util.Scanner;

public class Quest_04_github {
    public static void main(String[] args) {

        String nome;
        int qtd;
        double preco;

        Scanner Scan = new Scanner(System.in);

        System.out.println("Digite o produto: ");
        nome = Scan.nextLine();
        System.out.println("Digite a quantidade: ");
        qtd = Scan.nextInt();
        System.out.println("Digite o preco: ");
        preco = Scan.nextDouble();

        if(qtd >= 11 && qtd <= 20){

            preco = preco * qtd;
            preco = preco-(preco*10)/100;
            
            System.out.println("Nome do produto:" + nome);
            System.out.println("Quantidade do produto:" + qtd);
            System.out.println("preco total:" + preco);

        }else if(qtd > 50){

            preco = preco * qtd;
            preco = preco-(preco * 25)/100;

            System.out.println("Nome do produto:" + nome);
            System.out.println("Quantidade do produto:" + qtd);
            System.out.println("preco total:" + preco);
        
        }else{

            System.out.println("Nome do produto:" + nome);
            System.out.println("Quantidade do produto:" + qtd);
            System.out.println("preco total:" + preco);

        }

        Scan.close();






        
    }
    
}
