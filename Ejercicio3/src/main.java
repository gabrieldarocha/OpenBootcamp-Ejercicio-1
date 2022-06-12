public class main {
    public static void main(String[] args) {
        Persona miPersona = new Persona();
        miPersona.setEdad(23);
        miPersona.setNombre("Gabriel");
        miPersona.setTelefono("+598 98 36 79 05");

        System.out.println("Nombre: " + miPersona.getNombre() + " Edad: " + miPersona.getEdad() + " Telefono: " + miPersona.getTelefono());
    }
}
