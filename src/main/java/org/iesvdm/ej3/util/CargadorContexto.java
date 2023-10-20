package org.iesvdm.ej3.util;

import org.iesvdm.ej3.anotations.CredencialAnotation;
import org.iesvdm.ej3.anotations.CredencialesAnotation;
import org.iesvdm.ej3.models.Login;
import org.iesvdm.ej3.models.Credencial;

public class CargadorContexto {
    /**Cargador de Contexto de Login
     * @param login
     */
    public static void cargadorDeContexto(Login login) {
        Class<? extends Login> loginClass = login.getClass();

        CredencialesAnotation loginAnot = loginClass.getAnnotation(CredencialesAnotation.class);

        if (loginAnot != null) {
            // Se obtienen el array de las anotaciones
            CredencialAnotation[] anotCredenciales = loginAnot.value();

            //Por cada anotacion se obtienen los valores correspondientes
            for (CredencialAnotation anotacionCredenciales : anotCredenciales) {
                String nombre = anotacionCredenciales.usuario();
                String password = anotacionCredenciales.password();

                //Creacion inicial del objeto
                Credencial usuario = null;

                //Si se ha creado el objeto correctamente
                if (usuario != null) {
                    login.getcredencialesSet().add(usuario);
                }
            }
        }
    }
}
