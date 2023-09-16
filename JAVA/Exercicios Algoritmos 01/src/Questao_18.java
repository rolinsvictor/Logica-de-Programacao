/*Questão 18 :Escrever um algoritmo que leia dois valores inteiro distintos e informe qual é o maior.*/

import java.util.Scanner;
public class Questao_18 {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número : ");
        int num1 = input.nextInt();

        System.out.print("Digite o segundo número : ");
        int num2 = input.nextInt();

        if (num1 > num2){
            System.out.print("O primeiro número é maior que o segundo número.");
        }
        else if(num2 > num1){
            System.out.print("O segundo número é maior que o primeiro número.");
        }
        else{
            System.out.print("Os números digitados são iguais.");
        }


        input.close();

    }
}
