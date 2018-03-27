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
public class Rectangulo extends Figura {
    
    private double Ancho;
    private double Largo;
    
    public double getAncho() {
        return Ancho;
    }

    public double getLargo() {
        return Largo;
    }

    public void setAncho(double Ancho) {
        this.Ancho = Ancho;
    }

    public void setLargo(double Largo) {
        this.Largo = Largo;
    }
   
    public void CalcularPerimetro()
    {
        double Perimetro = 2 * Largo + 2 * Ancho;
    }
    public void CalcularArea()
    {
        double Area = Ancho * Largo;
    }
    
    
}
