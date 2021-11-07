import listproductos.BolsaSupermercado;
import modelo.*;

import java.util.Locale;

public class EjemploMercado {

    public static void main(String[] args) {

        BolsaSupermercado<Fruta> bolsaFrutas = new BolsaSupermercado<>();
        BolsaSupermercado<Limpieza> bolsaLimpiezas = new BolsaSupermercado<>();
        BolsaSupermercado<Lacteo> bolsaLacteos = new BolsaSupermercado<>();
        BolsaSupermercado<NoPerecible> bolsaNoPerecibles = new BolsaSupermercado<>();

        bolsaLacteos.addProducto(new Lacteo("Colanta", 12000, 400, 500));
        bolsaLacteos.addProducto(new Lacteo("Freskleche", 8000, 340, 230));
        bolsaLacteos.addProducto(new Lacteo("Rodeo", 11500, 600,280));
        bolsaLacteos.addProducto(new Lacteo("Parmalat", 2800, 250,280));
        bolsaLacteos.addProducto(new Lacteo("alpina", 7500, 290,280));

        bolsaFrutas.addProducto(new Fruta("manzana fuji",1200 ,200 , "roja"));
        bolsaFrutas.addProducto(new Fruta("Durazno", 800, 250, "amarillo"));
        bolsaFrutas.addProducto(new Fruta("Uvas", 4450, 400, "Purpura"));
        bolsaFrutas.addProducto(new Fruta("Limones", 1200, 400, "verde"));
        bolsaFrutas.addProducto(new Fruta("Sandia", 6000,500 , "Verde"));

        bolsaLimpiezas.addProducto(new Limpieza("antibacterial", 0.75, "Cif", 1690));
        bolsaLimpiezas.addProducto(new Limpieza("lavaloza", 1.2, "Quix", 2290));
        bolsaLimpiezas.addProducto(new Limpieza("cloro", 0.95, "Limpiador Crema", 1390));
        bolsaLimpiezas.addProducto(new Limpieza("Gel con Lavandinca", 0.45, "Lysoform", 1380));
        bolsaLimpiezas.addProducto(new Limpieza("Desinfectante Lavanda", 0.9, "Lysol", 1330));

        bolsaNoPerecibles.addProducto(new NoPerecible("Atún Lomitos en Agua Angelmo", 95,6 , 960));
        bolsaNoPerecibles.addProducto(new NoPerecible("Jurel Natural Lata", 560, 9, 1120));
        bolsaNoPerecibles.addProducto(new NoPerecible("Porotos Negros Listos Para Servir Caja", 234,4 , 1030));
        bolsaNoPerecibles.addProducto(new NoPerecible("Arroz Grano Largo Ancho Grado 1", 32,23 , 1320));
        bolsaNoPerecibles.addProducto(new NoPerecible("Porotos Hallado Bolsa", 43.05, 54, 1990));

        for(Lacteo lacteo: bolsaLacteos.getProductos()){
            System.out.println(imprimirProductoPrecio(lacteo));
            System.out.println("Cantidad : " + lacteo.getCantidad());
            System.out.println("Proteinas : " + lacteo.getProteinas());
        }

        for (Fruta fruta: bolsaFrutas.getProductos()){
            System.out.println(imprimirProductoPrecio(fruta));
            System.out.println("Color : " + fruta.getColor());
            System.out.println("Peso  : " + fruta.getPeso());
        }

        for (Limpieza limpieza : bolsaLimpiezas.getProductos()){
            System.out.println(imprimirProductoPrecio(limpieza));
            System.out.println("Componentes : " + limpieza.getComponentes());
            System.out.println("Litros : " + limpieza.getLitros());
        }

        for (NoPerecible noPerecible : bolsaNoPerecibles.getProductos()){
            System.out.println(imprimirProductoPrecio(noPerecible));
            System.out.println("Contenido : " + noPerecible.getContenido());
            System.out.println("Calorias : " + noPerecible.getCalorias());
        }

    }

    public static<T extends Producto> String imprimirProductoPrecio(T producto){
        StringBuilder p =
                new StringBuilder("------" + producto.getClass().getSimpleName().
                        toUpperCase(Locale.ROOT) +"-----------").
                        append("\nProducto : " + producto.getNombre()).
                        append("\nPrecio : " + producto.getPrecio());
        return p.toString();
    }

}
