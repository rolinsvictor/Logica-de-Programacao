/* Questão 06 :Ler dois valores para as variáveis A e B, e efetuar as trocas dos valores
de forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir
o valor da variável A. Apresentar os valores trocados. */

//nessa linha, importo a classe java Scanner.
import java.util.Scanner;

//Nessa linha, criamos a classe do projeto.
public class Questao_06{

    //Nessa linha, criamos o método do projeto.
    public static void main(String[]args){

        //Nesse momento, crio um objeto Scanner que servirá para a leitura dos dados inseridos pelo usuário.
        Scanner input = new Scanner(System.in);

        //Nessas linhas, peço que o usuário entre com os números e os armazeno em variáveis.
        System.out.print("Digite o primeiro número : ");
        double num1 = input.nextDouble();

        System.out.print("Digite o segundo número : ");
        double num2 = input.nextDouble();

        //Agora efetuo as trocas dos valores utilizando uma terceira variável.
        double num3 = num1;
        num1 = num2;
        num2 = num3;

        System.out.println("Os valores das variáveis com as devidas trocas são : " + num1 + " e " + num2);

        //Nesse momento, encerro o objeto Scanner.
        input.close();

    }
}