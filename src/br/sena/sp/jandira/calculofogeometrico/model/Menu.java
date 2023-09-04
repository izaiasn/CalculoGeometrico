package br.sena.sp.jandira.calculofogeometrico.model;

import java.util.Scanner;

public class Menu {
    Scanner teclado = new Scanner(System.in);
    Cadastro newObjCadastro = new Cadastro();
    Exibir newObjtExib = new Exibir();
    int opcao=-1;
    String sair = " ";



    public void Menu(){
        while (! sair.equalsIgnoreCase("SIM")) {
            System.out.println("########################################################################");
            System.out.println("\n-----------------------------MENU CALCULADORA-----------------------");
            System.out.println("\n######################################################################");
            System.out.println("\nPara calculo do Triangulo  digite 1 ");
            System.out.println("Para calculo do Circulo     digite 2 ");
            System.out.println("Para calculo do Quadrado    digite 3 ");
            System.out.println("Para calculo do Quadrado    digite 4 ");
            System.out.print("\nPara continuar Digite uma das  opções acima ");
            opcao = teclado.nextInt();

            switch (opcao) {

                case 1:
                    /**Instanciar Objeto Triangulo recebendo Objeto Cadastro*/
                    Triangulo newObjtriangulo = newObjCadastro.cadastroTriangulo();
                    /** newObjTriangulo passa os parâmetros de CalculaAre e CalculaPerimetro na Classe Triangulo*/
                    newObjtriangulo.CalcularAreaTriangulo();
                    newObjtriangulo.CalculaPerimetroTriangulo();
                    /**Para exibir os dados chamar o newObjetoExibe passando o Objeto a ser exibito newObjTriangulo*/
                    newObjtExib.ExibeTriangulo(newObjtriangulo);
                    break;
                case 2:
                    Circulo newObjCirculo = newObjCadastro.cadastroCirculo();
                    newObjCirculo.CalcularAreaCirculo();
                    newObjCirculo.CalculoPerimetroCirculo();
                    newObjtExib.ExibeCirculo(newObjCirculo);
                    break;
                case 3:
                    Quadrado newObjQuadrado = newObjCadastro.cadastroQuadrado();
                    newObjQuadrado.calculoAreaQuadrado();
                    newObjQuadrado.calculoPerimetroQuadrado();
                    newObjtExib.ExibeQuadrado(newObjQuadrado);
                    break;

                case 4:
                    Retangulo newObjRetangulo = newObjCadastro.cadastroRetangulo();
                    newObjRetangulo.calculoAreaRetangulo();
                    newObjRetangulo.calculoPerimetroRetangulo();
                    newObjtExib.ExibeRetangulo(newObjRetangulo);
                    break;

                default:
                    System.out.println("Opção digitada inválida!!");

            }
            System.out.println("Deseja sair ?");
            sair = teclado.next();

        }

    }






}
