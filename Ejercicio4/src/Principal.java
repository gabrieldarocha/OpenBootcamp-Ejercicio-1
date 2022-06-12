import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Principal {
    //DecimalFormat para imprimir con 2 decimales luego del punto
    private static final DecimalFormat crFm = new DecimalFormat("0.00");
    public static void main(String[] args) {

        Cliente c1 = new Cliente();
        Trabajador t1 = new Trabajador();
        //Cliente 1
        c1.edad = 25;
        c1.nombre = "Pepe";
        c1.telefono = "+598 95 955 955";
        c1.credito = 1500.20;
        System.out.println("Nombre: " + c1.nombre + ", edad: " + c1.edad + ", telefono: " + c1.telefono + ", --crédito: " + crFm.format(c1.credito));
        //Trabajador 1
        t1.edad = 27;
        t1.nombre = "Juan";
        t1.telefono = "+598 45 458 458";
        t1.salario = 50000;
        System.out.println("Nombre: " + t1.nombre + ", edad: " + t1.edad + ", telefono: " + t1.telefono + ", -salario: " + t1.salario);

    }
}

class Persona{

     int edad;
     String nombre;
     String telefono;

}

class Cliente extends Persona {
     double credito;
}

class Trabajador extends Persona {
     int salario;
}
