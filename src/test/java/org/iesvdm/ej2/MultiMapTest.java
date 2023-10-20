package org.iesvdm.ej2;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class MultiMapTest {


    @BeforeEach
    public void setUp() {
        multimap = new MultiMap<>();
    }

    @org.junit.jupiter.api.Test
    void add() {
        String uno = "uno";
        int numero = 1;
        add(uno, numero);

    }

    @org.junit.jupiter.api.Test
    void addIfAbsent() {
    }

    @org.junit.jupiter.api.Test
    void get() {
    }

    @org.junit.jupiter.api.Test
    void remove() {
    }

    @org.junit.jupiter.api.Test
    void totalSize() {
    }
}