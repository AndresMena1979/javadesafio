import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        String nombre = "Tony Stark";
        String TipoDeCuenta = "Corriente";
        double SaldoDisponible = 1599.99;
        Scanner ingresaNumeroOpcion = new Scanner(System.in);
        Scanner ingresaSaldoRetiro = new Scanner(System.in);

        double saldoParaRetiro=0;


        System.out.println("****************************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("Tipo de cuenta: " + TipoDeCuenta);
        System.out.println("Saldo disponible: " + SaldoDisponible);
        System.out.println("\n **************************************");
        System.out.println("** Escriba el numero de la opcion deseada **");
        System.out.println("1 - Consultar Saldo");
        System.out.println("2 - Retirar");
        System.out.println("3 - Depositar");
        System.out.println("9 - Salir");

     int opcionEscogida = ingresaNumeroOpcion.nextInt();

      switch (opcionEscogida){

          case 1:
              System.out.println("Tu saldo actual es: " + SaldoDisponible);

          System.out.println("** Escriba el numero de la opcion deseada **");
          System.out.println("1 - Consultar Saldo");
          System.out.println("2 - Retirar");
          System.out.println("3 - Depositar");
          System.out.println("9 - Salir");

           opcionEscogida = ingresaNumeroOpcion.nextInt();

          case 2:
              System.out.println("Escribe el saldo a retirar: "); // Mensaje pidiendo el saldo

              saldoParaRetiro = ingresaSaldoRetiro.nextDouble();  // El cliente digita el saldo a retirar

           double totalRestante = SaldoDisponible - saldoParaRetiro;

              System.out.println("Saldo restante: " + totalRestante);

              System.out.println("** Escriba el numero de la opcion deseada **");
              System.out.println("1 - Consultar Saldo");
              System.out.println("2 - Retirar");
              System.out.println("3 - Depositar");
              System.out.println("9 - Salir");

              opcionEscogida = ingresaNumeroOpcion.nextInt();

          case 3:

              System.out.println("Escribe el saldo a depositar");

      }


    }
}
