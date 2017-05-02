/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigos;

import java.util.Scanner;

/**
 *
 * @author anne
 */
public class Triangulo {

    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        int lA = leitor.nextInt();
        int lB = leitor.nextInt();
        int lC = leitor.nextInt();

        System.out.println(tipoTriangulo(lA, lB, lC));
    }

    public static String tipoTriangulo(int a, int b, int c) throws Exception {
        //try {
            if (EhTriangulo(a, b, c)) {
                if (a == b && a == c) {
                    return "Equilatero";
                } else if (a == b || a == c || b == c) {
                    return "Isosceles";
                } else {
                    return "Escaleno";
                }
            } else {
                return "Não eh triangulo";
            }
        //} catch (Exception erro) {
        //    System.err.println(erro.getMessage());
        //}
        //return "Não eh triangulo";
    }

    public static boolean EhTriangulo(int a, int b, int c) throws Exception {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new Exception("Erro: um dos valores é menor ou igual a zero");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new Exception("Erro: valores não formam triangulo");
        }

        return true;
    }
}
