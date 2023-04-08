//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
import java.util.Scanner;
public class lista01_exercicio7 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double lado,area, dobroArea;

        System.out.println("Digite o valor do lado do quadrado: ");
        lado = input.nextDouble();

        area = lado * lado;
        dobroArea = area * 2;
        System.out.println("Area do quadrado é: " + area);
        System.out.println("Dobro da area do quadrado é: " + dobroArea);
    }
}

