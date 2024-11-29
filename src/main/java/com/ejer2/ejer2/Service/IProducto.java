package com.ejer2.ejer2.Service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;


import com.ejer2.ejer2.Model.Entity.Producto;
@Service
public class IProducto {

    ArrayList<Producto> listProductos = new ArrayList<>();{
        listProductos.add(new Producto(1,"Gaseosa",400, 2, "bebida gaseosa"));
        listProductos.add(new Producto(2,"pan", 200, 7,"es pan"));
        listProductos.add(new Producto(3, "leche",700,2,"leche entera"));
        listProductos.add(new Producto(4,"galletas",1000,1,"paquete de galletas"));
        listProductos.add(new Producto(5,"huevos",100,5,"paquete de huevos"));
        listProductos.add(new Producto(6,"salchicha",800,5,"salchicha de perro"));
    }
      

        

    public ArrayList<Producto> getProducto(){
        return listProductos;
    }
            
        

    public Producto postProducto(Producto listProducto){
        listProductos.add(listProducto);
        return listProducto;
    }

    public Producto putProducto(Producto productoM){
        for (Producto p: listProductos) {
            if (p.getId() == productoM.getId()) {
                p.setNombre(productoM.getNombre());
                p.setPrecio(productoM.getPrecio());
                p.setCantidad(productoM.getCantidad());
                p.setDescripcion(productoM.getDescripcion());
            }
        }
        return null;
    }

    public Producto deleteProducto(Producto productoM){
        for (Producto p: listProductos) {
            if (p.getId() == productoM.getId()) {
                listProductos.remove(p);
                return p;
            }
        }
        return null;
    }


}
