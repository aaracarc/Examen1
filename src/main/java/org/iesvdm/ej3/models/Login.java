package org.iesvdm.ej3.models;

import org.iesvdm.ej3.anotations.CredencialAnotation;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//Anotaciones
@CredencialAnotation(usuario = "usuario1", password="1234")
@CredencialAnotation(usuario = "ususario2", password="admin.1")
public class Login {
    //Atributos
    static Scanner s = new Scanner(System.in);
    private String usuario;
    private String password;
    private Set<Credencial> credencialesSet = new HashSet<>();

    //Constructor
    public void login(){
        System.out.println("Introduzca el usuario");
        usuario = s.nextLine();
        System.out.println("Introduzca la contrasenia");
        password = s.nextLine();

        if (credencialesSet.contains(usuario) && credencialesSet.contains(password)){
            System.out.println("ACCESO CONCEDIDO");
        } else {
            System.out.println("ACCESO DENEGADO");
        }
    }
    //Getter
    public Set<Credencial> getcredencialesSet() {
        return credencialesSet;
    }
}
