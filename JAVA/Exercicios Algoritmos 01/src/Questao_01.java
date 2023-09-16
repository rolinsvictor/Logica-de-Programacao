// Questão 01:Faça um algoritmo que receba dois números e exiba o resultado da sua soma.

//Nessa linha eu faço a importação do Scanner.
import java.util.Scanner;

//nessa linha, se cria a classe Main
public class Questao_01 {
    //Nessa linha se cria o método.
    public static void main(String[]args){

        //Nessa linha se crio o Scanner dentro do meu código.
        Scanner input=new Scanner(System.in);

        //Nessas linhas, Solicito ao usuário que digite os números para a operação,faço a declaração das variáveis e atribuo a elas o Scanner, que permitirá a interação do usuário com o sistema.
        System.out.println("Escreva o primeiro Número : ");
        int x = input.nextInt();
        System.out.println("Escreva o segundo Número : ");
        int y = input.nextInt();
        int result = x+y;

        //Nessa linha, imprimo na tela o valor de da soma das variáveis.
        System.out.println("O resultado da soma entre esses dois números é : "+result);

        //Nessa linha eu finalizo o Scanner.
        input.close();

    }

}