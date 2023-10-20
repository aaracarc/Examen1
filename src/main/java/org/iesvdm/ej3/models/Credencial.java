package org.iesvdm.ej3.models;

import java.util.HashSet;
import java.util.Set;


public class Credencial {
    //Atributos
    private String usuario;
    private String password;

    //Constructor
    public Credencial(String usuario, String contrasenia) {
        this.usuario = usuario;
        this.password = contrasenia;
    }
    //Getters
    public String getUsuario() {
        return usuario;
    }

    public String getContrasenia() {
        return password;
    }
}
