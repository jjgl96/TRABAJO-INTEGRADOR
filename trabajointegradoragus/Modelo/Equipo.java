/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajointegradoragus.Modelo;

/**
 *
 * @author Johanna
 */
public class Equipo {
    private String nombre;//nombre del equipo
    private String descripcion;//descripcion del equipo

    public Equipo() {
        this.nombre="equipo";
        this.descripcion="descripcion";
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public Equipo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
