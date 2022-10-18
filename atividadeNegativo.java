import java.util.Scanner;

public class atividadeNegativo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero");
        int num = scan.nextInt();
        if (num >= 0){
            System.out.println("Positivo");
        }
        else{
            System.out.println("Negativo");
        }
    }
}
