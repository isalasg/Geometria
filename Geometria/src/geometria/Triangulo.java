/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author 8
 */
public class Triangulo extends Figura {
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double S;
    public Triangulo()
    {
        ladoA = 0;
        ladoB = 0;
        ladoC = 0;
        S = 0; 
    }

    public void setladoA(double ladoA) {
        this.ladoA = ladoA;
    }
    public void setladoB(double ladoB) {
        this.ladoB = ladoB;
    }
    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }    
    public double getladoA() {
        return ladoA;
    }
    public double getladoB() {
        return ladoB;
    }
    public double getladoC() {
        return ladoC;
    }    
    public void calcularperimetro()
    {
        Perimetro = ladoA+ladoB+ladoC;
    }
    public void calculararea()
    {
        S = Perimetro/2;
        Area = Math.sqrt((S)*((S -ladoA)*(S - ladoB)*(S - ladoC)));
    }
}
