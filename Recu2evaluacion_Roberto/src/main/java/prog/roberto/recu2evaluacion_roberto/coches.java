/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.roberto.recu2evaluacion_roberto;

/**
 *
 * @author DAW
 */
public class Coches extends Vehiculos {

    private String aireacondicionado;
    private String matricula;

    public Coches(String aireacondicionado, String matricula, String modelo) {
        super(modelo);
        this.aireacondicionado = aireacondicionado;
        this.matricula = matricula;
    }

    public String getAireacondicionado() {
        return aireacondicionado;
    }

    public void setAireacondicionado(String aireacondicionado) {
        this.aireacondicionado = aireacondicionado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void imprimir() {
        System.out.println("\nCoche\t " + "Modelo: " + this.getModelo());

    }

    @Override
    public void imprimirtodo() {
        System.out.println("\nCoche " + " Modelo: " + this.getModelo() + "\nMatricula: " + this.getMatricula() + " Aire acondicionado: " + this.getAireacondicionado() + "\n");

    }

}
