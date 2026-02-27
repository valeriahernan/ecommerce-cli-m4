package ui;

import service.TiendaService;
import model.Producto;
import java.util.Scanner;

public class Consola {

    public static void iniciar(){
        TiendaService tienda = new TiendaService();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("1 ADMIN\n2 USUARIO\n0 SALIR");
            int op = sc.nextInt();

            if(op==0) break;

            if(op==1){
                tienda.getCatalogo().agregarProducto(
                    new Producto(1,"Mouse","Electronica",10000)
                );
                System.out.println("Producto demo agregado.");
            }

            if(op==2){
                System.out.println("Productos:");
                tienda.getCatalogo().listar()
                    .forEach(p->System.out.println(p.getNombre()));
            }
        }
    }
}