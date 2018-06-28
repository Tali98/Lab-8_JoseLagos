/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8_joselagos;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author tali_
 */
public class Mensaje implements Serializable {

    private String mensaje;
    private String de;
    private String para;
    ArrayList destino;
    
        private static final long SerialVersionUID = 777L;

    public Mensaje(String mensaje, String de, String para) {
        this.mensaje = mensaje;
        this.de = de;
        this.para = para;
    }

    public Mensaje() {
    }

    public String getMensaje() {
        return mensaje;
    }

    public ArrayList getDestino() {
        return destino;
    }

    public void setDestino(ArrayList destino) {
        this.destino = destino;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para;
    }

    @Override
    public String toString() {
        return mensaje;
    }

}
