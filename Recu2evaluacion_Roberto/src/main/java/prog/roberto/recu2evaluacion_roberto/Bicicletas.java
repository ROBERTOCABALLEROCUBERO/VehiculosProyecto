/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.roberto.recu2evaluacion_roberto;

/**
 *
 * @author DAW
 */
public class Bicicletas extends Vehiculos{
    private int peso;

    public Bicicletas(int peso, String modelo) {
        super(modelo);
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    
    
    @Override
    public void imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
