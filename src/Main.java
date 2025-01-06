import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MonedaAPI consulta = new MonedaAPI();

        System.out.println("Bienvenido a mi conversor de monedas!");
        System.out.println("*************************************");
        System.out.println("Elija la opcion para convertir:");
        System.out.println("- 1) Dolar --> Peso Argentino");
        System.out.println("- 2) Dolar --> Real");
        System.out.println("- 3) Peso Argentino --> Dolar");
        System.out.println("- 4) Peso Argentino --> Real");
        System.out.println("- 5) Real --> Peso Argentino");
        System.out.println("- 6) Real -- Dolar");
        System.out.println("*************************************");
        System.out.println("- 0) Salir");
        var opcion = -1;

        while(opcion != 0){
            opcion = scan.nextInt();

            switch (opcion){
                case 1:
                    TransformarMoneda.convertir("USD", "ARS", consulta, lectura);
                    break;
                case 2:
                    TransformarMoneda.convertir("USD", "BRL", consulta, lectura);
                    break;
                case 3:
                    TransformarMoneda.convertir("ARS", "USD", consulta, lectura);
                    break;
                case 4:
                    TransformarMoneda.convertir("ARS", "BRL", consulta, lectura);
                    break;
                case 5:
                    TransformarMoneda.convertir("BRL", "ARS", consulta, lectura);
                    break;
                case 6:
                    TransformarMoneda.convertir("BRL", "USD", consulta, lectura);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Error. Ingrese una opcion valida");
            }
        }
        System.out.println("Gracias por utilizarnos :)");
    }
}