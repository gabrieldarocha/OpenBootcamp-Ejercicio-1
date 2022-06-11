public class Ejercicio_buclewhile {
    public static void main(String[] args) {
        //while
        int numeroWhile = 0;
        // Aumenta en cada iteración
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("N. While: " + numeroWhile);
        }
        // Do While, Se ejecuta una vez y al verificar que 'numeroDoWhile' no cumple la condición, no se executa más.
        int numeroDoWhile = 3;
        do {
            numeroDoWhile++;
            System.out.println("Do N. While: " + numeroDoWhile);
        } while (numeroDoWhile < 3);
    }
}
