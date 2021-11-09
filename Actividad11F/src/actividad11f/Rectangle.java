/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad11f;

/**
 *
 * @author jc_ca
 */
public class Rectangle implements Shape{
    
    private double baseR;
    private double alturaR;

    public Rectangle(double baseR, double alturaR) {
        this.baseR = baseR;
        this.alturaR = alturaR;
    }

    public double getBaseR() {
        return baseR;
    }

    public void setBaseR(double baseR) {
        this.baseR = baseR;
    }

    public double getAlturaR() {
        return alturaR;
    }

    public void setAlturaR(double alturaR) {
        this.alturaR = alturaR;
    }

    
    @Override
    public double getArea() {
    return baseR * alturaR;
    }

    @Override
    public double getPerimetro() {
        return (baseR*2)+(alturaR*2);
    }
    
}