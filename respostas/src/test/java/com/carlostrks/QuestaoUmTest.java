package com.carlostrks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QuestaoUmTest {

    @Test
    void testeComNumeroMaiorQueZero(){
        Assertions.assertTrue(QuestaoUm.imprime(6));
    }

    @Test
    void testeComNumeroIgualZero(){
        Assertions.assertFalse(QuestaoUm.imprime(0));
    }

    @Test
    void testeComNumeroMenorQueZero(){
        Assertions.assertFalse(QuestaoUm.imprime(-1));
    }


}