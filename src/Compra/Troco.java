package Compra;

import java.util.Scanner;

public class Troco {
    public static void main(String[] args) {
        NotasMoedas troco1;
        troco1 = new NotasMoedas();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Valor da compra: ");
        int valorCompra = entrada.nextInt();
        int troco = 50 - valorCompra;
        int trocoDez = troco % 20;
        int trocoCinco = trocoDez % 10;
        int trocoDois = trocoCinco % 5;
        int trocoUm = trocoDois % 2;
        troco1.notasVinte(troco);
        troco1.notasDez(trocoDez);
        troco1.notasCinco(trocoCinco);
        troco1.moedasDois(trocoDois);
        troco1.moedasUm(trocoUm);
        System.out.printf("Valor do troco: %d%nNotas de 20: %d%nNotas de 10: %d%nNotas de 5: %d%n" +
                "Moedas de 2: %d%nMoedas de 1: %d%n", troco, troco1.getNotasVinte(),troco1.getNotasDez(),
                troco1.getNotasCinco(), troco1.getMoedasDois(), troco1.getMoedasUm());

        int menor = Math.min(troco1.getMoedasUm(),Math.min(troco1.getMoedasDois(),Math.min(troco1.getNotasCinco(),Math.min(troco1.getNotasDez(),troco1.getNotasVinte()))));
        System.out.printf("O menor valor de notas e moedas é %d %n", menor);
    }
}