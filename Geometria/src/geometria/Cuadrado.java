/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 * Clase que representa un cuadrado geométrico y calcula su área.
 * Implementa la interfaz FiguraGeometrica.
 * 
 * @author RDAVENAVY
 * @version 1.0
 * @since 04/05/2025
 */
public class Cuadrado implements FiguraGeometrica {
    /**
     * Longitud del lado del cuadrado.
     */
    private double lado;
    
    /**
     * Área calculada del cuadrado (lado * lado).
     */
    private double areaCuadrado;

    /**
     * Constructor que crea un cuadrado con lado específico.
     * @param lado Longitud del lado (debe ser > 0).
     */
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    // Métodos documentados como en Circulo.java...
}
