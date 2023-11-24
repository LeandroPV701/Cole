/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Leandro
 */
public class ejercicio1 {
    private String cod_producto;
    private String descripcion;
    private int precioCosto;
    private int precioVenta;
    
    public ejercicio1(String cod_producto, String descripcion, int precioCosto, int precioVenta){
        this.cod_producto=cod_producto;
        this.descripcion=descripcion;
        this.precioCosto=precioCosto;
        this.precioVenta=precioVenta;
    }
    
    public String getCod_producto(){
        return cod_producto;
    }
    public void setCod_producto(String cod_producto){
        this.cod_producto=cod_producto;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    
    public int getPrecioCosto(){
        return precioCosto;
    }
    public void setPrecioCosto(int precioCosto){
        this.precioCosto=precioCosto;
    }
    
    public int getPrecioVenta(){
        return precioVenta;
    }
    public void setPrecioVenta(int precioVenta){
        this.precioVenta=precioVenta;
    }
}
