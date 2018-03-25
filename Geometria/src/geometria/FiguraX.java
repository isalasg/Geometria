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
public class FiguraX extends Figura {
    private float TalAtributo;

    public FiguraX() {
        TalAtributo = 0;
    }
    
    public void CalcularArea() {
        Area = TalAtributo * 5;
    }

    public void CalcularPerimetro() {
        Perimetro = TalAtributo * 2;
    }
    public float getTalAtributo() {
        return TalAtributo;
    }

    public void setTalAtributo(float TalAtributo) {
        this.TalAtributo = TalAtributo;
    }    
}
