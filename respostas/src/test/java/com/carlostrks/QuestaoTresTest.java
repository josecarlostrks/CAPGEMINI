package com.carlostrks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QuestaoTresTest {

    @Test
    void testeComNumeroCorretoDeAnagramas(){
        Assertions.assertEquals(3, QuestaoTres.lerDados("ifailuhkqq"));
    }

    @Test
    void testeComNumeroIncorretoDeAnagramas(){
        Assertions.assertNotEquals(3, QuestaoTres.lerDados("ovo"));
    }

}