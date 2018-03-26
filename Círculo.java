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
public class Círculo extends Figura{
    private float radio;
    private float diametro;
    
    public Círculo()
    {
        radio = 0;
        diametro = 0;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }
    public void calcularArea()
    {
        Area = Math.PI * Math.pow(radio, 2);
    }
    public void calcularPerimetro()
    {
        Perimetro = Math.PI * diametro;
    }
    
}
