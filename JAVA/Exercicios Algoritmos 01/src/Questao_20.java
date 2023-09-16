/*Questão 20 : Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. Caso eles sejam iguais
 imprima uma mensagem dizendo que eles são iguais. Caso sejam diferentes, informe qual número é o maior, e uma mensagem
  que são diferentes. */

import java.util.Scanner;
public class Questao_20 {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número : ");
        int num1 = input.nextInt();

        System.out.print("Digite o segundo número : ");
        int num2 = input.nextInt();

        if(num1 == num2){
            System.out.print("Os números digitados são iguais.");
        }
        else if(num1 > num2){
            System.out.print("Os números digitados são diferentes e o primeiro número é maior que o segundo.");
        }
        else{
            System.out.print("Os números digitados são diferentes e o segundo número é maior que o primeiro.");
        }

        input.close();

    }
}
