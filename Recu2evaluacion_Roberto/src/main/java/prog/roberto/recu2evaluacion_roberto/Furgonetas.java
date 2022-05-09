/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.roberto.recu2evaluacion_roberto;

/**
 *
 * @author DAW
 */
public class Furgonetas extends Vehiculos {

    private String matricula;
    private int numasientos;

    public Furgonetas(String matricula, int numasientos, String modelo) {
        super(modelo);
        this.matricula = matricula;
        this.numasientos = numasientos;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNumasientos() {
        return numasientos;
    }

    public void setNumasientos(int numasientos) {
        this.numasientos = numasientos;
    }

    @Override
    public void imprimir() {
        System.out.println("\nFurgoneta " + "\tModelo: " + this.getModelo());
    }

    @Override
    public void imprimirtodo() {
        System.out.println("\nFurgoneta " + " Modelo: " + this.getModelo() + " Numero de asientos: " + this.getNumasientos() + "\nMatricula: " + this.getMatricula() + "\n");

    }
}
