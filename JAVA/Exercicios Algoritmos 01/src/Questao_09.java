/* Questão 09: Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um mês.
·	Considere fixo o juro da poupança em 0,70% a. m.
*/

//Nessa linha, importo a classe Scanner.
import java.util.Scanner;

//Nessa linha, crio a classe que será utilizada no projeto.
public class Questao_09 {
    //Nessa linha, crio o método que será utilizado no projeto.
    public static void main(String[] args) {

        //Nessa linha, crio o objeto Scanner, que será responsável pela interação do usuário com o sistema.
        Scanner input = new Scanner(System.in);

        //Agora, solicito ao usuário que digite o valor do deposito e crio uma variável para receber esse valor.
        System.out.print("Digite o valor depositado R$ : ");
        double deposito = input.nextDouble();

        //Agora, crio uma variável e calculo o valor do rendimento mais o valor depositado.
        double valor_final = deposito + (deposito * 0.70);

        //Para finalizar,imprimo o valor final na tela.

        System.out.print("O valor final da poupança é de R$ : " + valor_final);

        //Nessa linha, finalizo o objeto Scanner.
        input.close();
    }
}