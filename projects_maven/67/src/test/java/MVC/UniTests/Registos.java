package MVC.UniTests;

import MVC.Models.BaseModels.GPS;
import MVC.Models.BaseModels.Utilizador;
import MVC.Models.BaseModels.Voluntario;
import MVC.Models.Model;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Registos {

    @Test
    public void registaUtilizador(){
        String name = "Pedro";
        double lat = 10;
        double log = 20;
        Model m = new Model();
        String cod = m.addUtilizador(name, lat, log);
        Utilizador u = m.getUtilizador(cod);
        assertNotNull("Utilizador é null", u);
        assertEquals("Código de utilizador não está correto", u.getCod(), cod);
        assertEquals("Nome de utilizador não está correto", u.getName(), name);
        assertEquals("Password não está correta", u.getPass(), cod);
        GPS gps = u.getGPS();
        assertNotNull("GPS é null", gps);
        assertEquals("Latitude não está correta", gps.getX(), lat,0);
        assertEquals("Longitude não está correta", gps.getY(), log,0);
        List<String> encomendas = u.getCodencomendas();
        assertNotNull("Encomendas são null", encomendas);
        assertTrue("Encomendas não está vazio", encomendas.isEmpty());
        List<String> porAceitar = u.getPorAceitar();
        assertNotNull("Por aceitar são null", porAceitar);
        assertTrue("Por aceitar não está vazio", porAceitar.isEmpty());
        List<String> porClassificar = u.getPorClassificar();
        assertNotNull("Por classificar são null", porClassificar);
        assertTrue("Por classificar não está vazio", porClassificar.isEmpty());
        assertEquals("Número de encomendas está errado", 0, u.getNumeroEncomendas());
    }
}
