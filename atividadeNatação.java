import java.util.Scanner;

public class atividadeNatação {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Coloque a idade do nadador: ");
        int Idade = leitor.nextInt();
        if (Idade >= 5 && Idade <= 7){
            System.out.println("Infantil A");
        }else if (Idade <= 11){
            System.out.println("Infantil B");
        }else if (Idade <= 13){
            System.out.println("Juvenil A");
        }else if (Idade <= 17) {
            System.out.println("Juvenil B");
        }else {
            System.out.println("Adulto");
        }
    }
}