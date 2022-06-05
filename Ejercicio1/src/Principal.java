public class Principal {

    public static void main(String[] args) {
        //Parte 1, no pide imprimir la variable solo asignar valores
        suma(10, 20, 50);
        //Parte 2
        Coche miCoche = new Coche();
        miCoche.agregarPuertas();
        System.out.println(miCoche.cantPuertas);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}
