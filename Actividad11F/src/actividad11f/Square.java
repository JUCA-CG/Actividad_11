package actividad11f;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jc_ca
 */
public class Square implements Shape{
    
    protected double lado;

    public Square(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    

    @Override
    public double getArea() {
        return lado*lado;
    }

    @Override
    public double getPerimetro() {
return lado*4;
    }
    
}