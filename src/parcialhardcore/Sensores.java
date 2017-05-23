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
public abstract class Sensores implements  investigacionMetereologica{
    private  double cantidad;
    private double temperatura;
    private double nivelCarga;
    private String referencia;
    private String fechaInstalacion;
    private String marca;
    private String criterio;

    public Sensores(double cantidad, double temperatura, double nivelCarga, String referencia, String fechaInstalacion,String marca,String criterio) {
        this.cantidad = cantidad;
        this.temperatura = temperatura;
        this.nivelCarga = nivelCarga;
        this.referencia = referencia;
        this.fechaInstalacion = fechaInstalacion;
        this.marca= marca;
        this.criterio =criterio;
        
        
    }
    
    

    public double getCantidad() {
        return cantidad;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getNivelCarga() {
        return nivelCarga;
    }

    public String getReferencia() {
        return referencia;
    }

    public String getFechaInstalacion() {
        return fechaInstalacion;
    }

    @Override
    public String toString() {
        return "Sensores{" + "cantidad=" + cantidad + ", temperatura=" + temperatura + ", nivelCarga=" + nivelCarga + ", referencia=" + referencia + ", fechaInstalacion=" + fechaInstalacion + ", marca=" + marca + ", criterio=" + criterio + '}';
    }
    
}
