package br.sena.sp.jandira.calculofogeometrico.model;

public class Triangulo {
    public  double base;
    public  double altura;
    public  double area;
    public double perimetro;

    /** Após crias as váriais criar o metodo da classe (Triangulo) */

    public double CalcularAreaTriangulo(){
        area = (base * altura)/2;
        return area;
    }


    public double CalculaPerimetroTriangulo(){
        perimetro = (base+ altura)*2;
        return perimetro;
    }



}

