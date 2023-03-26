/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajointegradoragus.Modelo;

/**
 *
 * @author Johanna
 */
public class Pronostico {

   
    private String nombre;
    private Partido jugado;//partido finalizado
    private String ganador;//equipo ganador para comparar

    public Pronostico() {
    }

    public Pronostico(Partido jugado, String ganador,String nombre) {
        this.nombre = nombre;
        this.jugado = jugado;
        this.ganador = ganador;
    }

    public Partido getJugado() {
        return jugado;
    }

    public void setJugado(Partido jugado) {
        this.jugado = jugado;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }
    
    public String mostrarDatos(){
        String datos=nombre+","+ganador+"\n";
        return datos;
    }
    
}
