package SegundoBimestre.semana2;

public class Arreglo {
    public static void main(String[] args) {
        String universidades [] = {"utpl", "unl", "espol", "ucuenca", "usfq"};
        int tam = universidades.length;
        System.out.println("tamaño del arreglo: " + tam);
        for (int indice = 1; indice < 5; indice ++) {
            System.out.println(universidades[indice] + "\t");
        }
        int notas [] = {7,8,5,4,10};
        for(int indice = 0; indice < notas. length; indice ++){
            System.out.println(notas[indice]);
        }
        char vocales[] = {'a','e','i','o','u'};
        for (int indice=0; indice< vocales.length; indice++){
            System.out.println(vocales[indice]);
        }
        boolean valores []= {true,false,false,true};
        for (int indice = 0 ; indice < valores.length ; indice ++){
            System.out.println(valores[indice]);
        }
    }
}
