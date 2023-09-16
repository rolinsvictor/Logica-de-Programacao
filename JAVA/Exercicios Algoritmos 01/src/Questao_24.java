/*Questão 24 : 24)	Faça um algoritmo que receba um número e mostre uma mensagem caso este número maior que 80, menor que 25
ou igual a 40.*/

import java.util.Scanner;
public class Questao_24 {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número : ");
        int num = input.nextInt();

        if (num == 40){
            System.out.print("Esse é um número válido");
        }
        else if(num > 80){
            System.out.print("Esse é um número válido");
        }
        else if(num < 25){
            System.out.print("Esse é um número válido");
        }

        input.close();
    }
}
