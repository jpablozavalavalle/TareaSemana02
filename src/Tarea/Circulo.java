/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea;

public class Circulo {
    private double radio;
    private String color;

    public Circulo() { 
        this.radio = 12.5;
        this.color = "Azul";
    }

   
    public Circulo(double radio) { 
        this.radio = radio;
        this.color = "Azul";
    }

    public double getRadio() {
        return radio;
    }

    public double getArea() {
        return radio * radio * Math.PI;
    }
}

