import java.util.Scanner;

public class atividadeTelefonia {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite a quantidade de minutos: ");
    int minutos = scan.nextInt();

    if (minutos > 100) {
        int minutosExcedentes=minutos-100;
        float valor = 50+(minutosExcedentes * 2);
        System.out.printf("O valor da sua conta é R$%4.2f",valor);
        }
        else {
            System.out.println("O Valor da sua fatura é R$50.00");
    }
}
}
