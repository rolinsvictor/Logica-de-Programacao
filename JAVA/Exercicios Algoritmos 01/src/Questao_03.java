//Questão 03 : Escrever um algoritmo para determinar o consumo médio de um automóvel sendo fornecidos a distância total percorrida pelo automóvel e o total de combustível gasto.

//Nessa linha se faz a importação do Scanner.
import java.util.Scanner;

//Aqui, cria-se a classe Main.
public class Questao_03 {

    //Aqui, cria-se o método da classe Main.
    public static void main(String[]args){

        //Aqui, trago o Scanner para dentro do código.
        Scanner input=new Scanner(System.in);

        //Nessas linhas, peço para que os usuários digitem os devidos valores, declaro as variais e atribuo a elas o Scanner.
        System.out.println("Digite a distância percorrida em Kilometros : ");
        int distancia = input.nextInt();
        System.out.println("Digite o combustível gasto em litros : ");
        int gasto = input.nextInt();
        int consmedio = distancia/gasto;

        System.out.println("O consumo médio desse automóvel é : " + consmedio + " Km/L");



        //Aqui, encerro o Scanner.
        input.close();
    }

}