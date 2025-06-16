/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salariousuario;

/**
 *
 * @author Matheus Brito
 */
import java.util.Scanner;

public class SalarioUsuario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        System.out.print("Digite o seu salário: ");
        double salarioUsuario = scanner.nextDouble();

        double quantidadeSalarios = salarioUsuario / salarioMinimo;

        System.out.println("Você ganha aproximadamente " + quantidadeSalarios + " salários mínimos.");

        scanner.close();
    }
}
