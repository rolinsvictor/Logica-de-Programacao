/*Questão 03 : Leia dois números diferentes e informe qual deles é o maior.*/

import java.util.Scanner;
public class Questao_03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número : ");
        int num1 = input.nextInt();

        System.out.print("Digite o segundo número : ");
        int num2 = input.nextInt();

        if(num1 > num2) {
            System.out.println("O primeiro número é maior que o segundo número");
        }
        else {
            System.out.println("O segundo número é maior que o primeiro");
        }




        input.close();
    }

}
