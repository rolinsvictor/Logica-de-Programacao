/*Questão 16 : Faça um algoritmo que receba um número e mostre uma mensagem
“O número é maior do que 10” caso este número seja maior que 10.*/

import java.util.Scanner;
public class Questao_16 {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número : ");
        double num = input.nextInt();

        if (num >=10) {
            System.out.print("O número digitado é maior ou igual a 10");

        }

        else{
            System.out.print("O número digitado que menor que 10");

        }

        input.close();
    }
}
