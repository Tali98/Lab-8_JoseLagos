/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8_joselagos;

/**
 *
 * @author tali_
 */
public class codificacion {
    private String letra;
    private int numero;

    public codificacion() {
    }

    public codificacion(String letra, int numero) {
        this.letra = letra;
        this.numero = numero;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    

    @Override
    public String toString() {
        return  letra +" "+ numero;
    }
    
}
