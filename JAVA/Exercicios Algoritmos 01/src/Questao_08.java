/*8) Elaborar um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$).
 O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário.*/

//Nessa linha, importo a classe Scanner.
import java.util.Scanner;

//Nessa linha, crio a classe que será utilizada no projeto.
public class Questao_08{

    //Nessa linha, crio o método que será utilizado no projeto.
    public static void main(String[]args){

        //Nessa linha, crio o objeto Scanner, que fará com que o usuário consiga interagir com o programa.
        Scanner input = new Scanner(System.in);


        //Agora, peço que o usuário digite as informações necessária e crio variáveis para armazenar essas informações.
        System.out.print("Informe o valor a ser convertido. US$ : ");
        double valor_dolar = input.nextDouble();

        System.out.print("Informe a cotação do dolar : ");
        double cotacao = input.nextDouble();

        //Agora, faço calculo quantos reais teremos, a partir das informações fornecidas pelo usuário.
        double conversao = valor_dolar * cotacao;

        //Agora, imprimo na tela o resultado da operação, informando ao usuário o valor que ele tem.
        System.out.print("O valor que você possuí, convertido de Dólares para Reais é de R$ " + conversao);

        //Nessa linha, finalizo o objeto Scanner.
        input.close();
    }
}