/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajointegradoragus.Modelo;

/**
 *
 * @author Johanna
 */
public class Partido {
    private Equipo nombre1;//nombre del equipo que jugaron el partido
    private Equipo nombre2;
    private int golequipo1;//goles de los equipos que jugaron
    private int golequipo2;
    

    public Partido() {
    }

    public Partido(Equipo nombre1, Equipo nombre2, int golequipo1, int golequipo2) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.golequipo1 = golequipo1;
        this.golequipo2 = golequipo2;
        
    }

    public Equipo getNombre1() {
        return nombre1;
    }

    public void setNombre1(Equipo nombre1) {
        this.nombre1 = nombre1;
    }

    public Equipo getNombre2() {
        return nombre2;
    }

    public void setNombre2(Equipo nombre2) {
        this.nombre2 = nombre2;
    }

    public int getGolequipo1() {
        return golequipo1;
    }

    public void setGolequipo1(int golequipo1) {
        this.golequipo1 = golequipo1;
    }

    public int getGolequipo2() {
        return golequipo2;
    }

    public void setGolequipo2(int golequipo2) {
        this.golequipo2 = golequipo2;
    }
    public String Resultado(){
        String equipoGano;
        if(golequipo1<golequipo2){
          equipoGano= nombre2.getNombre();
        }else{
           equipoGano= nombre1.getNombre();
        }
        System.out.println(equipoGano);
        return equipoGano;
    }
}
