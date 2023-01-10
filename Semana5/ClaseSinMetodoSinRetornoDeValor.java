package bimestre2.Semana5;

import java.util.Scanner;

public class ClaseSinMetodoSinRetornoDeValor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para sumar dos numeros");
        System.out.println("ingrese el primer numero:");
        int num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = teclado.nextInt();
        int resultado = sumar(2, 4, 5);//llamamos al metodo y resivimos el valor
        System.out.println("La suma es: "+resultado+"");
       // sumar_dos_numeros(num1, num2);
        //obtener el promedio de los numeros ingresados
        double promedio = obtener_promedio(resultado, 2);
        System.out.println("El promedio de los numeros es : "+promedio+"");
    }

    /**
     * Este metodo realiza la suma de dos numeros enteros
     * @param n1
     * @param n2
     * @return resultado
     */

    public static int sumar(int n1, int n2){
        int resultado = n1 + n2;
        return resultado;
    }
    public static int sumar (int n1, int n2, int n3){
        int resultado = n1 + n2 + n3;
        System.out.println("La suma de los numeros es"+resultado+"");

        return resultado;
    }

    public static void sumar_dos_numeros(int n1, int n2){
        int resultado = n1 + n2;
        System.out.println("La suma de dos numeros es:"+resultado+"");
    }
    public static double obtener_promedio (int suma_total, int cantidad_num){
        double promedio = (double)suma_total/(double)cantidad_num;
        return promedio;
    }

}
