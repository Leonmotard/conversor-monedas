/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversordemonedas.model;

import conversordemonedas.Util.EnumPais;

/**
 * Clase abstracta de la cual heredarán las monedas reales que serán convertidas
 * 
 * @author lean_
 */
public abstract class Moneda {

    private String nombre;
    private EnumPais pais;
    private Double cantidad;

    public Moneda() {

    }

    public Moneda(String nombre, EnumPais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public EnumPais getPais() {
        return pais;
    }

    public void setPais(EnumPais pais) {
        this.pais = pais;
    }

    public Double getCantidad(){
        return cantidad;
    }
    
    public void setCantidad(Double cantidad){
        this.cantidad = cantidad;
    }
}
