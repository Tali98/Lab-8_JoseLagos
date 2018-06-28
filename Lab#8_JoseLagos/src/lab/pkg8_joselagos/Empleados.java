/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8_joselagos;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author tali_
 */
public class Empleados {
    private String nombre;
    private int ID;
    private String contra;
    private Empleados jefe;
    private double salario;
    private String puesto;
    ArrayList <Empleados> listaempleados = new ArrayList();

    public Empleados(String nombre, int ID, String contra, Empleados jefe, double salario, String puesto) {
        this.nombre = nombre;
        this.ID = ID;
        this.contra = contra;
        this.jefe = jefe;
        this.salario = salario;
        this.puesto = puesto;
    }

    public Empleados() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public Empleados getJefe() {
        return jefe;
    }

    public void setJefe(Empleados jefe) {
        this.jefe = jefe;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public ArrayList<Empleados> getListaempleados() {
        return listaempleados;
    }

    public void setListaempleados(ArrayList<Empleados> listaempleados) {
        this.listaempleados = listaempleados;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleados other = (Empleados) obj;
        if (this.ID != other.ID) {
            return false;
        }
        if (Double.doubleToLongBits(this.salario) != Double.doubleToLongBits(other.salario)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.contra, other.contra)) {
            return false;
        }
        if (!Objects.equals(this.puesto, other.puesto)) {
            return false;
        }
        if (!Objects.equals(this.jefe, other.jefe)) {
            return false;
        }
        if (!Objects.equals(this.listaempleados, other.listaempleados)) {
            return false;
        }
        return true;
    }
    
    
    
}
