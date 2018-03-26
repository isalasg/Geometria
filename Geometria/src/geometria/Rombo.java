/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

import geometria.Figura;

/**
 *
 * @author Andy
 */
public class Rombo extends Figura {
       double DiagonalSuperior = 0;
    double DiagonalInferior = 0;
    double a, b, c, d =0;

    public void Calculo(double DiagonalSuperior, double DiagonalInferior, double a, double b, double c, double d )
    {
        Area = DiagonalSuperior * DiagonalInferior /2;
        Perimetro = a + b + c + d;     
    }

    public double getArea() {
        return Area;
    }

    public double getPerimetro() {
        return Perimetro;
    }
    
    
}
