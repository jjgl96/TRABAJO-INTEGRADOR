/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajointegradoragus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import javax.swing.JOptionPane;
import trabajointegradoragus.Modelo.Equipo;
import trabajointegradoragus.Modelo.Partido;
import trabajointegradoragus.Modelo.Pronostico;

/**
 *
 * @author Johanna
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader lector;
        String linea;
        String[] partes;
        String ruta= "C:\\Users\\Johanna\\Desktop\\Trabajos de programacion\\TrabajoIntegradorAgus\\src\\trabajointegradoragus\\Modelo\\resultados.csv";
             
        try{
            lector= new BufferedReader(new FileReader(ruta));
            Scanner leer= new Scanner(System.in);
            while((linea=lector.readLine())!=null){
                partes=linea.split(",");
                String nombreEquipo1 = partes[0];                
                int golEquipo1=Integer.parseInt(partes[1]);
                int golEquipo2=Integer.parseInt(partes[2]);
                String nombreEquipo2= partes[3];
                
                Equipo equipo1= new Equipo(nombreEquipo1);
                Equipo equipo2= new Equipo(nombreEquipo2);
                Partido partido1= new Partido(equipo1,equipo2,golEquipo1,golEquipo2);
                
                    System.out.println(nombreEquipo1+" "+golEquipo1+" - "+golEquipo2+" "+nombreEquipo2);    
                    
                    System.out.println("Por favor ingrese su nombre");
                    String nombrepro= leer.nextLine();
                    System.out.println("Por favor ingrese el nombre del equipo ganador");
                    String equipoGanador= leer.nextLine();
                    
                    Pronostico primero= new Pronostico(partido1,equipoGanador,nombrepro);
                    
                    String pronosticostr="";
                    pronosticostr+=primero.mostrarDatos();
                    System.out.println(pronosticostr);
                    String[] pronostico;
                    pronostico=pronosticostr.split(",");
                    String persona1= pronostico[0];
                    String ganadorpronostico= pronostico[1];
                    String ganadorpartido= partido1.Resultado();
                     // System.out.println(ganadorpartido);
                    Object ganadorpronosticoo=ganadorpronostico;
                    Object ganadorpartidoo= persona1;
  
                   int puntos = 0;
        
                   if (ganadorpartidoo!=ganadorpronosticoo) 
                   {
                    System.out.println("ACERTÓ");
                    puntos++;
                   } 
                   else 
                   System.out.println("FALLÓ");
                   
        }catch(Exception e){
            JOptionPane.ShowMessageDialog(null,e);
        }
    }
    
}
