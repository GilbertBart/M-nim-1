package edu.upc.dsa.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PI { // Punto Interes

    String namePI;
    List<Usuario> ListaUsuariosPI ;

    public PI() {

    }

    public PI(String namePI, List<Usuario> ListaUsuariosPI) {
        this();
        this.setNamePI(namePI);
        this.setListaUsuariosPI(ListaUsuariosPI);
    }

    public PI(String namePI) {
        this();
        this.setNamePI(namePI);
        this.ListaUsuariosPI = new ArrayList<>();
    }

    public String getNamePI() {
        return this.namePI;
    }

    public void setNamePI(String namePI) {
        this.namePI=namePI;
    }

    public void addToList(Usuario u){
        this.ListaUsuariosPI.add(u);
    }


    public List<Usuario> getListaUsuariosPI() {
        return ListaUsuariosPI;
    }

    public void setListaUsuariosPI(List<Usuario> ListaUsuariosPI) {
        this.ListaUsuariosPI = ListaUsuariosPI;
    }

//    public List<Usuario> getListaOrdenada(){
//
//    }
//
////    @Override
////    public List<Usuario> listarUsuariosOrdenados() {
////
////        List<Usuario> usuariosOrdenados = Arrays.asList(mapUsuarios.values().stream().sorted(
////                (s1,s2)->s1.getId().compareToIgnoreCase(s2.getId())).toArray(Usuario[]::new));
////
////        return usuariosOrdenados;
////    }
}
