package org.iesvdm.ej1.models;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    //Atributos
    public Date date;
    public enum Status{PAYMENT, COMPLETE, PENDING}
    public Status status;

    //Metodos
    public BigDecimal calcNetTotal(){
        BigDecimal total;

    }

    public BigDecimal calcGrossTotal(){
        BigDecimal total = new BigDecimal(0);

        return total;
    }

    public BigDecimal calcVAT(){

    }
}
