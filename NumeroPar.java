import java.util.Scanner;
public class NumeroPar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero");
        int num = scan.nextInt();
        if (num % 2 == 0 ){
            System.out.println("o numero é par");
        }
        else{
            System.out.println("o numero é impar");

        }
    }
}
