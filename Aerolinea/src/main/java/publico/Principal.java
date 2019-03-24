package publico;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
/**
 * @author Cristian Romero
 * @version 1.0
 * Clase que contiene los metodos para hacer operaciones de reserva de sillas
 */
public class Principal {
    /**
     * instancia clase estatica de usuario
     */
    static Usuario u = new Usuario();
    /**
     * Instancia clase estatica de Silla
     */
    static Silla silla = new Silla();
    /**
     * Instancia clase estatica de Factura
     */
    static Factura factura = new Factura();
    /**
     * Lista temporal de los usuarios
     */
    List<Usuario> userList = new ArrayList();
    /**
     * Metodo que imprime los aviones y las sillas disponibles
     */
    public void ListarAvion(){
        Scanner sc = new Scanner(System.in);
        String entrada;
        boolean repetir=true;
        while(repetir){
            System.out.println("   OPCIONES DE VUELO");
            System.out.println(" 1 - AVION MIXTO | 2 - AVION ECONOMICO | 3 - AVION VIP");
            try{
                entrada=sc.nextLine();
                byte op = Byte.parseByte(entrada);
                if(op==1){
                    for(Integer sillaa:silla.getSilla().keySet()){
                    Silla sillaAux = silla.getSilla().get(sillaa);
                    System.out.println("-------------------------------------");
                    System.out.println("                    SILAS AVION MIXTO");
                    if((sillaAux.getPrecioSilla()==100000 && sillaAux.isDisponible()==true) || (sillaAux.getPrecioSilla()==50000 && sillaAux.isDisponible()==true))
                        System.out.println("Silla: "+sillaAux.getCodigoSilla()+" | Precio: "+sillaAux.getPrecioSilla());
                    }
                    repetir=false;
                }else if(op==2){
                    for(Integer sillaa:silla.getSilla().keySet()){
                    Silla sillaAux = silla.getSilla().get(sillaa);
                    System.out.println("-------------------------------------");
                    System.out.println("               SILLAS AVION ECONOMICO");
                    if((sillaAux.getPrecioSilla()==30000 && sillaAux.isDisponible()==true))
                        System.out.println("Silla: "+sillaAux.getCodigoSilla()+" | Precio: "+sillaAux.getPrecioSilla());
                    }
                    repetir=false;
                }else if(op==3){
                    for(Integer sillaa:silla.getSilla().keySet()){
                    Silla sillaAux = silla.getSilla().get(sillaa);
                    System.out.println("-------------------------------------");
                    System.out.println("                      SILLA AVION VIP");
                    if((sillaAux.getPrecioSilla()==1300000 && sillaAux.isDisponible()==true))
                        System.out.println("Silla: "+sillaAux.getCodigoSilla()+" | Precio: "+sillaAux.getPrecioSilla());
                    }
                    repetir=false;
                }
            
        }catch(Exception e){}
        }
    }
    /**
     * Metodo que recibe el menu principal
     * @param opcion 
     */
    public void menu(int opcion){
        while(opcion != 0)
        {
            Scanner entrada = new Scanner(System.in);            
            System.out.println(" MENU PRINCIPAL ");
            System.out.println("_______________________________________________");
            System.out.println("1- RESERVAR SILLA");
            System.out.println("2- ¡EL AVION ARRANCA AHORA!");
            System.out.println("3- MOSTRAR FACTURAS");
            System.out.println("4- LISTA DE SILLAS  ");
            System.out.println("0- SALIR");
            opcion = entrada.nextInt();
            casos(opcion);
        }
    }
    /**
     * Metodo que accede lógicamente al menú de opciones
     * @param opcion 
     */
    public void casos(int opcion)
    {
        switch(opcion){
        case 1:
            ReservaSilla();
            break;
        case 2:
            arrancarAvion();
            break;
        case 3:
            imprimeFactura();
            break;
        case 4:
            ListarAvion();
        case 0:
            //System.exit(0);
        break;     
        }
    }
    /**
     * Metodo que reserva la silla de un avion
     */
    public void ReservaSilla(){
        System.out.println("");
        System.out.println("          RESERVA DE UNA SILLA");
        boolean repetir = true;
        CapturarAvion(repetir);
    }
    public void CapturarAvion(boolean repetir){
        Scanner scan = new Scanner(System.in);
        String opcionSilla;
        while(repetir){
            System.out.println("   OPCIONES DE VUELO");
            System.out.println(" 1 - AVION MIXTO | 2 - AVION ECONOMICO | 3 - AVION VIP");
            try{
                opcionSilla = scan.nextLine();
                byte op = Byte.parseByte(opcionSilla);
                if(op == 1){
                    repetir=false;
                    for(Integer mapaSilla:silla.getSilla().keySet()){
                        Silla sillaAux = silla.getSilla().get(mapaSilla);
                        if((sillaAux.getPrecioSilla() == 100000 && sillaAux.isDisponible()==true) || (sillaAux.getPrecioSilla() == 50000 && sillaAux.isDisponible()==true)){
                            System.out.println("Silla: "+sillaAux.getCodigoSilla()+" | Precio:"+silla.getSilla().get(mapaSilla).getPrecioSilla());
                        }
                    }
                }else if(op == 2){
                    repetir=false;
                    for(Integer mapaSilla:silla.getSilla().keySet()){
                    Silla sillaAux = silla.getSilla().get(mapaSilla);
                    if((sillaAux.getPrecioSilla() == 30000 && sillaAux.isDisponible()==true)){
                        System.out.println("Silla: "+sillaAux.getCodigoSilla()+" | Precio:"+sillaAux.getPrecioSilla());
                    }
                }
                } else if(op == 3){
                    repetir=false;
                    for(Integer mapaSilla:silla.getSilla().keySet()){
                    Silla sillaAux = silla.getSilla().get(mapaSilla);
                    if((sillaAux.getPrecioSilla() == 1300000 && sillaAux.isDisponible()==true)){
                        System.out.println("Silla: "+sillaAux.getCodigoSilla()+" | Precio:"+sillaAux.getPrecioSilla());
                    }
                }
            }else{System.out.println("Por favor solo digite los valores solicitados");}
        }catch(InputMismatchException | NumberFormatException e){System.out.println("Por favor solo digite los valores solicitados");}
        }
        //------------------------------------------------------------------ 
        boolean repetir2 = true;
        while(repetir2){
            Scanner scan2 = new Scanner(System.in);
            String sillaReserva;
            System.out.println("   SILLA A RESERVAR");
            sillaReserva = scan2.nextLine().toUpperCase();
            if(sillaReserva.length() > 0 && sillaReserva.length()<=3)
            {
                try{
                    for(Integer mapaSilla:silla.getSilla().keySet()){
                        boolean medio2 = silla.getSilla().get(mapaSilla).isDisponible();
                        String medio = silla.getSilla().get(mapaSilla).getCodigoSilla();
                        String medio3 = silla.getClaseAvion().getTipoAvion();
                        if(medio.equals(sillaReserva) && medio2==true && medio3.equals("AVION VIP")){
                            repetir2=false;
                            double precio= silla.getSilla().get(mapaSilla).getPrecioSilla();
                            boolean repetir3 = true;
                            while(repetir3){
                                try{
                                    Scanner scanDoc = new Scanner(System.in);
                                    System.out.println("Documento del cliente: ");
                                    int doc = scanDoc.nextInt(); // FALTA VALIDACION PARA EL TAMAÑO DEL ENTERO
                                    boolean repetir4 = true;
                                    while(repetir4){
                                        System.out.println("Nombre del cliente: ");
                                        try{
                                            Scanner scanNombre = new Scanner(System.in); //VALIDAR QUE SOLO DIGITE LETRAS
                                            String nombre = scanNombre.nextLine();
                                            boolean repetir5 = true;
                                            while(repetir5){
                                                System.out.println("Fecha de nacimiento del cliente: 00/00/0000 (dia/mes/año)");
                                                Scanner sc = new Scanner(System.in);
                                                try{
                                                    String fecha = sc.nextLine();
                                                    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                                                    Date testDate = null;
                                                    String date = fecha;                        
                                                    testDate = df.parse(date);
                                                    if(medio.equals(sillaReserva)){
                                                        silla.getSilla().get(mapaSilla).setDisponible(false);
                                                        GuardaFactura(precio,sillaReserva,doc,nombre,testDate);
                                                        if(precio==100000 || precio==50000){
                                                            silla.setPrecioArranque1(silla.getPrecioArranque1()+precio);
                                                        }else if(precio==130000){
                                                            silla.setPrecioArranque3(silla.getPrecioArranque3()+precio);
                                                        }else if(precio==30000){
                                                            silla.setPrecioArranque2(silla.getPrecioArranque2()+precio);
                                                        }
                                                        System.out.println("Silla reservada!");
                                                    }
                                                    repetir5=false;
                                                    if (!df.format(testDate).equals(date)){
                                                    System.out.println("Fecha invalida");
                                                    }
                                                } catch (ParseException e){ System.out.println("La fecha no es la correcta, intente de nuevo");}
                                                
                                            }
                                            repetir4 = false;
                                        }catch(InputMismatchException e){System.out.println("Error vuelvalo a intentar");}
                                    }
                                    repetir3 = false;
                                }catch(InputMismatchException e){System.out.println("Error vuelvalo a intentar");}
                            }
                            break;
                        } // SI ELIJE MIXTO
                        if(medio.equals(sillaReserva) && medio2==true && medio3.equals("AVION ECONOMICO")){
                            repetir2=false;
                            double precio= 30000;
                            boolean repetir3 = true;
                            while(repetir3){
                                try{
                                    Scanner scanDoc = new Scanner(System.in);
                                    System.out.println("Documento del cliente: ");
                                    int doc = scanDoc.nextInt(); // FALTA VALIDACION PARA EL TAMAÑO DEL ENTERO
                                    boolean repetir4 = true;
                                    while(repetir4){
                                        System.out.println("Nombre del cliente: ");
                                        try{
                                            Scanner scanNombre = new Scanner(System.in); //VALIDAR QUE SOLO DIGITE LETRAS
                                            String nombre = scanNombre.nextLine();
                                            boolean repetir5 = true;
                                            while(repetir5){
                                                System.out.println("Fecha de nacimiento del cliente: 00/00/0000 (dia/mes/año)");
                                                Scanner sc = new Scanner(System.in);
                                                try{
                                                    String fecha = sc.nextLine();
                                                    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                                                    Date testDate = null;
                                                    String date = fecha;                        
                                                    testDate = df.parse(date);
                                                    if(medio.equals(sillaReserva)){
                                                        silla.getSilla().get(mapaSilla).setDisponible(false);
                                                        GuardaFactura(precio,sillaReserva,doc,nombre,testDate);
                                                        if(precio==100000 || precio==50000){
                                                            silla.setPrecioArranque1(silla.getPrecioArranque1()+precio);
                                                        }else if(precio==130000){
                                                            silla.setPrecioArranque3(silla.getPrecioArranque3()+precio);
                                                        }else if(precio==30000){
                                                            silla.setPrecioArranque2(silla.getPrecioArranque2()+precio);
                                                        }
                                                        System.out.println("Silla reservada!");
                                                    }
                                                    repetir5=false;
                                                    if (!df.format(testDate).equals(date)){
                                                    System.out.println("Fecha invalida");
                                                    }
                                                } catch (ParseException e){ System.out.println("La fecha no es la correcta, intente de nuevo");}
                                                
                                            }
                                            repetir4 = false;
                                        }catch(InputMismatchException e){System.out.println("Error vuelvalo a intentar");}
                                    }
                                    repetir3 = false;
                                }catch(InputMismatchException e){System.out.println("Error vuelvalo a intentar");}
                            }
                            break;
                        }//SI ELIGE ECONOMICO
                        if(medio.equals(sillaReserva) && medio2==true && medio3.equals("AVION MIXTO")){
                            repetir2=false;
                            double precio= 1300000;
                            boolean repetir3 = true;
                            while(repetir3){
                                try{
                                    Scanner scanDoc = new Scanner(System.in);
                                    System.out.println("Documento del cliente: ");
                                    int doc = scanDoc.nextInt(); // FALTA VALIDACION PARA EL TAMAÑO DEL ENTERO
                                    boolean repetir4 = true;
                                    while(repetir4){
                                        System.out.println("Nombre del cliente: ");
                                        try{
                                            Scanner scanNombre = new Scanner(System.in); //VALIDAR QUE SOLO DIGITE LETRAS
                                            String nombre = scanNombre.nextLine();
                                            boolean repetir5 = true;
                                            while(repetir5){
                                                System.out.println("Fecha de nacimiento del cliente: 00/00/0000 (dia/mes/año)");
                                                Scanner sc = new Scanner(System.in);
                                                try{
                                                    String fecha = sc.nextLine();
                                                    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                                                    Date testDate = null;
                                                    String date = fecha;                        
                                                    testDate = df.parse(date);
                                                    if(medio.equals(sillaReserva)){
                                                        silla.getSilla().get(mapaSilla).setDisponible(false);
                                                        GuardaFactura(precio,sillaReserva,doc,nombre,testDate);
                                                        if(precio==100000 || precio==50000){
                                                            silla.setPrecioArranque1(silla.getPrecioArranque1()+precio);
                                                        }else if(precio==1300000){
                                                            silla.setPrecioArranque3(silla.getPrecioArranque3()+precio);
                                                        }else if(precio==30000){
                                                            silla.setPrecioArranque2(silla.getPrecioArranque2()+precio);
                                                        }
                                                        System.out.println("Silla reservada!");
                                                    }
                                                    repetir5=false;
                                                    if (!df.format(testDate).equals(date)){
                                                    System.out.println("Fecha invalida");
                                                    }
                                                } catch (ParseException e){ System.out.println("La fecha no es la correcta, intente de nuevo");}
                                                
                                            }
                                            repetir4 = false;
                                        }catch(InputMismatchException e){System.out.println("Error vuelvalo a intentar");}
                                    }
                                    repetir3 = false;
                                }catch(InputMismatchException e){System.out.println("Error vuelvalo a intentar");}
                            }
                            break;
                        }//SI ELIGE COSTO
                    }
                    System.out.println("Esta silla no esta disponible");
                }catch(NumberFormatException | InputMismatchException | IndexOutOfBoundsException e ){System.out.println("No existe esta silla, intente nuevamente");
                }
            }else{System.out.println("Solo elija los valores solicitados");}
        }
    } //Final del metodo
    /**
     * Metodo que guarda en una lista la factura de un usuario
     * @param precio precio de la silla que reserva un usuario
     * @param sillaReserva el numero de la silla reservada
     * @param doc documento del usuario que reserva
     * @param nombre nombre del usuario que reserva
     * @param testDate fecha de nacimiento del usuario que reserva
     */
    public void GuardaFactura(double precio,String sillaReserva, int doc, String nombre,Date testDate){
        List<Factura> listaAux = new ArrayList();
        String tipoAvion;
        DateFormat dateFormat = new SimpleDateFormat("HH:mm dd/MM/yyyy");
        Date date = new Date();
        String fecha = dateFormat.format(date);
        if(precio==100000 || precio==50000){
            tipoAvion = "AVION MIXTO";
            Factura nuevaFactura = new Factura(fecha,tipoAvion,sillaReserva,doc,nombre,testDate);
            listaAux.add(nuevaFactura);
            factura.getListaFactura().addAll(listaAux);
        }else if(precio==130000){
            tipoAvion = "AVION VIP";
            Factura nuevaFactura = new Factura(fecha,tipoAvion,sillaReserva,doc,nombre,testDate);
            listaAux.add(nuevaFactura);
            factura.getListaFactura().addAll(listaAux);
        }else if(precio==30000){
            tipoAvion="AVION ECONOMICO";
            Factura nuevaFactura = new Factura(fecha,tipoAvion,sillaReserva,doc,nombre,testDate);
            listaAux.add(nuevaFactura);
            factura.getListaFactura().addAll(listaAux);
        }
    }
    /**
     * Metodo que imprime una factura
     */
    public void imprimeFactura(){
        try{
            for(Factura fact:factura.getListaFactura()){
            System.out.println("");
            System.out.println("---------------------------------------------");
            System.out.println("Fecha:  "+fact.getFecha());
            System.out.println("Tipo de reserva:  "+fact.getTipoAvion());
            System.out.println("Silla reservada:  "+fact.getNumSilla());
            System.out.println("Documento del usuario:  "+fact.getDocumentoUsuario());
            System.out.println("Nombre:  "+fact.getNombreUsuario());
            System.out.println("Fecha de nacimiento:  "+fact.getFechaNacimientoUsuario());
            }
        }catch(Exception e){System.out.println("No hay reservas en el momento");}
        
    }
    public void arrancarAvion(){
        Scanner sc = new Scanner(System.in);
        boolean repetir = true;
        String entrada;
        while(repetir){
            System.out.println(" 1 - AVION MIXTO | 2 - AVION ECONOMICO | 3 - AVION VIP");
            try{
                entrada = sc.nextLine();
                byte op = Byte.parseByte(entrada);
                if(op==1){
                    System.out.println("El avion arranco con   $"+silla.getPrecioArranque1());
                }
                if(op==2){
                    System.out.println("El avion arranco con   $"+silla.getPrecioArranque2());
                }
                if(op==3){
                    System.out.println("El avion arranco con   $"+silla.getPrecioArranque3());
                }
                repetir=false;
            }catch(InputMismatchException | NumberFormatException e){System.out.println("Por favor solo digite los valores solicitados");}
        }
        
        
    }
}
