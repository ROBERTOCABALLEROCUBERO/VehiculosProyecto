/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.roberto.recu2evaluacion_roberto;

/**
 *
 * @author DAW
 */
public class Motos extends Vehiculos {

    private String matricula;
    private String color;

    public Motos(String matricula, String color, String modelo) {
        super(modelo);
        this.matricula = matricula;
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void imprimir() {
        System.out.println("\nMotos" + "\tModelo: " + this.getModelo());

    }

    @Override
    public void imprimirtodo() {
        System.out.println("\nMotos" + " Modelo: " + this.getModelo() + "\nMatricula: " + this.getMatricula() + " Color: " + this.getColor() + "\n");

    }
}
