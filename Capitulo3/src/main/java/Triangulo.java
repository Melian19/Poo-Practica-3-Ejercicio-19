/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author melian
 */
public class Triangulo {
    
    double lado;
    
    //Constructor
    public Triangulo(double lado){
        this.lado = lado;
    }
    
    public double calcularAltura(){
        return ((Math.sqrt(3) * lado)/2);
    }
    public double calcularArea(){
        return (Math.pow(lado,2) *Math.sqrt(3)/4);
    }
    public double calcularPerimetro(){
        return lado*3;
    }
}
