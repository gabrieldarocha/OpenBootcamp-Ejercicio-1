public class Ejercicio_switch {
    public static void main(String[] args) {
        // Le pasamos una estación de ejemplo, en este caso verano
        String estacion = "verano";

        switch (estacion) {
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            default:
                System.out.println("No es una estación");

        }
    }
}
