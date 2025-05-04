/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 * Clase que representa un círculo geométrico.
 * Implementa la interfaz FiguraGeometrica.
 */
public class Circulo implements FiguraGeometrica {
    private double radio;
    private double areaRadio;
    static final double pi = 3.1415;

    public Circulo(double radio) {
        this.radio = radio;
    }

    /**
     * Obtiene el valor del radio del círculo
     * @return El valor actual del radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Establece un nuevo valor para el radio
     * @param radio Nuevo valor del radio (debe ser mayor que 0)
     * @throws IllegalArgumentException Si el radio es menor o igual a 0
     */
    public void setRadio(double radio) {
        if(radio <= 0) {
            throw new IllegalArgumentException("El radio debe ser positivo");
        }
        this.radio = radio;
    }

    public double getAreaRadio() {
        return areaRadio;
    }

    @Override
    public void area() {
        areaRadio = pi * radio * radio;
    }
}
