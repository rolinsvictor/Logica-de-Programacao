/*Questão 11 :Faça um algoritmo que receba o preço de custo de um produto e mostre
o valor de venda. Sabe-se que o preço de custo receberá um acréscimo de acordo com um
percentual informado pelo usuário.*/

import java.util.Scanner;
public class Questao_11{

    public static void main (String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o preço de custo do produto R$ : ");
        double preco = input.nextDouble();

        System.out.print("Informe a procentagem de acréscimo % : ");
        double valor_acrecimo = input.nextDouble();

        double porcento = (valor_acrecimo / 100);



        double valor_fim = preco + (preco * porcento);

        System.out.print("O valor final do produto é R$ : " + valor_fim);

        input.close();

    }
}

