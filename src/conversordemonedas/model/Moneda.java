/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversordemonedas.model;

/**
 * Clase abstracta de la cual heredarán las monedas reales que serán convertidas
 * 
 * @author lean_
 */
public abstract class Moneda {

    private String nombre;
    private Pais pais;

    public Moneda() {

    }

    public Moneda(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

}
