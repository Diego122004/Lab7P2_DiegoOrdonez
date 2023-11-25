
package lab7p2_diegoordonez;

import java.util.ArrayList;


public class Restaurante {
    
    private String nombre;
    private String ubi;
    private ArrayList <Producto> productos = new ArrayList();
    private int saldo;

    public Restaurante() {
    }

    public Restaurante(String nombre, String ubi) {
        this.nombre = nombre;
        this.ubi = ubi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbi() {
        return ubi;
    }

    public void setUbi(String ubi) {
        this.ubi = ubi;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
    
    
}
