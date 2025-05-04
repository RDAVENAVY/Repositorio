/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javier
 */
package geometria;

/**
 * Clase principal que demuestra el uso de las figuras geométricas.
 * Contiene el método main para ejecutar ejemplos de cálculo de áreas.
 * 
 * @author RDAVENAVY
 * @version 1.0
 * @since 04/05/2025
 */
public class Geometria {

    /**
     * Método principal que ejecuta ejemplos de cálculo de áreas
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        // Ejemplo con cuadrado
        Cuadrado cuadrado = new Cuadrado(10);
        cuadrado.area();
        System.out.println("Área del cuadrado de lado 10: " + 
                cuadrado.getareaCuadrado());
        
        // Ejemplo con círculo
        Circulo circulo = new Circulo(200);
        circulo.area();
        System.out.println("Área del círculo de radio 200: " + 
                circulo.getAreaRadio());
        
        // Ejemplo con rectángulo
        Rectangulo rectangulo = new Rectangulo(100, 20);
        rectangulo.area();
        System.out.println("Área del rectángulo de base 100 y altura 20: " + 
                rectangulo.getAreaRectangulo());

        // Ejemplo con triángulo
        Triangulo triangulo = new Triangulo(5, 10);
        triangulo.area();
        System.out.println("Área del triángulo de base 5 y altura 10: " + 
                triangulo.getareaTriangulo());
    }
}
