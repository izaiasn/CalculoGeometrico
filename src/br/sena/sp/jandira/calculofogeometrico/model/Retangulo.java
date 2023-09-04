package br.sena.sp.jandira.calculofogeometrico.model;

public class Retangulo {
    public double lado1;
    public double lado2;
    double area;
    double perimetro;

    public double calculoAreaRetangulo(){
        area = (lado1*lado2);
        return area;
    }

    public double calculoPerimetroRetangulo(){
        perimetro = (lado1+lado2)*2;
        return perimetro;
    }
}
