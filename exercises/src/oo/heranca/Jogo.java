package oo.heranca;

public class Jogo {
    public static void main(String[] args) {

        Jogador j1 = new Jogador();

        j1.andar("norte");
        j1.andar("norte");
        j1.andar("norte");
        j1.andar("norte");

        System.out.print(j1.y);
    }
}