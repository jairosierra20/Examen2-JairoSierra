/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2.jairosierra;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jairo Sierra
 */
public class admincompus {
    private ArrayList<Computadora> lista = new ArrayList();
    private File archivo = null;

    public admincompus(String path) {
        archivo = new File(path);
    }

    public ArrayList<Computadora> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Computadora> lista) {
        this.lista = lista;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Administrador{" + "lista=" + lista + '}';
    }
    public void setComputadora(Computadora p){
        this.lista.add(p);
    }
    
    public void escribirarchivo() throws IOException{
        FileWriter fw = null;
        BufferedWriter bw = null;
        try{
        fw = new FileWriter(archivo,false);
        bw = new BufferedWriter(fw);
        for (Computadora lista2 : lista) {
            bw.write(lista2.getSerie()+";");
            bw.write(lista2.getAnio()+";");
            bw.write(lista2.getMaterial()+";");
            bw.write(lista2.getRam()+";");
            bw.write(lista2.getRam().getTiempo()+";");
            bw.write(lista2.getRam().getMarca()+";");
            bw.write(lista2.getRam().getTamano()+";");
            bw.write(lista2.getDisco()+";");
            bw.write(lista2.getDisco().getTiempo()+";");
            bw.write(lista2.getDisco().getMarca()+";");
            bw.write(lista2.getDisco().getTamano()+";");
             bw.write(lista2.getBateria()+";");
             bw.write(lista2.getBateria().getTiempo()+";");
            bw.write(lista2.getBateria().getCapacidad()+";");
            bw.write(lista2.getBateria().getMaterial()+";");
             bw.write(lista2.getTeclado()+";");
             bw.write(lista2.getTeclado().getTiempo()+";");
            bw.write(lista2.getTeclado().getMaterial()+";");
             bw.write(lista2.getPantalla()+";");
             bw.write(lista2.getPantalla().getTiempo()+";");
            bw.write(lista2.getPantalla().getTactil()+";");
            bw.write(lista2.getPantalla().getTipo()+";");
             bw.write(lista2.getProcesador()+";");
             bw.write(lista2.getProcesador().getTiempo()+";");
            bw.write(lista2.getProcesador().getNucleos()+";");
            bw.write(lista2.getProcesador().getVelocidad()+";");
            bw.write(";");
        }
        bw.flush();
        }
        catch(Exception e){
            
        }
        bw.close();
        fw.close();
    }
    public void cargararchivo(){
        Scanner sc = null;
        lista=new ArrayList();
        if(archivo.exists()){
        try{
            sc=new Scanner(archivo);
            sc.useDelimiter(";");
            while(sc.hasNext()){
                
                lista.add(new Computadora(sc.nextInt(),sc.nextInt(),sc.next()));
            }
        }
        catch(Exception e){
            
        }
        sc.close();
        }
    }
}
