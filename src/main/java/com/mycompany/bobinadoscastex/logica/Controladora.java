package com.mycompany.bobinadoscastex.logica;

import com.mycompany.bobinadoscastex.persistencia.controladoraPersistencia;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Controladora {
    
    controladoraPersistencia control  = new controladoraPersistencia();
    public void guardar(String marcaMotor ,String voltaje,String nombreCliente, String numCliente, String rpm,String vueltas, String pasoMotor,String alambreMotor){
        
        Cliente cliente = new Cliente();
        
        cliente.setNombreCompleto(nombreCliente);
        cliente.setNumCliente(numCliente);
        
        
        
        
        Motor motor = new Motor();
        motor.setCliente(cliente);
        motor.setAlambre(alambreMotor);
        motor.setMarcaMotor(marcaMotor);
        motor.setPaso(pasoMotor);
        motor.setRpm(rpm);
        motor.setVoltaje(voltaje);
        motor.setVueltas(vueltas);
                   
        this.control.guardar(cliente, motor);
        
        JOptionPane optionPane = new JOptionPane("SE GUARDÓ CORRECTAMENTE....", JOptionPane.INFORMATION_MESSAGE);
JDialog dialog = optionPane.createDialog("GUARDADO EXITOSO.....");
dialog.setAlwaysOnTop(true);
dialog.setVisible(true);
        
        
        
        
        
    }

    public List<Motor> traerMotores() {
   return  control.traerMotores();
    }

    public void eliminarMotor(int num_id) {
        this.control.eliminarMotor(num_id);
    }
    
}
