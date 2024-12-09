
package com.mycompany.bobinadoscastex.logica;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Motor  implements Serializable{
@Id
@GeneratedValue(strategy =GenerationType.SEQUENCE)
private int idMotor;

private String paso, vueltas, alambre, rpm, marcaMotor, voltaje;
@OneToOne
private Cliente cliente;

    public String getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(String voltaje) {
        this.voltaje = voltaje;
    }

    public String getMarcaMotor() {
        return marcaMotor;
    }

    public void setMarcaMotor(String marcaMotor) {
        this.marcaMotor = marcaMotor;
    }

    public Motor(int idMotor, String paso, String vueltas, String alambre, String rpm, String marcaMotor, String voltaje, Cliente cliente) {
        this.idMotor = idMotor;
        this.paso = paso;
        this.vueltas = vueltas;
        this.alambre = alambre;
        this.rpm = rpm;
        this.marcaMotor = marcaMotor;
        this.voltaje = voltaje;
        this.cliente = cliente;
    }

   

   

    public Motor() {
    }

    public int getIdMotor() {
        return idMotor;
    }

    public void setIdMotor(int idMotor) {
        this.idMotor = idMotor;
    }

    public String getPaso() {
        return paso;
    }

    public void setPaso(String paso) {
        this.paso = paso;
    }

    public String getVueltas() {
        return vueltas;
    }

    public void setVueltas(String vueltas) {
        this.vueltas = vueltas;
    }

    public String getAlambre() {
        return alambre;
    }

    public void setAlambre(String alambre) {
        this.alambre = alambre;
    }

    public String getRpm() {
        return rpm;
    }

    public void setRpm(String rpm) {
        this.rpm = rpm;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Motor{" + "idMotor=" + idMotor + ", paso=" + paso + ", vueltas=" + vueltas + ", alambre=" + alambre + ", rpm=" + rpm + ", marcaMotor=" + marcaMotor + ", cliente=" + cliente + '}';
    }

    

}
