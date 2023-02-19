import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Evento evento = new Evento();

        String a = "10/10/10";
        evento.setFecha(a);
        System.out.println(evento.getFecha());

        int opc;
        do {
            System.out.println("Menu\n 1.- Agregar\n 2.- Editar\n 3.- Mostrar\n 4.- Salir");
            System.out.println("Ingresa una opcion: ");
            opc = sc.nextInt();

            switch(opc) {

                case 1:

                    int opc2;
                    do{
                        System.out.println("Que campo deseas Agregar?");
                        System.out.println(" 1.- Fecha\n 2.- Hora\n 3.- Lugar\n 4.- Capacidad\n 5.- Costo Boleto\n 6.- Regresar");
                        opc2 = sc.nextInt();

                        switch (opc2) {

                            case 1:
                                System.out.println("Ingresa fecha (dd/mm/yy): ");
                                String fecha = sc.nextLine();
                                fecha = sc.nextLine();
                                evento.setFecha(fecha);
                                break;
                            case 2:
                                System.out.println("Ingresa Hora (HH/MM): ");
                                String hora = sc.nextLine();
                                hora = sc.nextLine();
                                evento.setHora(hora);
                                break;
                            case 3:
                                System.out.println("Ingresa Lugar: ");
                                String lugar = sc.nextLine();
                                lugar = sc.nextLine();
                                evento.setLugar(lugar);
                                break;
                            case 4:
                                System.out.println("Ingresa Capacidad: ");
                                int capacidad = sc.nextInt();
                                evento.setCantidad(capacidad);
                                break;
                            case 5:
                                System.out.println("Ingresa el costo del boleto: ");
                                double costo = sc.nextDouble();
                                evento.setCosto(costo);
                                break;
                        }}while(opc2 != 6);
                break;

                case 2:

                    int opc3;
                    do{
                        System.out.println("Que campo deseas Editar?");
                        System.out.println(" 1.- Fecha\n 2.- Hora\n 3.- Lugar\n 4.- Capacidad\n 5.- Costo Boleto\n 6.- Regresar");
                        opc3 = sc.nextInt();

                        switch (opc3) {

                            case 1:
                                System.out.println("Ingresa fecha (dd/mm/yy): ");
                                String fecha = sc.nextLine();
                                fecha = sc.nextLine();
                                evento.setFecha(fecha);
                                break;
                            case 2:
                                System.out.println("Ingresa Hora (HH/MM): ");
                                String hora = sc.nextLine();
                                hora = sc.nextLine();
                                evento.setHora(hora);
                                break;
                            case 3:
                                System.out.println("Ingresa Lugar: ");
                                String lugar = sc.nextLine();
                                lugar = sc.nextLine();
                                evento.setLugar(lugar);
                                break;
                            case 4:
                                System.out.println("Ingresa Capacidad: ");
                                int capacidad = sc.nextInt();
                                evento.setCantidad(capacidad);
                                break;
                            case 5:
                                System.out.println("Ingresa el costo del boleto: ");
                                double costo = sc.nextInt();
                                evento.setCosto(costo);
                                break;
                        }}while(opc3 != 6);

                    break;

                case 3:
                    System.out.println("Fecha: " + evento.getFecha());
                    System.out.println("Hora: " + evento.getHora());
                    System.out.println("Lugar: " + evento.getLugar());
                    System.out.println("Cantidad: "+evento.getCantidad());
                    System.out.println("Costo Boleto: "+evento.getCosto());
                break;

            }
        } while (opc != 4);


    }

}