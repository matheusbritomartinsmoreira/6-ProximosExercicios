/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reajustesaldo;

/**
 *
 * @author Matheus Brito
 */
import java.util.Scanner;

public class ReajusteSaldo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo atual: ");
        double saldo = scanner.nextDouble();

        double novoSaldo = saldo + (saldo * 0.01);

        System.out.println("Saldo com reajuste de 1%: " + novoSaldo);

        scanner.close();
    }
}