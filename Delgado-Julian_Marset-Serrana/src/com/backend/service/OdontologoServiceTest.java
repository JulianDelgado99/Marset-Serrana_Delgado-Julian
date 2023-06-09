package com.backend.service;

import com.backend.dao.impl.OdontologoDaoH2;
import com.backend.entity.Odontologo;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OdontologoServiceTest {

    private OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());


    @Test
    public void deberiaListarTodosLosOdontologos() {
        List<Odontologo> odontologosTest = odontologoService.listarOdontologos();
        assertFalse(odontologosTest.isEmpty());
        assertTrue(odontologosTest.size() >= 2);

    }

    @Test
    public void deberiaGuardarUnOdontologo() {
        Odontologo odontologo = new Odontologo(1212, "Valentina", "Marset");
        Odontologo odontologoGuardar = odontologoService.guardarOdontologo(odontologo);
        assertEquals(odontologoGuardar.getId(), 3);
    }

}