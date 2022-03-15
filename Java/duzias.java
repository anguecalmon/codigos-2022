import java.util.*;

public class duzias {
    private static Scanner teclado;

    public static void main(String args[]){
        int qtdBananas = 0;
        int totalBananas = 0;
        teclado = new Scanner(System.in);

        System.out.printf("Quantas bananas você tem?: ");
        qtdBananas = teclado.nextInt();

        if (qtdBananas >= 12) {
            totalBananas = qtdBananas / 12;

        System.out.println("Você tem " + totalBananas + " dúzias de bananas");
        }
    }
}
