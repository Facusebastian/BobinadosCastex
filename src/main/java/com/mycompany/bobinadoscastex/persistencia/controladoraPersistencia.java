package com.mycompany.bobinadoscastex.persistencia;

import com.mycompany.bobinadoscastex.logica.Cliente;
import com.mycompany.bobinadoscastex.logica.Motor;
import java.util.List;

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

   
        

}
