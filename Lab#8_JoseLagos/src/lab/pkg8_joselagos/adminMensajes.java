/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8_joselagos;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/**
 *
 * @author tali_
 */
public class adminMensajes {
        private File archivo = null;
    private ArrayList<Mensaje>listaMensajes= new ArrayList();
    
    
            private static final long SerialVersionUID = 777L;
    
    
       public adminMensajes(String path){
        archivo = new File(path);
    }
       
           public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Mensaje> getListaMensajes() {
        return listaMensajes;
    }

    public void setListaMensajes(ArrayList<Mensaje> listaMensajes) {
        this.listaMensajes = listaMensajes;
    }
     public void setMensaje(Mensaje a){
        listaMensajes.add(a);
    }
     
      @Override
    public String toString() {
        return "adminAlumno{" + "listaAlumnos=" + listaMensajes + '}';
    }
     public void cargarArchivo(){
        try {
            Mensaje temp;
            listaMensajes = new ArrayList();
            if(archivo.exists()){
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp=(Mensaje)objeto.readObject())!=null){
                        listaMensajes.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for(Mensaje t : listaMensajes){
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        }finally{
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
    

     
     

}
