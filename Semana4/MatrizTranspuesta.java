package Bimestre2.Semana4;

public class MatrizTranspuesta {
    public static void main(String[] args) {
        char letras [][]={
                {'a','b','c'},
                {'d','e','f'}
        };
        int filas = letras.length;
        int cols = letras[0].length;
        char transpuesta [][]= new char [filas][cols];
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < cols; col++) {
                transpuesta [fila][col]= letras [col][fila];
                System.out.println(transpuesta[fila][col]+"\t");
            }
        }
        System.out.println();
    }
}
