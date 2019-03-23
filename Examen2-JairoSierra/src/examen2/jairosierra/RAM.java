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
public class RAM extends Parte{
    private String tamano;
    private String marca;

    public RAM(String tamano, String marca, String tiempo) {
        super(tiempo);
        this.tamano = tamano;
        this.marca = marca;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "RAM{" + "marca=" + marca + '}';
    }
    
}
