package com.mycompany.bobinadoscastex.persistencia;

import com.mycompany.bobinadoscastex.logica.Cliente;
import com.mycompany.bobinadoscastex.logica.Motor;
import com.mycompany.bobinadoscastex.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.metamodel.SingularAttribute;

public class controladoraPersistencia {
ClienteJpaController clientePersis = new ClienteJpaController();
MotorJpaController motorPersis = new MotorJpaController();

    public void guardar(Cliente cliente, Motor motor){
   try {
          //la mandamos a la BD
        this.clientePersis.create(cliente);
        //La mandamos a la base de datos
        this.motorPersis.create(motor);
    } catch (Exception ex) {
    }
    }

    public List<Motor> traerMotores() {
        return motorPersis.findMotorEntities();
    }

    public void eliminarMotor(int num_id) {
    try {
        this.motorPersis.destroy(num_id);
    } catch (NonexistentEntityException ex) {
        
    }
    }

   

    public Motor traerMotor(int num_id) {
        return this.motorPersis.findMotor(num_id);
    }

    public void modificarMotor(Motor motor) {
    try {
    // con mi metodo edit que me dio jpa edito el de la base de datos
        motorPersis.edit(motor);
    } catch (Exception ex) {
    }
    }

    public Cliente buscarCliente(int idCliente) {
        return this.clientePersis.findCliente(idCliente);
    }

    public void modificarCliente(Cliente cliente) {
    try {
        this.clientePersis.edit(cliente);
    } catch (Exception ex) {
    }
 }
    

  
 

   
        

}
