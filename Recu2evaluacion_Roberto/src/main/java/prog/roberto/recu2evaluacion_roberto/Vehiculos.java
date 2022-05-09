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
    
    
    public abstract void imprimir(); //Metodo que luego desarrollare para imprimir solo el tipo y el modelo del objeto
    public abstract void imprimirtodo(); //Igual que arriba pero con toda la infomacion
    
    
}
