package cl.praxis.model;

import java.util.ArrayList;

public class ProductoServicio {

   // Producto producto = new Producto("jeans","1500","Pitillo","4-bb","54","Yulong","Azul");
    private ArrayList<Producto> listaProductos;


    public ProductoServicio() {
    }
    public ProductoServicio(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public void listaProductos(){


        for (Producto producto: listaProductos
             ) {

        }

    }
    public void agregarProducto(Producto producto){
        listaProductos.add(producto);
    }
}
