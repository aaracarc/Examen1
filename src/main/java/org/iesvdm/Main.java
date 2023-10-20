package org.iesvdm;

import org.iesvdm.ej3.models.Login;
import org.iesvdm.ej3.util.CargadorContexto;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Login login = new Login();
        CargadorContexto.cargadorDeContexto(login);
        login.login();
    }
}