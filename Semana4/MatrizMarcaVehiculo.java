package Bimestre2.Semana4;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Locale;
import java.util.Scanner;

public class MatrizMarcaVehiculo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese numero de filas");
        int filas = teclado.nextInt();
        System.out.println("Ingrese numero de columnas");
        int cols = teclado.nextInt();
        teclado.nextLine();
        String marcas [][] = new String[filas][cols];
        for (int fila1 = 0; fila1 < filas; fila1++) {
            for (int col1 = 0; col1 < cols; col1++) {
                System.out.println("Ingrese el valor para posicion ["+fila1+"]["+col1+"]");
                marcas [fila1][col1] = teclado.nextLine();
            }
        }
        boolean salir = false;
        while(salir == false){
            System.out.println("Digite 1 para realizar una busqueda");
            System.out.println("Digite 2 para modificar un valor");
            System.out.println("Digite 3 para eliminar un valor");
            System.out.println("Digite 4 para visualizar la matriz");
            System.out.println("Digite 5 para salir");
            int opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("HAZ SELECCIONADO LA OPERACION BUSQUEDA");
                    System.out.println("QUE MARCA BUSCA?");
                    String marca_buscada= teclado.nextLine().toLowerCase();
                    boolean encontrado = false;
                    for (int fila = 0; fila < filas; fila++) {
                        for (int col = 0; col < cols; col++) {
                            if(marcas[fila][col].equals(marca_buscada)){
                                System.out.println("si se encontro la marca:"+marca_buscada);
                                System.out.println("en la posicion: ["+fila+"]["+col+"]");
                                encontrado = true;
                                break;
                            }
                        }

                    }
                    if (encontrado == false)
                        System.out.println("marca no encontrada");
                    break;
                case 2:
                    System.out.println("HAZ SELECCIONADO LA OPERACION DE MODIFICACION");
                    System.out.println("INGRESE QUE FILA DESEA MODIFICAR");
                    int fila1 = teclado.nextInt();
                    System.out.println("INGRESE QUE COLUMNA DESEA MODIFICAR");
                    int col1 = teclado.nextInt();
                    System.out.println("CUAL ES LA NUEVA MARCA A INGRESAR?");
                    String nueva_marca = teclado.nextLine();
                    marcas[fila1][col1]= nueva_marca;
                    break;
                case 3:
                    System.out.println("HAZ SELECCIONADO LA OPERACION DE ELIMINACION");
                    System.out.println("QUE MARCA DESEA ELIMINAR?");
                    String marca_a_eliminar = teclado.nextLine().toLowerCase();
                    for (int fila = 0; fila < filas; fila++) {
                        for (int col = 0; col < cols; col++) {
                            if (marcas [fila][col].equals((marca_a_eliminar))){
                                marcas[fila][col] = "";
                            }


                        }

                    }

                    break;
                case 4:
                    System.out.println("HAZ SELECCIONADO LA OPERACION LECTURA");
                    for (int fila = 0; fila < filas; fila++) {
                        for (int col = 0; col < cols; col++) {
                            System.out.println(marcas[fila][col]+"\t");
                        }

                    }
                    break;
                case 5:
                    System.out.println("HASTA PRONTO");
                    salir=true;
                default:
                    System.out.println("ERROR");
            }
        }
    }
}
