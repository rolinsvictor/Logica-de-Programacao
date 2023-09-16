/*Questão 04 : Escrever um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro).
Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês.*/

// Nessa linha, importo a biblioteca Scanner
import java.util.Scanner;

// Nesse momento, cria-se a classe que será utilizada no programa.
public class Questao_04{

    //Nesse momento, cria-se o método que será utilizado no programa.
    public static void main(String[]args){

        //Aqui, crio um objeto Scanner.
        Scanner input = new Scanner(System.in);

        //Nesse momento, peço para o usuário que informe o nome do vendedor e crio a variável que irá receber essa informação.
        System.out.print("Qual é o nome do vendedor ? ");
        String vendedor = input.nextLine();

        //Nesse momento, peço para o usuário que informe o salário fixo do vendedor e crio a variável que irá receber essa informação.
        System.out.print("Qual é o salário fixo do vendedor ?");
        double salfix = input.nextInt();

        //Nesse momento, peço para o usuário que informe o total de vendas feitas no mês e crio a variável que irá receber essa informação.
        System.out.print("Qual foi o total de reais em vendas feitas pelo vendedor ao decorrer do mês ?");
        double vendas=input.nextDouble();

        //Agora, calculo a comissão do vendedor e o seu salário total.
        double salfinal = salfix +(0.15 * vendas);

        //Nesse momento, imprimo as informações obtidas na tela.
        System.out.println("O nome do vendedor é :" + vendedor);
        System.out.println("O salário fixo do vendedor é :" + salfix);
        System.out.print("O salário final do vendedor é :" + salfinal);

        //Aqui, finalizo o objeto Scanner.
        input.close();

    }
}
