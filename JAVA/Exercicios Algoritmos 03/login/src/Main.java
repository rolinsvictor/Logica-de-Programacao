/*Exercício Logion : Um software comercial necessita de um sistema de segurança que protege
 a emissão de relatórios confidenciais. Ele deve solicitar o numero da matricula e a senha
 do funcionário e só então liberar o acesso. Implemente este sistema usando operadores lógicos
 E e OU de forma a permitir a entrada para os seguintes dados:
 MATRICULA1 = “987” SENHA1 = “789”
 MATRICULA2 = “321” SENHA2 = “123”
 MATRICULA3 = “654” SENHA3 = “456”*/



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o seu número de matrícula :");
        int matricula = input.nextInt();

        System.out.print("Informe a sua senha : ");
        int senha = input.nextInt();

        int matricula_1 = 987;
        int senha_1 = 789;

        int matricula_2 = 321;
        int senha_2 = 123;

        int matricula_3 = 654;
        int senha_3 = 456;

        if (matricula == matricula_1 && senha == senha_1 ) {

            System.out.print("Seu acesso está liberado.");

        }

        else if (matricula == matricula_2 && senha == senha_2 ) {

            System.out.print("Seu acesso está liberado.");

        }

        else if (matricula == matricula_3 && senha == senha_3 ) {

            System.out.print("Seu acesso está liberado.");

        }

        else {
            System.out.print("Acesso inválido !");
        }




        input.close();


    }

}
