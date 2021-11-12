import java.util.Scanner;

public class AnoBissexto {
    public boolean main(int ano){
        /**Scanner entrada = new Scanner(System.in);
        System.out.println("Ano: ");
        ano = entrada.nextInt();**/

        if((ano % 400 == 0 || !(ano % 100 == 0)) && ano % 4 == 0){
            System.out.printf("%d é bissexto %n", ano);
            return true;
        }
        System.out.printf("%d não é bissexto %n", ano);
        return false;
    }
}