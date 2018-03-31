/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author atara
 */
public class Cuadrado extends Figura {

    private float Lado;

    public Cuadrado() {
        Lado = 0;
    }

    public void setLado(int Lado) {
        this.Lado = Lado;
    }

    public void calcularArea() {
        Area = Lado * Lado;
    }

    public void calcularPerimetro() {
        Perimetro = Lado * 4;
    }

}
