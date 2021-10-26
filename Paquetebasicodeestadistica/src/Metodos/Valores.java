/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class Valores implements Comparable<Valores> {

    private double numero = 0;

    public Valores(double numero) {
        this.numero = numero;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }
    
    //esto es necesario para comparar los numeros y asi poder ordenarlos(Comparable<>)    
    @Override
    public int compareTo(Valores x) {
        if (x.getNumero() > numero) {
            return -1;
        } else if (x.getNumero() > numero) {
            return 0;
        } else {
            return 1;
        }

    }

}
