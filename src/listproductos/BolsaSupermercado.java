package listproductos;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T>{

    List<T> listaProductos;

    public BolsaSupermercado(){
        listaProductos = new ArrayList<>();
    }

    public void addProducto ( T producto){
       if(listaProductos.size()<5)
           this.listaProductos.add(producto);
        else{
           throw new RuntimeException("Limite de productos alcanzado");
       }
    }

    public List<T> getProductos (){
        return listaProductos;
    }




}
