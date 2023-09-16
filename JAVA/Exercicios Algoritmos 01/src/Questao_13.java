/*Questão 13 : Escrever um algoritmo que leia a idade de uma pessoa em dias (total de dia
 que ele já viveu) e informe sua idade em anos, meses e dias.*/

import java.util.Scanner;
public class Questao_13{
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o total de dias que você já viveu :");
        int totaldias = input.nextInt();

        double anos = totaldias / 365;
        double meses = totaldias / 30;

        System.out.print("Até hoje, você viveu, " + anos + " anos ," + meses + " meses ," + " e " + totaldias + " dias. " );

        input.close();

    }
}


