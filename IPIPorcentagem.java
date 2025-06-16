/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ipiporcentagem;

/**
 *
 * @author Matheus Brito
 */
import java.util.Scanner;

public class IPIPorcentagem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a porcentagem do IPI: ");
        double ipi = scanner.nextDouble();

        System.out.print("Digite o código da peça 1: ");
        int codigo1 = scanner.nextInt();

        System.out.print("Digite o valor unitário da peça 1: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite a quantidade da peça 1: ");
        int quantidade1 = scanner.nextInt();

        System.out.print("Digite o código da peça 2: ");
        int codigo2 = scanner.nextInt();

        System.out.print("Digite o valor unitário da peça 2: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Digite a quantidade da peça 2: ");
        int quantidade2 = scanner.nextInt();

        double total = (valor1 * quantidade1 + valor2 * quantidade2) * (1 + ipi / 100);

        System.out.println("O valor total a ser pago é: " + total);

        scanner.close();
    }
}