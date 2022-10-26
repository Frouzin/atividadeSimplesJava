import java.util.Scanner;

public class atividadeVotacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual é o seu voto?");
        int voto = scan.nextInt();
        String candidato = switch (voto) {
            case 13 -> "Lula";
            case 22 -> "Bolsonaro";
            case 12 -> "Ciro Gomes";
            case 14 -> "Padre Kelmon";
            case 80 -> "Léo Pericles";
            case 30 -> "Felipe D'Avila";
            case 44 -> "Soraya Thronick";
            case 15 -> "Simone Tebet";
            default -> "Nulo";
        };
            System.out.printf("Seu Candidato é o %s", candidato);
    }
}

