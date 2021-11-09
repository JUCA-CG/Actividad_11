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
public class Circle implements Shape {
    
    public static final double pi = 3.141592;
    protected double radio;
    public Circle(double radio) {
        this.radio = radio;
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

     public double getDiametro() {
        return radio * 2;
    }
    
    
    @Override
    public double getArea() {
       return pi*radio*radio;
    }

    @Override
    public double getPerimetro() {
    return pi*getDiametro();
    }
    
    
}