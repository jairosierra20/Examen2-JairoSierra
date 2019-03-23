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
public class Ensamblaje {
    private Computadora computadora;
    private Tecnicos tecnico;

    public Ensamblaje(Computadora computadora, Tecnicos tecnico) {
        this.computadora = computadora;
        this.tecnico = tecnico;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    public Tecnicos getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnicos tecnico) {
        this.tecnico = tecnico;
    }

    @Override
    public String toString() {
        return "Orden de Ensamblaje{" + "computadora=" + computadora + ", tecnico=" + tecnico + '}';
    }
    
}
