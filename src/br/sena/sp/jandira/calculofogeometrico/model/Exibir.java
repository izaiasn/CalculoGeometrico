package br.sena.sp.jandira.calculofogeometrico.model;

public class Exibir {
    Triangulo newObjetoTriangulo =  new Triangulo();

    public void ExibeTriangulo( Triangulo triangulo){
        System.out.println("Area do Triangulo: "+triangulo.area);
        System.out.println("Perimetro do Triangulo: "+triangulo.perimetro);

    }

    public void ExibeCirculo(Circulo circulo){
        System.out.println("Area do Circulo: "+ circulo.area);
        System.out.println("Perimetro do Circulo: " + circulo.perimetro+"cm");
    }

    public void ExibeQuadrado(Quadrado quadrado){
        System.out.println("Area do Quadrado: "+ quadrado.area);
        System.out.println("Perimetro do Quadrado: "+ quadrado.perimetro);
    }

    public void ExibeRetangulo(Retangulo retangulo){
        System.out.println("Area do Retangulo: "+ retangulo.area);
        System.out.println("Primentro do Retangulo: "+ retangulo.perimetro);
    }

}
