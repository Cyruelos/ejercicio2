package com.ejer2.ejer2.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejer2.ejer2.Model.Entity.Producto;
import com.ejer2.ejer2.Service.IProducto;

@RestController
@RequestMapping("/api/v1")
public class ProductoController {
    @Autowired
    private IProducto productoServico;

    @GetMapping("/Producto")
    public ArrayList<Producto> getProductos(){
        return productoServico.getProducto();
    }
    @PostMapping("/Producto")
    public Producto posProductos(@RequestBody Producto p){
        return productoServico.postProducto(p);
    }

    @PutMapping("/Producto")
    public Producto putProducto(@RequestBody Producto productoM) {
        return productoServico.putProducto(productoM);
    }

    @DeleteMapping("/Producto")
    public Producto deleteProducto(@RequestBody Producto productoM) {
        return productoServico.deleteProducto(productoM);
    }

}
