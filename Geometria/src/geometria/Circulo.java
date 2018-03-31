/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author Clara Cerrillo
 */
public class Circulo extends Figura {

    private float Radio;
    private float Diametro;

    public Circulo() {
        Radio = 0;
        Diametro = 0;
    }

    public float getRadio() {
        return Radio;
    }

    public void setRadio(float Radio) {
        this.Radio = Radio;
    }

    public float getDiametro() {
        return Diametro;
    }

    public void setDiametro(float Diametro) {
        this.Diametro = Diametro;
    }

    public void calcularArea() {
        Area = Math.PI * Math.pow(Radio, 2);
    }

    public void calcularPerimetro() {
        Perimetro = Math.PI * Diametro;
    }

}
