/*Questão 15 : Dado um número de 3 algarismos construir outro número de quatro
 algarismos de acordo com a seguinte regra:

a)Os três primeiros algarismos, contados da esquerda para a direita são iguais aos do
número dado;
b)O quarto algarismo é um dígito de controle calculado da seguinte forma: primeiro
algarismo + segundo algarismo * 3 + terceiro algarismo * 5; o dígito de controle é igual
ao resto da divisão dessa soma por 7.
*/

import java.util.Scanner;

public class Questao_15{

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o primeiro algarismo : ");
        int num1 = input.nextInt();

        System.out.print("Informe o segundo algarismo : ");
        int num2 = input.nextInt();

        System.out.print("Informe o terceiro algarismo : ");
        int num3 = input.nextInt();

        int num4 = (num1 + (num2 * 3) +(num3 * 5)) % 7;

        System.out.print("O número é : " + num1+num2+num3+num4);



        input.close();






    }
}