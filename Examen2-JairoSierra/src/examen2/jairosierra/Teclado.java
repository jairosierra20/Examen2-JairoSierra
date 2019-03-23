/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2.jairosierra;

import java.awt.Color;

/**
 *
 * @author Jairo Sierra
 */
public class Teclado extends Parte{
    private Color color;
    private String material;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Teclado(Color color, String material, String tiempo) {
        super(tiempo);
        this.color = color;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Teclado{" + "material=" + material + '}';
    }
    
}
