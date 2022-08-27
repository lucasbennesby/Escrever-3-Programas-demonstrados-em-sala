import java.util.Scanner;

public class SomaComInput {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o primeiro numero \n");
        Integer PrimeiroNumero = leitor.nextInt();
        System.out.print("Digite o segundo numero \n");
        Integer SegundoNumero = leitor.nextInt();

        int Resultado = PrimeiroNumero + SegundoNumero;

        System.out.print("O resultado da soma dos numeros eh: " + Resultado);

    };

}
