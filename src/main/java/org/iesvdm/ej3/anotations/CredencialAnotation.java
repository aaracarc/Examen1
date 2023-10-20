package org.iesvdm.ej3.anotations;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(CredencialesAnotation.class)
public @interface CredencialAnotation {
    //Atributos
    String usuario();
    String password();
}
