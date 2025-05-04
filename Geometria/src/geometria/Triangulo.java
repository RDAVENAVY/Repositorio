/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 * Clase que representa un triángulo geométrico.
 * Implementa la interfaz FiguraGeometrica para el cálculo de áreas.
 * 
 * @author RDAVENAVY
 * @version 1.0
 * @since 04/05/2025
 */
public class Triangulo implements FiguraGeometrica {
    /**
     * Base del triángulo
     */
    private double base;
    
    /**
     * Altura del triángulo
     */
    private double altura;
    
    /**
     * Área calculada del triángulo
     */
    private double areaTriangulo;

    /**
     * Constructor que crea un triángulo con base y altura específicas
     * @param base La base del triángulo (debe ser mayor que 0)
     * @param altura La altura del triángulo (debe ser mayor que 0)
     */
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getareaTriangulo() {
        return areaTriangulo;
    }

    @Override
    public void area() {
        areaTriangulo = base * altura / 2;
    }
}
