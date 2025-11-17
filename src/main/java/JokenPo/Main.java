package JokenPo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("=== JOKENPO ===");
        System.out.println("Escolha seu gesto: (PEDRA, PAPEL, TESOURA)");
        System.out.print("Você: ");
        String inputUsuario = sc.nextLine().trim().toUpperCase();

        GestoEnum jogador;
        try {
            jogador = GestoEnum.valueOf(inputUsuario);
        } catch (IllegalArgumentException e) {
            System.out.println("Entrada inválida! Use: PEDRA, PAPEL ou TESOURA.");
            sc.close();
            return;
        }

        GestoEnum computador = GestoEnum.values()[(int)(Math.random() * 3)];
        Mao maoJogador = new Mao(jogador);
        Mao maoComputador = new Mao(computador);

        System.out.println("Computador: " + computador);

        Resultado r = maoJogador.enfrenta(maoComputador);
        System.out.println("Resultado: " + r);

        sc.close();
    }
}