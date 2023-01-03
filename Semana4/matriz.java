package SegundoBimestre.Semana4;

public class matriz {
    public static void main(String[] args) {
        //int matriz []= new int [2][3];
       // System.out.println(matriz [1][2]);
        // creacione una matriz con valores predefinidos
        String univ [][] = {
                {"utpl","ucuenca", "espol"},
                {"unl", "uazuay", "uide"}
        };
        int filas = univ.length;
        int columnas = univ[1].length;
        for (int fila = 0; fila <filas ; fila++){
            for (int col = 0; col <columnas ; col++) {
                System.out.print(univ[fila][col]+ "\t");
            }
            System.out.println();
        }


    }
}
