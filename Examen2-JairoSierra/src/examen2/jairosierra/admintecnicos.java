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
public class admintecnicos {
    private ArrayList<Tecnicos> lista = new ArrayList();
    private File archivo = null;

    public admintecnicos(String path) {
        archivo = new File(path);
    }

    public ArrayList<Tecnicos> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Tecnicos> lista) {
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
    public void setTecnicos(Tecnicos p){
        this.lista.add(p);
    }
    
    public void escribirarchivo() throws IOException{
        FileWriter fw = null;
        BufferedWriter bw = null;
        try{
        fw = new FileWriter(archivo,false);
        bw = new BufferedWriter(fw);
        for (Tecnicos lista2 : lista) {
            bw.write(lista2.getEdad()+";");
            bw.write(lista2.getEnsambladas()+";");
            bw.write(lista2.getGenero()+";");
            bw.write(lista2.getNombre()+";");
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
                
                lista.add(new Tecnicos(sc.next(),sc.nextInt(),sc.next(),sc.nextInt()));
            }
        }
        catch(Exception e){
            
        }
        sc.close();
        }
    }
}
