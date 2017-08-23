/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import java.util.ArrayList;

/**
 *
 * @author Roberto Cruz Leija
 */
public class BurbujaOptimizado {
    
    private double tiempo_inicial;
    private double tiempo_final;
    private double tiempo_total;
    private double tiempo_iter;
    private int intercambios;
    private int comparaciones;
    private ArrayList<Double> tiempos;
    
    
    public BurbujaOptimizado(){
        this.tiempo_inicial = 0;
        this.tiempo_final = 0;
        this.tiempo_total = 0;
        this.comparaciones = 0;
        this.intercambios = 0;
        tiempos= new ArrayList<>();
        this.tiempo_iter=0;
    }
    
    public void ordenar(double []arreglo){
    
        this.setTiempo_inicial(System.currentTimeMillis());
        double aux;
        ArrayList<Double> tiemposs = new ArrayList<>();
          for(int i = 0; i < arreglo.length - 1; i++)
            {
            for(int j = 0; j < arreglo.length - i - 1; j++)
                 { 
                     this.setComparaciones(this.getComparaciones() + 1);
                           
                if (arreglo[j] > arreglo[j + 1])
                {
                    double tmp = arreglo[j+1];
                    arreglo[j+1] = arreglo[j];
                    arreglo[j] = tmp;
                    this.setIntercambios(this.getIntercambios() + 1);
                }
            }
           aux=System.currentTimeMillis();
            tiemposs.add(aux);
        }
          
          //ya termino 
          this.setTiempo_final(System.currentTimeMillis());
          this.setTiempo_total(this.getTiempo_final() - this.getTiempo_inicial());
          this.setTiempos(tiemposs);
    }

    /**
     * @return the tiempo_inicial
     */
    public double getTiempo_inicial() {
        return tiempo_inicial;
    }

    /**
     * @param tiempo_inicial the tiempo_inicial to set
     */
    public void setTiempo_inicial(double tiempo_inicial) {
        this.tiempo_inicial = tiempo_inicial;
    }

    /**
     * @return the tiempo_final
     */
    public double getTiempo_final() {
        return tiempo_final;
    }

    /**
     * @param tiempo_final the tiempo_final to set
     */
    public void setTiempo_final(double tiempo_final) {
        this.tiempo_final = tiempo_final;
    }

    /**
     * @return the tiempo_total
     */
    public double getTiempo_total() {
        return tiempo_total;
    }

    /**
     * @param tiempo_total the tiempo_total to set
     */
    public void setTiempo_total(double tiempo_total) {
        this.tiempo_total = tiempo_total;
    }

    /**
     * @return the intercambios
     */
    public int getIntercambios() {
        return intercambios;
    }

    /**
     * @param intercambios the intercambios to set
     */
    public void setIntercambios(int intercambios) {
        this.intercambios = intercambios;
    }

    /**
     * @return the comparaciones
     */
    public int getComparaciones() {
        return comparaciones;
    }

    /**
     * @param comparaciones the comparaciones to set
     */
    public void setComparaciones(int comparaciones) {
        this.comparaciones = comparaciones;
    }

    /**
     * @return the tiempo_iter
     */
    public double getTiempo_iter() {
        return tiempo_iter;
    }

    /**
     * @param tiempo_iter the tiempo_iter to set
     */
    public void setTiempo_iter(double tiempo_iter) {
        this.tiempo_iter = tiempo_iter;
    }

    /**
     * @return the tiempos
     */
    public ArrayList<Double> getTiempos() {
        return tiempos;
    }

    /**
     * @param tiempos the tiempos to set
     */
    public void setTiempos(ArrayList<Double> tiempos) {
        this.tiempos = tiempos;
    }

   
    
    
    
    
}
