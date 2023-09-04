package br.sena.sp.jandira.calculofogeometrico.model;

import java.util.Scanner;

public class Cadastro {

    Triangulo newObjTriangulo = new Triangulo();
    Circulo newObjCirculo = new Circulo();
    Quadrado newObjQuadrado = new Quadrado();
    Retangulo newObjRetangulo = new Retangulo();
    Scanner teclado = new Scanner(System.in);

    /**Instanciar o metodo Cadastro */

    public Triangulo cadastroTriangulo (){


        System.out.println("\n----------------------------CADASTRO TRIANGULO----------------------");

        System.out.print("Entre com o valor da BASE: ");
        newObjTriangulo.base = teclado.nextDouble();
        System.out.print("Entre com o valor a ALTURA: ");
        newObjTriangulo.altura = teclado.nextDouble();
        return newObjTriangulo;


    }

    public Circulo cadastroCirculo(){

        System.out.println("\n----------------------------CADASTRO CIRCULO----------------------");
        System.out.print(("Entre com valor do RAIO:  "));
        newObjCirculo.raio=teclado.nextDouble();
        return newObjCirculo;

    }

    public Quadrado cadastroQuadrado(){
        System.out.println("\n----------------------------CADASTRO QUADRADO----------------------");
        System.out.println("Entre com o valor do LADO 1: ");
        newObjQuadrado.lado1 = teclado.nextDouble();
        System.out.println("Entre com o valor do LADO 2: ");
        newObjQuadrado.lado2 = teclado.nextDouble();
        return newObjQuadrado;
    }

    public Retangulo cadastroRetangulo(){
        System.out.println("\n----------------------------CADASTRO Retangulo----------------------");
        System.out.println("Entre com o valor do LADO 1: ");
        newObjRetangulo.lado1 = teclado.nextDouble();
        System.out.println("Entre com o valor do LADO 2: ");
        newObjRetangulo.lado2 = teclado.nextDouble();
        return newObjRetangulo;
    }



}
