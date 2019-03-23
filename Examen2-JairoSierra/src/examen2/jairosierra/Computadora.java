/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2.jairosierra;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Jairo Sierra
 */
public class Computadora {
    private int serie;
    private int anio;
    private Color color;
    private String material;
    private RAM ram;
    private Disco disco;
    private Pantalla pantalla;
    private Bateria bateria;
    private Teclado teclado;
    private Procesador procesador;
    private ArrayList<Parte> partes = new ArrayList();

    public Computadora(int serie, int anio, Color color, String material, RAM ram, Disco disco, Pantalla pantalla, Bateria bateria, Teclado teclado, Procesador procesador) {
        this.serie = serie;
        this.anio = anio;
        this.color = color;
        this.material = material;
        this.ram = ram;
        this.disco = disco;
        this.pantalla = pantalla;
        this.bateria = bateria;
        this.teclado = teclado;
        this.procesador = procesador;
    }

    public Computadora(int serie, int anio, String material) {
        this.serie = serie;
        this.anio = anio;
        this.material = material;
    }
    

    public ArrayList<Parte> getPartes() {
        return partes;
    }

    public void setPartes(ArrayList<Parte> partes) {
        this.partes = partes;
    }

    public Computadora() {
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

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

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public Disco getDisco() {
        return disco;
    }

    public void setDisco(Disco disco) {
        this.disco = disco;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return "Computadora{" + "serie=" + serie + '}';
    }
    
            
}
