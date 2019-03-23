/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2.jairosierra;

/**
 *
 * @author Jairo Sierra
 */
public class Procesador extends Parte{
    private String nucleos;
    private String velocidad;

    public Procesador(String nucleos, String velocidad, String tiempo) {
        super(tiempo);
        this.nucleos = nucleos;
        this.velocidad = velocidad;
    }

    public String getNucleos() {
        return nucleos;
    }

    public void setNucleos(String nucleos) {
        this.nucleos = nucleos;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Procesador{" + "velocidad=" + velocidad + '}';
    }
    
}
