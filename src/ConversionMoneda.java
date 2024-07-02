import java.util.Date;
import java.util.Scanner;

public class ConversionMoneda {
    public static void convertirMoneda(String monedaSubject, String monedaTarget, ConversionRequest consulta, Scanner scan){
        double valor;
        double valorConvertido;
        Date fecha = new Date();

        Monedas monedas = consulta.ConsultarMoneda(monedaSubject, monedaTarget);
        System.out.println("\n**************************************************************************************************");
        System.out.println("* La tasa de conversion del día " +"'"+fecha+"'"+
                " de "+monedaSubject+ " a "+monedaTarget+" es 1 "+monedaSubject+" = "+monedas.conversion_rate()+" "+monedaTarget+" *");
        System.out.println("**************************************************************************************************\n");

        System.out.print("Ingrese el valor a convertir " + monedaSubject+": ");
        valor = Double.parseDouble(scan.nextLine());
        valorConvertido = valor * monedas.conversion_rate();
        System.out.println("La conversión de " + valor + " " + monedaSubject +
                " a "+monedaTarget+" es de " + valorConvertido + " " + monedas.target_code()+"\n");

    }
}
