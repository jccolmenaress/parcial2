/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialhardcore;

/**
 *
 * @author Estudiante
 */
public class Estacion implements  investigacionMetereologica{
    private String nombre;
    private String ubicacion;
    private String fecha;

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getFecha() {
        return fecha;
    }
    
    public void generarRegistro(){
        
    }
}
