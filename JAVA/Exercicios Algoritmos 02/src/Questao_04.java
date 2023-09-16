/*Questão 04 : Leia o nome e quatro notas de um aluno durante o semestre, calcula a média aritmética
dessas notas, e informa se o aluno foi aprovado ou reprovado. A média para aprovação é
6.0 (seis).*/

import java.util.Scanner;

public class Questao_04{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o nome do aluno : ");
        String nome = input.nextLine();

        System.out.print("Informe a primeira nota : ");
        double nota01 = input.nextDouble();

        System.out.print("Informe a segunda nota : ");
        double nota02 = input.nextDouble();

        System.out.print("Informe a terceira nota : ");
        double nota03 = input.nextDouble();

        System.out.print("Informe a quarta nota : ");
        double nota04 = input.nextDouble();

        double media = (nota01 + nota02 + nota03 + nota04)/4;

        if(media >= 6.0) {
            System.out.print("O nome do aluno é :" + nome + "e a sua media é : "+ media + "APROVADO.");
        }
        else {
            System.out.print("O nome do aluno é :" + nome + "e a sua media é : " + media + "REPROVADO.");
        }


        input.close();
    }

}

