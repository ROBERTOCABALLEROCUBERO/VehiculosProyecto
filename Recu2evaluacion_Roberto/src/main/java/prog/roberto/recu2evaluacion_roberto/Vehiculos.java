/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.roberto.recu2evaluacion_roberto;

/**
 *
 * @author DAW
 */
public abstract class Vehiculos {
    private final String modelo;

    public Vehiculos(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }
    
    
    public abstract void imprimir();
    public abstract void imprimirtodo();
    
    
}
