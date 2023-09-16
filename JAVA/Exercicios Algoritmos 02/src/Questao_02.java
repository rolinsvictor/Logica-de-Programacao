/*Questão 02 : Leia dois números e informa se os mesmos são iguais ou diferentes. */

import java.util.Scanner;

public class Questao_02{
    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o primeiro número");
        int num1 = input.nextInt();

        System.out.print("Informe o segundo número");
        int num2 = input.nextInt();

        if (num1 == num2) {
            System.out.println("Os números digitados são iguais.");
        }
        else {
            System.out.println("Os números digitados são diferentes.");
        }


        input.close();

    }
}

