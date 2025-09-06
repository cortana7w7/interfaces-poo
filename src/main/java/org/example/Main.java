package org.example;

public class Main {
    public static void main(String[] args) {
        cuadrado cuadrado1 = new cuadrado();
        circulo circulo1 = new circulo();
        System.out.println("area del cuadrado: " + cuadrado1.area());
        System.out.println("perimetro del cuadrado" + cuadrado1.perimetro());
        System.out.println("Área del círculo: " + circulo1.areaC());
        System.out.println("Perímetro del círculo: " + circulo1.perimetroC());
        }

    }