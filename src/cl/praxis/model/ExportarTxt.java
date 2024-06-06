package cl.praxis.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public abstract class ExportarTxt extends Exportador{

    Scanner sc = new Scanner(System.in);
    String nombreDirectorio;
    String nombreArchivo;

    void exportar(ArrayList<Producto> productos) {
        System.out.println("Ingrese un nombre divertido para crear un directorio");
        nombreDirectorio = sc.next();
        System.out.println("Ingrese el nombre de su mascota para crear un archivo .txt con los productos existentes, (si no tiene mascota no importa, invente una)");
        nombreArchivo = sc.next();

        File directorio = new File("src/"+nombreDirectorio);
        File archivo = new File("src/"+nombreDirectorio+"/"+nombreArchivo+".txt");

        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                System.out.println("Directorio creado");
                try {
                    archivo.createNewFile();
                    FileWriter fileW = new FileWriter(archivo);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileW);
                    productos.add(new Producto("jeans","1500","Pitillo","4-bb","54","Yulong","azul"));
                    productos.add(new Producto("chaleco","2500","Grande","3-bb","xl","Yulong","verde"));
                    productos.add(new Producto("short","3500","Estrecho","2-bb","xs","Yulong","gris"));
                    productos.add(new Producto("zapatilla","4500","Comoda","1-bb","48","Yulong","morado"));
                    productos.add(new Producto("gorro","5500","vintage","0-bb","l","Yulong","negro"));
                    for (Iterator iterator = productos.iterator(); iterator.hasNext();) {

                        String elemento = (String) iterator.next();

                        bufferedWriter.write(elemento);
                        bufferedWriter.newLine();
                    }


                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.printf("Error al crear el directorio %s",nombreDirectorio);
                }
            } else {
                System.out.println("Error al crear directorio");
            }
        } else {
            System.out.println("Directorio ya esta creado");

        }

    }
}
