
/*Questão 01 : Leia a idade de uma pessoa e mostra se a mesma é maior de idade ou não.*/

import java.util.Scanner;
public class Questao_01{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite sua idade : ");
        int idade = input.nextInt();

        if(idade >=18) {
            System.out.print("Você é maior de idade.");
        }
        else {
            System.out.print("Você é menor de idade");
        }

        input.close();

    }

}
