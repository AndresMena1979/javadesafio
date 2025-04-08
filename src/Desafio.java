import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        String nombre = "Tony Stark";
        String TipoDeCuenta = "Corriente";
        double SaldoDisponible = 1599.99;
        Scanner ingresaNumeroOpcion = new Scanner(System.in);
        Scanner ingresaSaldoRetiro = new Scanner(System.in);
        Scanner ingresaSaldoDeposito = new Scanner(System.in);

        System.out.println("****************************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("Tipo de cuenta: " + TipoDeCuenta);
        System.out.println("Saldo disponible: " + SaldoDisponible);
        System.out.println("\n **************************************");

        double saldoParaRetiro=0;
        double saldoParaDeposito=0;



     int opcionEscogida = 0;


     while(opcionEscogida != 9){


         System.out.println("** Escriba el numero de la opcion deseada **");  //menu
         System.out.println("1 - Consultar Saldo");
         System.out.println("2 - Retirar");
         System.out.println("3 - Depositar");
         System.out.println("9 - Salir");

         opcionEscogida = ingresaNumeroOpcion.nextInt(); //opcion escogida por el cliente

      switch (opcionEscogida){

          case 1:
              System.out.println("Tu saldo actual es: " + SaldoDisponible);


             break;


          case 2:
              System.out.println("Escribe el saldo a retirar: "); // Mensaje pidiendo el saldo

              saldoParaRetiro = ingresaSaldoRetiro.nextDouble();  // El cliente digita el saldo a retirar

            if(saldoParaRetiro > SaldoDisponible){   // se crea condicion en el caso de que el saldo a retirar sea mayor

                System.out.println("Saldo insuficiente");

                break;
            } else {

                double totalRestante = SaldoDisponible - saldoParaRetiro;

                System.out.println("Saldo restante: " + totalRestante);

                SaldoDisponible = totalRestante;

                break;
            }



          case 3:

              System.out.println("Escribe el saldo a depositar");
              saldoParaDeposito = ingresaSaldoDeposito.nextInt();

             double  totalRestantedeposito = SaldoDisponible + saldoParaDeposito;

              System.out.println("Tu saldo actual es: " + totalRestantedeposito);

              SaldoDisponible = totalRestantedeposito;

             break;

          case 9:

              System.out.println("Haz Salido de la aplicación");

              break;

          default:

              System.out.println("No haz ingresado un numero valido");

              break;




      }
     }

    }
}

