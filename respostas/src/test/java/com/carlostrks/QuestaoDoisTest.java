package com.carlostrks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestaoDoisTest {

    @Test
    void insereSenhaValida() {
        Assertions.assertEquals(0, QuestaoDois.insereSenha("@Jkl2o"));
    }

    @Test
    void insereSenhaMaiorQueSeisInvalida(){
        Assertions.assertNotEquals(0,QuestaoDois.insereSenha("jdh1dhs"));
    }

    @Test
    void insereSenhaComCriteriosMenorQueSeis(){
        Assertions.assertNotEquals(0,QuestaoDois.insereSenha("1D@j"));
    }

    @Test
    void insereSenhaFaltandoCaracterEspecial(){
        Assertions.assertNotEquals(0, QuestaoDois.insereSenha("Ajh6hs"));
    }

}