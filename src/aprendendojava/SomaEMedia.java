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
public class SomaEMedia {
    public static void main(String[] args) {
        int a, b, soma;
        float media;


        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o prieiro numero : ");
        a = teclado.nextInt();

        System.out.print("Informe o segundo numero : ");
        b = teclado.nextInt();

        
        soma = a + b; /* Calculando a soma dos valores informados*/
        media = (float)((a + b) / 2); /*Calculado a media dos valores informados */

        System.out.print("Sum : " + soma + "\nAverage : " + media);

    }
}
