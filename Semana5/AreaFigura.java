package bimestre2.Semana5;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class AreaFigura {
    public static void main(String[] args) {
        System.out.println("PROGRAMA PARA OBTENER EL AREA DE FIGURAS GEOMETRICAS");
        System.out.println("Digite 1 para obtener el area de un circulo");
        System.out.println("digite 2 para obtener el area de un cuadrado");
        System.out.println("digite 3 para obtener el area de un cilindro");
        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();
        seleccionar_figura(opcion);

    }
    public static void seleccionar_figura (int opcion){
        switch (opcion){
            case 1:
                System.out.println("ingrese el valor del radio: ");
                double radio= teclado.nextIn();
                double area= obtener_area_circunferencia(radio);
                System.out.println("el area es: "+radio+"");
        }
    }
    public static double obtener_area_circunferencia(double radio){
        double area = Math.PI * Math.pow (radio, 2);
        return area;

    }
    public double obtener_area_cuadrado(double lado){
        double area = lado*lado;
        return area;
    }
    public void obtener_area_cilindro(){}

}
