import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ConversionRequest consulta = new ConversionRequest();

        int option = 0;
        boolean notValid = true;

        while (true) {
            while (notValid) {
                System.out.println("********************************************\n");
                System.out.println("Bienvenido al conversor de monedas");
                System.out.println("1) Dolar Estadounidense ==> Peso Argentino");
                System.out.println("2) Peso Argentino ==> Dolar Estadounidense");
                System.out.println("3) Dolar Estadounidense ==> Real Brasileño");
                System.out.println("4) Real Brasileño ==> Dolar Estadounidense");
                System.out.println("5) Dolar Estadounidense ==> Peso Colombiano");
                System.out.println("6) Peso Colombiano ==> Dolar Estadounidense");
                System.out.println("7) Salir");
                System.out.println("-----------------------------------");
                System.out.print("Opción: ");
                try {
                    option = scan.nextInt();
                    notValid = false;
                } catch (Exception e) {
                    System.out.println("Solo se aceptan números enteros dentro del rango");
                }
                scan.nextLine();
            }
            notValid = true;
            switch (option) {
                case 1:
                    ConversionMoneda.convertirMoneda("USD", "ARS", consulta, scan);
                    break;
                case 2:
                    ConversionMoneda.convertirMoneda("ARS", "USD", consulta, scan);
                    break;
                case 3:
                    ConversionMoneda.convertirMoneda("USD", "BRL", consulta, scan);
                    break;
                case 4:
                    ConversionMoneda.convertirMoneda("BRL", "USD", consulta, scan);
                    break;
                case 5:
                    ConversionMoneda.convertirMoneda("USD", "COP", consulta, scan);
                    break;
                case 6:
                    ConversionMoneda.convertirMoneda("COP", "USD", consulta, scan);
                    break;
                case 7:
                    System.out.println("Gracias por usar el servicio");
                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}