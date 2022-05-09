/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog.roberto.recu2evaluacion_roberto;

/**
 *
 * @author DAW
 */
public class ProgramaConcesionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Concesionario concesionario1 = new Concesionario();

        try {
            Coches coche1 = new Coches("Si", "246365-D", "Modelo2009");
            Coches coche2 = new Coches("Si", "63424552-F", "Seat");
            Bicicletas bici = new Bicicletas(16, "Montaña");
            Bicicletas bici2 = new Bicicletas(25, "Carretera");
            Furgonetas furgoneta = new Furgonetas("03573-H", 6, "Iveco");
            Furgonetas furgoneta1 = new Furgonetas("0343-H", 8, "IvecoXXL");
            Motos moto = new Motos("02157K", "Azul", "Yamaha");
            Motos moto1 = new Motos("042672L", "Verde", "Honda");

            //Creo los vehiculos.
            //------------------------------------------------------------------------------------------------------------------
            //Inserto vehiculos.
            concesionario1.insertavehiculos(bici2);
            concesionario1.insertavehiculos(coche1);
            concesionario1.insertavehiculos(furgoneta);
            concesionario1.insertavehiculos(moto);
            //Uso el metodo lista de vehiculos basica
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("\nDatos pero solo tipo y modelo");
            concesionario1.imprimirlista();
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("\nTodos los datos de todos los vehiculos");
            //Informacion de todos los vehiculos
            concesionario1.imprimirlistacompleta();
            System.out.println("\n Datos de vehiculo concreto");
            System.out.println("---------------------------------------------------------------------------");
            //Informacion de un vehiculo en concreto
            concesionario1.todoslosdatosvehiculo(2);
            // Excepcion: concesionario1.borravehiculos(-24);
            //concesionario1.borravehiculos(97);
            //Borrar los vehiculos
            concesionario1.borravehiculos(2);
            //Muestro toda la informacion otra vez
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("Imprmir info con vehiculo borrado: ");
            concesionario1.imprimirlista();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Te has salido del limite del array");
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }

}
