package br.sena.sp.jandira.calculofogeometrico.model;

public class Circulo {

    public double pi = 3.14;
    public double raio;
    public double area;
    public double perimetro;

    public double CalcularAreaCirculo() {

        area = pi * (raio *raio);
        return area;

    }

    public double CalculoPerimetroCirculo(){
        perimetro = (2*pi)*raio;
        return perimetro;
    }


}
