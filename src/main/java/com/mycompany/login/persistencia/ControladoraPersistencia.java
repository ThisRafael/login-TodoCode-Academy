package com.mycompany.login.persistencia;

import com.mycompany.login.logica.User;
import java.util.List;

public class ControladoraPersistencia {

    UserJpaController usuJpa = new UserJpaController();

    public List<User> traerUsuarios() {
        return usuJpa.findUserEntities();
        //esto equivale a traeme a todos los usuarios de la BD
    }

    
    


   
}
