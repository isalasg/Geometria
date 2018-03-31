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
    private double LadoA;
    private double LadoB;
    private double LadoC;
    private double S;
    public Triangulo()
    {
        LadoA = 0;
        LadoB = 0;
        LadoC = 0;
        S = 0; 
    }

    public void setLadoA(double LadoA) {
        this.LadoA = LadoA;
    }
    public void setLadoB(double LadoB) {
        this.LadoB = LadoB;
    }
    public void setLadoC(double LadoC) {
        this.LadoC = LadoC;
    }    
    public double getLadoA() {
        return LadoA;
    }
    public double getLadoB() {
        return LadoB;
    }
    public double getLadoC() {
        return LadoC;
    }    
    public void calcularperimetro()
    {
        Perimetro = LadoA+LadoB+LadoC;
    }
    public void calculararea()
    {
        S = Perimetro/2;
        Area = Math.sqrt((S)*((S -LadoA)*(S - LadoB)*(S - LadoC)));
    }
}
