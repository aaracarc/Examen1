package org.iesvdm.ej1.models;

import java.math.BigDecimal;
import java.util.ArrayList;

public class OrderDetail {
    //Atributos
    public int quantity;
    public enum TaxType{GENERAL, REDUCED, SUPERREDUCED}
    public TaxType taxType;
    private ArrayList<Item> listaItems;

    public OrderDetail(ArrayList<Item> listaItems) {
        this.listaItems = listaItems;
    }

    //Metodos
    public BigDecimal calcSubTotal(){

    }
    public BigDecimal calcWeight(){

    }
}
