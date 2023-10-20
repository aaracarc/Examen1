package org.iesvdm.ej2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MultiMap<K, V> {
    private HashMap<K, ArrayList<V>> multimap;

    public MultiMap() {
        multimap = new HashMap<>();
    }

    public void add (K key, V value){
        ArrayList<V> lista = new ArrayList<>();
        lista.add(value);
        multimap.put(key, lista);
    }

    public void addIfAbsent(K key, V value){
        if (!multimap.containsKey(key)){
            add(key, value);
        }
    }

    public Collection<V> get(K key){

    }
    public boolean remove(K key, V value){

    }
    public long totalSize(){

    }
}
