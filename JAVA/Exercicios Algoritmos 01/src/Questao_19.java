/*Questão 19 : Escrever um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre.
Calcular a sua média (aritmética), informar o nome e sua menção aprovado (media >= 7) Reprovado (media <= 5) e
 Recuperação (media entre 5.1 a 6.9). */

import java.util.Scanner;
public class Questao_19{
    public static void main (String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o nome do estudante : ");
        String nome = input.nextLine();

        System.out.print("Informe a primeira nota do estudante : ");
        double nota01 = input.nextDouble();

        System.out.print("Informe a segunda nota do estudante : ");
        double nota02 = input.nextDouble();

        System.out.print("Informe a terceira nota do estudante : ");
        double nota03 = input.nextDouble();

        double media = (nota01 + nota02 + nota03)/3;

        if(media >= 7){
            System.out.printf("O nome do estudante é : " + nome + " e a sua média final é : %.2f " + " APROVADO ", media);
        }
        else if (media <= 5){
             System.out.printf("O nome do estudante é : " + nome + " e a sua média final é : %.2f " + " REPROVADO ", media);
        }
        else{
            System.out.printf("O nome do estudante é : " + nome + "e a sua media final é : %.2f " + " RECUPERAÇÃO ", media);
        }

        input.close();
    }
}