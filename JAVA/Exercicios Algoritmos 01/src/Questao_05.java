/* Questão 05 : Escrever um algoritmo que leia de um aluno, o nome e as notas das
três provas que ele obteve no semestre. No final informar o nome do aluno e a sua média
 (aritmética).*/

//Nessa linha, importo a biblioteca Scanner.
import java.util.Scanner;

//Nessa linha, crio a classe que será usada no projeto.
public class Questao_05{

    //Nessa linha, crio o método que será usado no projeto.
    public static void main(String[]args){

        //Nessa momento, crio um objeto Scanner.
        Scanner input = new Scanner(System.in);

        //Nesse momento, peço que usuário digite o nome do aluno e crio uma variável para que esse nome seja armazenado.
        System.out.print("Qual é o nome do aluno ? ");
        String nome_aluno = input.nextLine();

        //Nesse momento, peço que o usuário digite as notas do aluno e crio variáveis para armazenar essas notas.
        System.out.println("Digite a primeira nota : ");
        double nota_01 = input.nextDouble();

        System.out.println("Digite a segunda nota : ");
        double nota_02 = input.nextDouble();

        System.out.println("Digite a terceira nota : ");
        double nota_03 = input.nextDouble();

        //Nesse momento, crio uma variável e calculo a média do aluno.
        double media = (nota_01 + nota_02 + nota_03)/3;

        //Agora, finalizo o programa, imprimindo na tela as informações nome e média.
        System.out.println("O nome do aluno é : " + nome_aluno);
        System.out.println("E a sua média é : " + media);

        //Nesse momento, encerro o objeto Scanner.
        input.close();


    }
}