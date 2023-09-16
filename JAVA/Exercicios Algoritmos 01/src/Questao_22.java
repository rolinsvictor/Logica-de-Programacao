/*Questão 22 : Faça um algoritmo que leia um número de 0 a 5 e escreva por extenso. Caso o usuário digite um número que
 não esteja neste intervalo, exibir mensagem: número inválido.*/

import java.util.Scanner;
public class Questao_22 {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número : ");
        int num1 = input.nextInt();

        if(num1 == 1 ){
            System.out.print("O número digitado é o 1");
        }
        else if(num1 == 2 ){
            System.out.print("O número digitado é o 2");
        }
        else if(num1 == 3 ){
            System.out.print("O número digitado é o 3");
        }
        else if(num1 == 4 ){
            System.out.print("O número digitado é o 4");
        }
        else if(num1 == 5 ){
            System.out.print("O número digitado é o 5");
        }
        else{
            System.out.print("O número digitado é inválido !");
        }
        input.close();
    }
}
