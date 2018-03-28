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
    private double Perimetro;
    private double Area;
    
    public void setAncho(double Ancho) {
        this.Ancho = Ancho;
    }

    public void setLargo(double Largo) {
        this.Largo = Largo;
    }
   
    public double CalcularPerimetro()
    {
        Perimetro = 2 * Largo + 2 * Ancho;
        return Perimetro;
    }
    public double CalcularArea()
    {
        Area = Ancho * Largo;
        return Area;
    }
    
}
