package cl.praxis.model;

import java.util.Scanner;

public class Menu {



    public static void main(String[] args) {
        ProductoServicio productoServicio = new ProductoServicio();
        Scanner  sc = new Scanner(System.in);

        int op;
         String articulo;
         String precio;
         String descripcion;
         String codigo;
         String talla;
         String marca;
         String color;
        System.out.print("=========Menu=========\n" +
                "1 Listar Producto\n" +
                "2 Agregar Producto\n" +
                "3 Exportar Datos\n" +
                "4 Salir\n" +
                "Ingrese una opcion:");
        op=sc.nextInt();
        if(op==1){
            productoServicio.listaProductos();
        } else if (op==2) {
            System.out.println("Crear producto");

            System.out.println("Ingrese nombre articulo");
            articulo=sc.next();
            System.out.println("Ingrese precio");
            precio=sc.next();
            System.out.println("Ingrese descripcion");
            descripcion=sc.next();
            System.out.println("Ingrese codigo");
            codigo=sc.next();
            System.out.println("Ingrese talla");
            talla=sc.next();
            System.out.println("Ingrese marca");
            marca=sc.next();
            System.out.println("Ingrese color");
            color=sc.next();
            Producto producto = new Producto(articulo,precio,descripcion,codigo,talla,marca,color);
            productoServicio.agregarProducto(producto);
        } else if (op==3) {
            ExportarTxt exportarTxt = new ExportadorTxt();
            exportarTxt.exportar();
        }
    }




}
