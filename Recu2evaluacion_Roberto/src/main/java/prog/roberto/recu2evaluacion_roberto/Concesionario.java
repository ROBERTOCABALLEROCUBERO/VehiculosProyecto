/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.roberto.recu2evaluacion_roberto;
import java.util.*;
/**
 *
 * @author DAW
 */
public class Concesionario {
    private ArrayList<Vehiculos> vehiculos1 = new ArrayList<Vehiculos>();
    public void imprimirlista(){
    for (Vehiculos vehiculo : vehiculos1){
    
    vehiculo.imprimir();
    
    
    }
    }
    public void vehiculoconcreto(int posicion){
    
        System.out.println(vehiculos1.get(posicion));
        
    
    }
    public void imprimirlistacompleta(){
    
    
    
    }
    public void insertavehiculos(){
    
    
    
    }
    public void borravehiculos(){
    
    
    
    }
    public void borrartodo(){
    
    
    
    }
    
    
    
    
    
    
}
