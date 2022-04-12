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
public class ParOuImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;

        //inpu
        System.out.print("Enter an integer number: ");
        num = teclado.nextInt();

        //check EVEN or ODD
        if (num % 2 == 0) {
            System.out.println(num + " É UM NUMERO PAR .");
        } else {
            System.out.println(num + " É UM NUMERO IMPAR.");
        }

    }
}
