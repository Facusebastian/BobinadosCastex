package com.mycompany.bobinadoscastex.logica;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Cliente implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
private int idCliente;
@Basic
private String nombreCompleto;
private String numCliente;

    public Cliente() {
    }

    public Cliente(int idCliente, String nombreCompleto, String numCliente) {
        this.idCliente = idCliente;
        this.nombreCompleto = nombreCompleto;
        this.numCliente = numCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(String numCliente) {
        this.numCliente = numCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombreCompleto=" + nombreCompleto + ", numCliente=" + numCliente + '}';
    }


}
