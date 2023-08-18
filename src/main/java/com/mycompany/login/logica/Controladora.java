package com.mycompany.login.logica;

import com.mycompany.login.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPer;
    //instacia entre la cotroladora de perdistencia y esta clase 

    public Controladora() {
        controlPer = new ControladoraPersistencia();
        //Construdctor con instacia a la controladora de persistencia 
        // esto soluciona un error para la incompartivilidad de simbolos
    }

    public String validarUsuario(String usuario, String password) {

        String mensaje = "";
        List<User> listaUsuarios = controlPer.traerUsuarios();

        for (User use : listaUsuarios) {
            if (use.getUsuario().equals(usuario)) {
                if (use.getPassword().equals(password)) {
                    mensaje = "Usuario y Contraceña Correctos. Bienvenido";
                   return mensaje;
                } else {
                  mensaje = "Contraceña Incorrecta";
               return mensaje;
                }
            } else {
                mensaje = "Usuario no encontrado";
//                return mensaje;
            }
        }
        return mensaje;
    }

}
