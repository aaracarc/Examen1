package org.iesvdm.ej1.models;

import java.math.BigDecimal;

public class Item {
    //Atributos
    public String description;
    private BigDecimal weight;
    private BigDecimal price;

    /**Constructor de Item
     * @param description Descripcion
     * @param weight Peso
     * @param price Precio
     */
    public Item(String description, BigDecimal weight, BigDecimal price) {
        this.description = description;
        this.weight = weight;
        this.price = price;
    }

    //Getters
    public BigDecimal getWeight() {
        return weight;
    }
    public BigDecimal getPrice() {
        return price;
    }
}
