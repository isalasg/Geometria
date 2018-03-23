/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author isala
 */
public class Figura {
    protected double Area;
    protected double Perimetro;

    public Figura() {
        Area = 0;
        Perimetro = 0;
    }

    public double getArea() {
        return Area;
    }

    public double getPerimetro() {
        return Perimetro;
    }
}
