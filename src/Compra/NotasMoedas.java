package Compra;

public class NotasMoedas {
    private int notasVinte;
    private int notasDez;
    private int notasCinco;
    private int moedasDois;
    private int moedasUm;

    public int getNotasVinte() {
        return notasVinte;
    }

    public void setNotasVinte(int notasVinte) {
        this.notasVinte = notasVinte;
    }

    public int getNotasDez() {
        return notasDez;
    }

    public void setNotasDez(int notasDez) {
        this.notasDez = notasDez;
    }

    public int getNotasCinco() {
        return notasCinco;
    }

    public void setNotasCinco(int notasCinco) {
        this.notasCinco = notasCinco;
    }

    public int getMoedasDois() {
        return moedasDois;
    }

    public void setMoedasDois(int moedasDois) {
        this.moedasDois = moedasDois;
    }

    public int getMoedasUm() {
        return moedasUm;
    }

    public void setMoedasUm(int moedasUm) {
        this.moedasUm = moedasUm;
    }

    public void notasVinte(int a) {
        int vinte = a / 20;
        setNotasVinte(vinte);
    }

    public void notasDez(int a) {
        int dez = a / 10;
        setNotasDez(dez);
    }

    public void notasCinco(int a) {
        int cinco = a / 5;
        setNotasCinco(cinco);
    }

    public void moedasDois(int a) {
        int dois = a / 2;
        setMoedasDois(dois);
    }

    public void moedasUm(int a) {
        setMoedasUm(a);
    }
}
