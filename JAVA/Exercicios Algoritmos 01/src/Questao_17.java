/*Questão 17 :Escrever um algoritmo que leia um valor inteiro e informe se
o número é par ou ímpar.*/

import java.util.Scanner;
public class Questao_17 {
    public static void main (String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Informe um número : ");
        int num = input.nextInt();

        if (num%2 == 0){
            System.out.print("O número digitado é par. ");
        }
        else{
            System.out.print("O número digitado é impar.");
        }

        input.close();


    }
}
