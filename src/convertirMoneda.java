import java.util.Scanner;

public class convertirMoneda {

    public static void convertir(String monedaBase, String monedaTarget, ConsultaAPI consulta, Scanner Scan){
        double cantidad;
        double cantidadConvertida;

        MonedaAPI moneda = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("Ingrese la cantidad de " + monedaBase + " a convertir en " + monedaTarget + ".");
        cantidad = Double.parseDouble(Scan.nextLine());
        cantidadConvertida = cantidad * moneda.conversion_rate();
        System.out.println(cantidad + " " + monedaBase + " = " + cantidadConvertida + " " + moneda.target_code());

    }
}