package edu.upc.dsa;

import edu.upc.dsa.models.PI;
import edu.upc.dsa.models.Usuario;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class UsuarioManagerTest
{
    UsuarioManager myUsuarioManager;

    @Before //Importar clase si el Before , After o Test sale en rojo, hacer los 3 individualmente
    public void setUp() throws Exception{
        this.myUsuarioManager = UsuarioManagerImpl.getInstance();
    }

    @After
    public void tearDown() {
        // this.myProductManager.clear();
    }

    @Test
    public void testUsuariosBasico() throws Exception {

        PI puntoBiblio= new PI("Biblioteca");
        PI puntoCafeteria = new PI ("Cafeteria");


        Usuario uGilbert = new Usuario("Gilbertito");
        Usuario uClaudia = new Usuario("Claudia");
        Usuario uBarto = new Usuario("Bartomeu");

        myUsuarioManager.addUsuario(uGilbert,puntoBiblio);
        Assert.assertEquals("Gilbertito", uGilbert.getId());
        Assert.assertEquals("Gilbertito", puntoBiblio.getListaUsuariosPI().get(0).getId());
        myUsuarioManager.addUsuario(uClaudia,puntoBiblio);
        Assert.assertEquals("Claudia", puntoBiblio.getListaUsuariosPI().get(1).getId());

        myUsuarioManager.addUsuario(uBarto,puntoBiblio);
        myUsuarioManager.addUsuario(uBarto,puntoCafeteria);

        Assert.assertEquals("Cafeteria", uBarto.getListaPIs().get(1).getNamePI());
        Assert.assertEquals("Claudia", puntoBiblio.getListaUsuariosPI().get(1).getId());
        Assert.assertEquals("Bartomeu", puntoBiblio.getListaUsuariosPI().get(2).getId());


        //Test Consultar Info

        List<PI> sitioTransitados = myUsuarioManager.ConsultarInfo("Bartomeu");

        Assert.assertEquals("Cafeteria", sitioTransitados.get(1).getNamePI());


















//        User u1 = new User("Claudia");
//        PuntoInteres biblio = new PuntoInteres("Biblioteca");
//        PuntoInteres cafeteria = new PuntoInteres("Cafeteria");
//        PuntoInteres claseG130 = new PuntoInteres("G130");
//        PuntoInteres fuente = new PuntoInteres("Fuente");



    }
    @Test
    public void testUsuarios2() throws Exception {

    }
}
