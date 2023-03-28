package com.example.ExamenSpringBoot.Controladores;

import com.example.ExamenSpringBoot.Entidades.Producto;
import com.example.ExamenSpringBoot.Servicios.ServicioProducto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ControladorProductos {

    ServicioProducto service = new ServicioProducto();

    @GetMapping("/listarProductos")
    public ArrayList<Producto> listar(){
        service.total();
        service.totalIva();
        return service.listar();
    }

    @GetMapping("/descuento/{code}")
    public Boolean descuento(@PathVariable("code") int codigo){
        return service.descuento(codigo);
    }

}
