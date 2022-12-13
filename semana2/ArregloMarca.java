package SegundoBimestre.semana2;

import java.util.Locale;
import java.util.Scanner;

public class ArregloMarca {
    public static void main(String[] args) {
        String marcas [];
        System.out.println("Cuantas marcas de vehiculo va a ingresar?");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        marcas = new String[n];
        for (int indice = 0; indice < n; indice++) {
            System.out.println("ingrese el nombre de la marca"+ (indice+1) + ":");
            String marca = teclado.nextLine();
            marcas[indice] = marca;

        }
        System.out.println("lista de marcas ingresadas: ");
        for (int indice = 0; indice < marcas.length; indice++) {
            System.out.println(marcas[indice]+"\t");
        }
        System.out.println("Que nombre de marca desea buscar: ?");
        String marca_busqueda = teclado.nextLine().toUpperCase(Locale.ROOT);
        System.out.println("marca_busqueda:" + marca_busqueda);
        for (int indice = 0; indice < n; indice++) {
            if(marca_busqueda == marcas [indice]){
                System.out.println("Marca Encontrada");
                System.out.println("Se encuentra en el indice: " +indice);
                break;
            }

        }

    }
}
