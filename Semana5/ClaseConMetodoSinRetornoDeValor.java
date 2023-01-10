package bimestre2.Semana5;

public class ClaseConMetodoSinRetornoDeValor {
    public static void main(String[] args) {
        //crear una variable a partir de nuestra clase
        //ClaseConMetodoSinRetornoDeValor llamada = new ClaseConMetodoSinRetornoDeValor();
        //llamada.saludar();
        saludar_con_nombre("Fabian");
    }
        public static void saludar(){
            System.out.println("Bienvenidos a la creacion de metodos");
            System.out.println("metodo creado en java");
    }
    public static void saludar_con_nombre(String nombre){
        System.out.println("Bienvenidx "+nombre.toUpperCase()+" a la creacion de metodos");
        System.out.println("metodo creado en java");
    }
}
