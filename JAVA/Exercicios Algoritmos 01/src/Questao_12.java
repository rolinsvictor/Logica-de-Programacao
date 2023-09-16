/*Questão 12 : O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
 percentagem do distribuidor e dos impostos (aplicados, primeiro os impostos sobre o custo de fábrica,
 e depois a percentagem do distribuidor sobre o resultado). Supondo que a percentagem do distribuidor seja
 de 28% e os impostos 45%, escrever um algoritmo que leia o custo de fábrica de um carro e informe o custo
 ao consumidor do mesmo.*/

import java.util.Scanner;
public class Questao_12{
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        System.out.print("Informe o valor de fábrica do veículo : ");
        double valorFabrica = input.nextDouble();

        double valorImpostos = valorFabrica * 0.28;
        double valorDistribuidor = valorImpostos * 0.45;

        double valorConsumidor = valorFabrica + valorImpostos + valorDistribuidor;

        System.out.print("O valor do veículo para o consumidor final é de :" + valorConsumidor);

        input.close();

    }
}
