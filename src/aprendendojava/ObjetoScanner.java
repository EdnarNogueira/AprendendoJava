/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendendojava;

import java.util.Scanner;

/**
 *
 * @author ednar
 */
public class ObjetoScanner {
    public static void main(String[] args) {
        int v1;

        //DECLARANDO OBJETO DO TIPO SCANNER (LEIA)
        Scanner leia = new Scanner(System.in);

        System.out.print("INSIRA UM VALOR INTEIRO :");
        /*nextInt() METODO DA CLASSE SCANNER */
        v1 = leia.nextInt(); /* VARIAVEL A RECEBE DADOS INFORMADOS PELO USUARIO*/

        System.out.println("VALOR INFORMADO E :" + v1); /* ESCREVA*/

    }
}
