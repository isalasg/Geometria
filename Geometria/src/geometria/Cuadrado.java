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
public class Cuadrado extends Figura{
    private float lado;
    public Cuadrado(){
        lado=0;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }


    public void calcularArea() {
        Area=lado*lado;
    }

    public void calcularPerimetro() {
        Perimetro=lado*4;
    }
    
}
