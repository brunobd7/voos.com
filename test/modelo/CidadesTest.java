/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bruno
 */
public class CidadesTest {
    
    public CidadesTest() {
    }

    @Test (expected = IllegalArgumentException.class)
    public void CasoDeTeste05_CadastroCidadeUfVazioNulo() {
        System.out.println("Teste 5 - Inserção de uma cidade com UF vazio ou nulo");
        Cidades instance = new Cidades();
        instance.setUf("");
        instance.setNome("Curitiba");
        
        fail("Era previsto um exceção !!!");
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void CasoDeTeste06_CadastroCidadeNomeNulo() {
        System.out.println("Teste 6 - Inserção de uma cidade com nome nulo");
        Cidades instance = new Cidades();
        instance.setUf("GO");
        instance.setNome(null);
        
        fail("Era previsto um exceção !!!");
    }
    
}
