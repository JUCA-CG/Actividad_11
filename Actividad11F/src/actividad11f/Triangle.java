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
public class Triangle implements Shape{

    private double base;
    private double altura;

    public Triangle(double base) {
        this.base = base;
        this.altura = calcularAltura();
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = calcularAltura();
    }
    
    
    
    @Override
    public double getArea() {
    return (base*altura)/2.0;
    }

    @Override
    public double getPerimetro() {
    return base*3.0;
    }
    
    private double calcularAltura() {
        return (Math.sqrt(3.0) * this.base) / 2.0;
    }
}

