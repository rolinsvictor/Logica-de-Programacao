/*Questão 23 : Faça um algoritmo que receba o número do mês e mostre o mês correspondente, verificando
se o mês é invalido.*/

import java.util.Scanner;
public class Questao_23 {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número : ");
        int num = input.nextInt();

        if(num == 1 ){
            System.out.print("O mês é JANEIRO.");
        }
        else if(num == 2){
            System.out.print("O mês é FEVEREIRO.");
        }
        else if(num == 3){
            System.out.print("O mês é MARÇO.");
        }
        else if(num == 4){
            System.out.print("O mês é ABRIL.");
        }
        else if(num == 5){
            System.out.print("O mês é MAIO.");
        }
        else if(num == 6){
            System.out.print("O mês é JUNHO.");
        }
        else if(num == 7){
            System.out.print("O mês é JULHO.");
        }
        else if(num == 8){
            System.out.print("O mês é AGOSTO.");
        }
        else if(num == 9){
            System.out.print("O mês é SETEMBRO.");
        }
        else if(num == 10){
            System.out.print("O mês é OUTUBRO.");
        }
        else if(num == 11){
            System.out.print("O mês é NOVEMBRO.");
        }
        else if(num == 12){
            System.out.print("O mês é DEZEMBRO.");
        }
        else{
            System.out.print("O número digitado é inválido.");
        }

        input.close();
    }
}
