/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testesUnitarios;

import Codigos.Triangulo;
import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author Ana Gonçalo
 */
public class TrianguloTest extends TestCase {
    
    @Test
    public void testEhTrianguloEquilatero(){
        String resultado = "";
        try{
            resultado = Triangulo.tipoTriangulo(3, 3, 3);
        }
        catch(Exception e){
            fail("Erro! Não é triangulo equilatero");
        }
        assertEquals(resultado, "Equilatero");
    }
    @Test
    public void testEhTrianguloIsosceles(){
        String resultado = "";
        try{
            resultado = Triangulo.tipoTriangulo(4, 4, 7);
        }
        catch(Exception e){
            fail("Erro! Não é triangulo isosceles");
        }
        assertEquals(resultado, "Isosceles");
    }
    @Test
    public void testEhTrianguloEscaleno(){
        String resultado = "";
        try{
            resultado = Triangulo.tipoTriangulo(3, 4, 5);
        }
        catch(Exception e){
            fail("Erro! Não é triangulo escaleno");
        }
        assertEquals(resultado, "Escaleno");
    }
    @Test
    public void testNaoEhTriangulo(){
        String resultado = "";
        try{
            resultado = Triangulo.tipoTriangulo(2, 1, 1);
            fail("Erro no teste! Valores não formam um triangulo");
        }
        catch(Exception e){
        }
    }
    @Test
    public void testValorZero(){
        String resultado = "";
        try{
            resultado = Triangulo.tipoTriangulo(0, 1, 1);
            fail("Erro no teste! Valor '0' não forma um triangulo");
        }
        catch(Exception e){
        }
    }
}
