import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Evento evento = new Evento();

        Scanner sc = new Scanner(System.in);

        int opc;
        do {
            System.out.println("Menu\n 1.- Agregar\n 2.- Editar\n 3.- salir");
            System.out.println("Ingresa una opcion: ");
            opc = sc.nextInt();

            if (opc == 1) {
                int opc2;
                do{
                System.out.println("Que campo deseas modificar?");
                System.out.println(" 1.- Fecha\n 2.- Hora\n 3.- Lugar\n 4.- Capacidad\n 5.- Costo Boleto\n 6.- Regresar");
                opc2 = sc.nextInt();

                switch (opc2) {

                    case 1:
                        System.out.println("Ingresa fecha (dd/mm/yy): ");
                        String fecha = evento.setFecha();
                    break;
                    case 2:
                        System.out.println("Ingresa Hora (HH/MM): ");
                        String hora = evento.setHora();
                    break;
                    case 3:
                        System.out.println("Ingresa Lugar: ");
                        String lugar = evento.setLugar();
                    break;
                    case 4:
                        System.out.println("Ingresa Capacidad: ");
                        int capacidad = evento.setCantidad();
                    break;
                    case 5:
                        System.out.println("Ingresa el costo del boleto: ");
                        double costo = evento.setCosto();
                    break;
                }}while(opc2 != 6);

            }
        } while (opc != 3);


    }

    private static void Editar() {

        //setter

    }

    private static void Agregar() {

        //getters
    }
}