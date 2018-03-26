/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author Kique Castro
 */
public class Rectangulo {
    
    protected double Ancho;
    protected double Largo;
    
    public double getAncho() {
        return Ancho;
    }

    public double getLargo() {
        return Largo;
    }
   
    public double CalcularPerimetro()
    {
        double Perimetro = 2 * Largo + 2 * Ancho;
        return Perimetro;
    }
    public double CalcularArea()
    {
        double Area = Ancho * Largo;
        return Area;
    }
    
    
}
