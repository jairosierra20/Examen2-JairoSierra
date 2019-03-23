/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2.jairosierra;

import javax.swing.JProgressBar;

/**
 *
 * @author Jairo Sierra
 */
public class simulacion extends Thread{
    private JProgressBar progBar;
     private int numero;
     private Parte tem;
    private boolean avanzar;
    private boolean vive;

    public Parte getTem() {
        return tem;
    }

    public void setTem(Parte tem) {
        this.tem = tem;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public simulacion(JProgressBar progBar, int numero) {
        this.progBar = progBar;
        this.numero = numero;
        vive = true;
        avanzar = true;
    }

    

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public void setVida(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        int tiempo=0;
        while (vive) {
            if (avanzar) {
                    tiempo = 1000*numero;
                    progBar.setMaximum(numero);
                    progBar.setValue(progBar.getValue()+1);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }

    }
}
