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
public class FuncaoMatematicaMath {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
		int num;

		System.out.print("Enter an integer number: ");
		num = teclado.nextInt();

		System.out.println("numero elevado a 2º potencia "+ num + " is: "+ Math.pow(num, 2));
		System.out.println("numero elevado ao cubo "+ num + " is: "+ Math.pow(num, 3));
		System.out.println("Raiz quadrada "+ num + " is: "+ Math.sqrt(num));

    }
}
