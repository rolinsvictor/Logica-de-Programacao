/*Questão 14 : Toda semana Zé leva um saco cheio de espigas para distribuir
na escola, entre os alunos e a professora.  Fazer um algoritmo que calcule quantas
espigas cada aluno irá receber, sabendo-se que todo aluno receberá a mesma quantidade
(inteira) de espigas. A professora irá ficar com as espigas que sobrarão após a
distribuição aos alunos. Apresentar quantas espigas cada aluno e a professora deve receber.*/

import java.util.Scanner;
public class Questao_14{
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        System.out.print("Informe o total de espigas : ");
        int totalespigas = input.nextInt();

        System.out.print("Informe o total de alunos : ");
        int totalalunos = input.nextInt();

        int espigaspaluno = totalespigas / totalalunos;

        int espigasprof = totalespigas % totalalunos;

        System.out.print("Cada aluno receberá " + espigaspaluno + " espigas " + " e cada professor receberá " + espigasprof + " espigas . ");

        input.close();
    }
}
