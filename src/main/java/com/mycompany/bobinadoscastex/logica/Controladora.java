package com.mycompany.bobinadoscastex.logica;

import static com.mycompany.bobinadoscastex.logica.Motor_.cliente;
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

    public Motor traerMotor(int num_id) {
        return this.control.traerMotor(num_id);
    }

    public void modificarDato(Motor motor, String nombreCliente, String numTel, String marcaMotor, String volt, String rpm, String vueltas, String paso, String alambre) {
        //asignamos los datos de los parametros a mi parametro motor
        motor.setAlambre(alambre);
        motor.setMarcaMotor(marcaMotor);
        motor.setVoltaje(volt);
        motor.setVueltas(vueltas);
        motor.setPaso(paso);
        motor.setRpm(rpm);
        //una vez asignados los datos se los mando a la BD 
        //Mando el objeto Motor
        this.control.modificarMotor(motor);
        //lamamos a un metodo buscar cliente a la base de datos
        Cliente clien = buscarCliente(motor.getCliente().getIdCliente());
        //encontrado le asignamos a mi objeto en java los datos
        clien.setNombreCompleto(nombreCliente);
        clien.setNumCliente(nombreCliente);
        //ahora se lo mandamos a la BD
        modificarCliente(clien);
                
        
        
        
        
        
    }

    private Cliente buscarCliente(int idCliente) {
        return this.control.buscarCliente(idCliente);
    }

    private void modificarCliente(Cliente clien) {
        this.control.modificarCliente(clien);
    }

   
    
    
}
