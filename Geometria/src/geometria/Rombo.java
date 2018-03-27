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
    private double DiagonalSuperior;
    private double DiagonalInferior;
    private double a, b, c, d;

    public Rombo() {
        DiagonalSuperior = 0;
        DiagonalInferior = 0;
        a = 0;
        b = 0;
        c = 0;
        d = 0;
    }

    
    public void CalculoArea()
    {
        Area = DiagonalSuperior * DiagonalInferior /2;  
    }
    
    public void CalculoPerimetro()
    {
        Perimetro = a + b + c + d;     
    }

    public double getDiagonalSuperior() {
        return DiagonalSuperior;
    }

    public void setDiagonalSuperior(double DiagonalSuperior) {
        this.DiagonalSuperior = DiagonalSuperior;
    }

    public double getDiagonalInferior() {
        return DiagonalInferior;
    }

    public void setDiagonalInferior(double DiagonalInferior) {
        this.DiagonalInferior = DiagonalInferior;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }
    
}
