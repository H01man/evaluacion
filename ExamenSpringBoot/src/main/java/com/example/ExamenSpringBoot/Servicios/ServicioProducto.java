package com.example.ExamenSpringBoot.Servicios;

import com.example.ExamenSpringBoot.Entidades.Producto;

import java.util.ArrayList;

public class ServicioProducto {

    ArrayList<Producto> productos = new ArrayList<>();

    public ServicioProducto(){
        productos.add(new Producto(1,"Pera","Frutas",6000.0,600));
        productos.add(new Producto(2,"Limon","Frutas",2000.0,600));
        productos.add(new Producto(3,"Guayaba","Frutas",1000.0,600));
        productos.add(new Producto(4,"Lima","Frutas",3000.0,600));
        productos.add(new Producto(5,"Uva","Frutas",2000.0,600));
        productos.add(new Producto(6,"Carne de res","Carnes",10000.0,600));
        productos.add(new Producto(7,"Carne de cerdo","Carnes",10000.0,600));
        productos.add(new Producto(8,"Arveja","Verduras",3000.0,600));
        productos.add(new Producto(9,"Mora","Frutas",5000.0,600));
        productos.add(new Producto(10,"Lulo","Frutas",6000.0,600));
    }

    public ArrayList<Producto> listar(){
        return productos;
    }

    public void total(){
        for (int i = 0; i < productos.size(); i++) {
            Double total = productos.get(i).getPrecio() * productos.get(i).getCantidad();

            productos.get(i).setTotal(total);
            productos.set(i, productos.get(i));
        }
    }

    public void totalIva(){
        for (int i = 0; i < productos.size(); i++) {
            Double total = (productos.get(i).getTotal() * 19) /100;
            Double totalIva = productos.get(i).getTotal() + total;

            productos.get(i).setTotalIva(totalIva);

            productos.set(i, productos.get(i));
        }
    }

    ArrayList<Producto> mostrar = new ArrayList<>();

    public Boolean descuento(int id){

        Boolean status = false;

        for (int i = 0; i < productos.size(); i++) {
            if(productos.get(i).getCodigo() == id){{
                Double descuento = (productos.get(i).getPrecio() * 10)/100;

                productos.get(i).setDescuento(descuento);
                productos.set(i,productos.get(i));

                status = true;
            }}
        }

        return status;
    }
}
