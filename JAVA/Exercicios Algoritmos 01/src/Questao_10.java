/*Questão 10 : A Loja Mamão com Açúcar está vendendo seus produtos com 5 prestações sem juros.
Faça um algoritmo que receba um valor de uma compra e mostre o valor das prestações.*/

//Nessa linha, importo o Scanner que será utilizado no projeto.
import java.util.Scanner;

//Nessa linha, crio a classe que será utilizada no projeto.
public class Questao_10{

    //Nessa linha, crio o método que será utilizado no projeto.
    public static void main(String[]args){

        //Nessa linha, crio um objeto Scanner que será utilizado para que o usuário possa interagir com o sistema.
        Scanner input = new Scanner(System.in);

        //Agora, peço ao usuário que digite o valor da compra e armazeno essa informação em uma variável.
        System.out.print("Digite o valor da compra : ");
        double valor_compra = input.nextDouble();

        //Agora, calculo o valor de cada prestação.
        double valor_prestacao = valor_compra / 5;

        //Agora, imprimo na tela o valor de cada prestação.
        System.out.print("O valor de cada prestação é de : " + valor_prestacao);

        //Nessa linha, encerro o objeto Scanner.
        input.close();
    }
}