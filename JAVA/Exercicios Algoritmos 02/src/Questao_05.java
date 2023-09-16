/*Questão 05 : Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1:feminino  2:masculino) de uma pessoa,
 construa um programa que calcule e imprima seu peso ideal, utilizando as seguintes Fórmulas:
para homens: (72.7 * Altura) – 58
para mulheres: (62.1 * Altura) – 44.7*/

import java.util.Scanner;
public class Questao_05{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe a sua altura : ");
        double alt = input.nextDouble();

        System.out.println("Digite 1 para FEMININO");
        System.out.println("Digite 2 para MASCULINO");
        int sexo = input.nextInt();

        double peso_ideal_homem = (72.7 * alt) - 58;
        double peso_ideal_mulher = (62.1 * alt) - 44.7;

        if(sexo == 1) {

            System.out.print("Você é mulher e o seu peso ideal é : " + peso_ideal_mulher);

        }
        else {
            System.out.print("Você é homem é o seu peso idea é : " + peso_ideal_homem);
        }


        input.close();

    }

}

