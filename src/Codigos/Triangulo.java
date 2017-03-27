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
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int lA = leitor.nextInt();
        int lB = leitor.nextInt();
        int lC = leitor.nextInt();
        
        System.out.println(tipoTriangulo(lA, lB, lC));
    }
    
    public static String tipoTriangulo(int a, int b, int c){
        
        if(a == b && a == c){
            return "Equilatero";
        }
        else if(a == b || a == c || b == c){
            return "Isosceles";
        }
        else {
            return "Escaleno";
        }
    }
}
