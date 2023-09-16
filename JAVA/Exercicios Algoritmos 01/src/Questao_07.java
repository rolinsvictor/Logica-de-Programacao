/* Questão 07 :Ler uma temperatura em graus Celsius e apresenta-la convertida em graus
 Fahrenheit. A fórmula de conversão é: F=(9*C+160)/5, sendo F a temperatura em Fahrenheit
 e C a temperatura em Celsius. */


//Nessa linha, importo a classe Scanner.
import java.util.Scanner;

//Nessa linha, crio a classe que será utilizada nesse projeto.
public class Questao_07{

    //Nessa linha, crio o método que será utilizado nesse projeto.
    public static void main (String[]args){

        //Agora, crio um objeto do tipo Scanner, que servirá para que o usuário consiga interagir com o programa.
        Scanner input = new Scanner(System.in);

        //Nesse momento, peço ao usuário que informe a temperatura a ser convertida e a armazeno em uma variável.
        System.out.print("Informe a temperatura que deseja converter. Informar em °C: ");
        double tempcelcius = input.nextDouble();

        //Agora, calculo a conversão desse valor.
        double tempfahrenheit = (9 * tempcelcius + 160)/5;

        //Por fim, apresento o resultado da conversão.
        System.out.println("O resultado da conversão do valor informado é : " + tempfahrenheit + "°F");

        //Nessa linha, finalizo o objeto Scanner.
        input.close();
    }
}