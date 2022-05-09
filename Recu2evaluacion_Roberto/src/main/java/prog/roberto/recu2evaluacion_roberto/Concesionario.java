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

    public void imprimirlista() {
        for (Vehiculos vehiculo : getVehiculos1()) {

            vehiculo.imprimir();
//Imprime vehiculos solo tipo y modelo.
        }
    }

    public void vehiculoconcreto(int posicion) {

        this.getVehiculos1().get(posicion).imprimirtodo();

    }

    public void todoslosdatosvehiculo(int posicion) {
//Imprime todos los datos de un vehiculo concreto
        this.getVehiculos1().get(posicion).imprimirtodo();

    }

    public void imprimirlistacompleta() {
        for (Vehiculos vehiculo : vehiculos1) {

            vehiculo.imprimirtodo();

        }
//Imprime toda la informacion de todos los vehiculos del Array
    }

    public void insertavehiculos(Vehiculos vehiculo) {

        this.vehiculos1.add(vehiculo);
//Añade vehiculo al array
    }

    public void borravehiculos(int posicion) throws Exception {
        if (posicion < 0 || posicion > this.vehiculos1.size()) {
            throw new Exception("El objeto no se ha podido borrar");

        } else {
            this.vehiculos1.remove(posicion);
        }
        //Metodo que borra un elemento del array y devuelve un error en otro caso.
    }

    public void borrartodo() {

        this.vehiculos1.clear();

    }

    public ArrayList<Vehiculos> getVehiculos1() {
        return vehiculos1;
    }

}
