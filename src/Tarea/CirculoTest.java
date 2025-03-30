/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea;

class CirculoTest {
    public static void main(String[] args) {
     
        Circulo c1 = new Circulo();
        
        System.out.println("El radio del circulo es: " + c1.getRadio());
        System.out.println("El area del circulo es: " + c1.getArea());
        
        Circulo c2 = new Circulo(6.55);
        System.out.println("El nuevo radio edl circulo es: " + c2.getRadio());
        System.out.println("La nueva area del circulo es: " + c2.getArea());
        
    }
}
