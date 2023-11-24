/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulamiento;

/**
 *
 * @author Leandro
 */
public class tablet {
    private String marca;
    private int Capacidad;
    private int resolucion;
    
    //constructor//
    public tablet(String marca, int capacidad, int resolucion){
        this.marca=marca;
        this.Capacidad=capacidad;
        this.resolucion=resolucion;
    }
    
    //metodos//
    //retorna un valor//
    public String getMarca(){
        return marca;
    }
    //introduce un valor//
    public void setMarca(String marca){
        this.marca=marca;
    }
    
    
    public int getCapacidad(){
        return Capacidad;
    }
    public void setCapacidad(int Capacidad){
        this.Capacidad=Capacidad;
    }
    
    
    public int getResolucion(){
        return resolucion;
    }
    public void setResolucion(){
        this.resolucion=resolucion;
    }
    
}
