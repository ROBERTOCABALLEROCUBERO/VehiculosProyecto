/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.roberto.recu2evaluacion_roberto;

/**
 *
 * @author DAW
 */
public class motos extends Vehiculos {
    private String matricula;
    private String color;

    public motos(String matricula, String color, String modelo) {
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
        System.out.println("Motos" + "Modelo" + this.getModelo());

    }

    @Override
    public void imprimirtodo() {
        System.out.println("Motos" + "Modelo" + this.getModelo() + "\nMatricula: " + this.getMatricula() + " Color: " + this.getColor());

    }
}
