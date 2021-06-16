package com.company;

import static java.lang.Math.PI;

public class Area {
    public static double Circulo(double radio){return PI * radio * radio;}
    public double Esfera(int radio){return 4 * PI * radio * radio;}
    public double Cuadro(double lado){return lado * lado;}
    public double Cubo(double lado){return 6 * lado * lado;}
    public double Triangulo(double base, double altura ){return base * altura / 2;}
}
