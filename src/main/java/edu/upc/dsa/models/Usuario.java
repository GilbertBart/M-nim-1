package edu.upc.dsa.models;


import edu.upc.dsa.util.RandomUtils;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    String id;
    String location;
    List<PI> ListaPIs ;

    public Usuario() {
        ;
    }

    public Usuario(String id, List<PI> ListaPIs ) {
        this();
        this.setId(id);
        this.setListaPIs(ListaPIs);
    }

    public Usuario(String id) {
        this();
        this.setId(id);
        this.ListaPIs = new ArrayList<>();
    }
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id=id;
    }

    public List<PI> getListaPIs() {
        return this.ListaPIs;
    }

    public void setListaPIs(List<PI> ListaPIs ) {
        this.ListaPIs=ListaPIs;
    }

    public void addToList(PI puntoInteres){
        this.ListaPIs.add(puntoInteres);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String title) {
        this.location = location;
    }
}
