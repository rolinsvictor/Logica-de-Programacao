// Questão 02 :Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão dos números lidos.

//Nessa linha, importo o Scanner Java.
import java.util.Scanner;

//Nessa linha, cria-se a classe Main.
public class Questao_02 {
    //Nessa linha, cria-se o método da classe Main.
    public static void main(String[]args){

        //Nessa linha, trago para o código o Scanner.
        Scanner input=new Scanner(System.in);

        //Nessas linhas, peço para que o usuário digite os números no sistema, e crio as variaveis que serão utilizadas, atribuindo o Scanner a elas.
        System.out.println("Digite o primeiro Número : ");
        int x = input.nextInt();
        System.out.println("Digite o segundo número : ");
        int y = input.nextInt();
        int soma = x+y;
        int subtracao = x-y;
        int multiplicacao = x*y;
        int divisao = x/y;

        //Nessas linhas, imprimo na tela o resultado das divisões.
        System.out.println("A soma desses dois números é : "+soma);
        System.out.println("A subtração desses dois números é : "+subtracao);
        System.out.println("A multiplicação desses dois números é : "+multiplicacao);
        System.out.println("A divisão desses dois números é : "+divisao);




        //Nessa linha, se encerra o Scanner.
        input.close();

    }
}