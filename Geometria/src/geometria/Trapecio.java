/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author KevinCruz
 */
public class Trapecio extends Figura {

    private float Altura;
    private float LadoA;
    private float LadoB;
    private float LadoC;
    private float LadoD;

    public Trapecio() {
        Altura = 0;
        LadoA = 0;
        LadoB = 0;
        LadoC = 0;
        LadoD = 0;
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float Altura) {
        this.Altura = Altura;
    }

    public float getLadoA() {
        return LadoA;
    }

    public void setLadoA(float LadoA) {
        this.LadoA = LadoA;
    }

    public float getLadoB() {
        return LadoB;
    }

    public void setLadoB(float LadoB) {
        this.LadoB = LadoB;
    }

    public float getLadoC() {
        return LadoC;
    }

    public void setLadoC(float LadoC) {
        this.LadoC = LadoC;
    }

    public float getLadoD() {
        return LadoD;
    }

    public void setLadoD(float LadoD) {
        this.LadoD = LadoD;
    }

    public void calcularArea() {
        Area = Altura * ((LadoA + LadoB) / 2);
    }

    public void calcularPerimetro() {
        Perimetro = (LadoA + LadoB + LadoC + LadoD);
    }

}
