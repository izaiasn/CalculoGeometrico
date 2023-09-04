package br.sena.sp.jandira.calculofogeometrico.model;

public class Quadrado {
    public  double lado1;
    public  double lado2;
    public  double area;
    public  double perimetro;

    public double calculoAreaQuadrado(){
        area = (lado1 * lado2);
        return area;
    }

    public double calculoPerimetroQuadrado(){

        perimetro = (lado1 + lado2)*2;
        return perimetro;
    }

}
