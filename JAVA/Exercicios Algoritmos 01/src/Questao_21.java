/*Questão 21 : 21)	Faça um algoritmo que receba um número e diga se este número está ou não no
 intervalo 100 e 200 (inclusive).*/

import java.util.Scanner;
public class Questao_21 {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um núemro : ");
        double num1 = input.nextDouble();

        if(num1 > 100){
            System.out.print("O número digitado está entre 100. ");
        }


        input.close();

    }
}
