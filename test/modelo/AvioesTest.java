/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 *
 * @author Bruno
 */
public class AvioesTest {
    
    public AvioesTest() {
    }

   
    @Test
    public void CasoDeTeste01_CadastroAviaoQtdePoltrona0() {
        System.out.println("Teste - Cadastro de Aviao com qtde de poltronas igual a 0");
        Avioes instance = new Avioes();
        Integer expResult = new Integer(0);
        Integer result = instance.getQtde_poltronas();
        assertEquals(expResult, result);
    }

    
    @Test (expected = IllegalArgumentException.class)
    public void CasoDeTeste02_CadastroAviaoQtdePoltronaNegativo() {
        System.out.println("Teste 2 - Cadastro de Aviao com qtde de poltronas negativa!");
        Avioes instance = new Avioes();
        instance.setModelo("Boing777");
        instance.setQtde_poltronas(-8);
        // TODO review the generated test code and remove the default call to fail.
        fail("Era previsto um exceção !!!");
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void CasoDeTeste03_CadastroAviaoModeloNulo() {
        System.out.println("Teste 3 - Cadastro de Aviao sem Modelo especificado!");
        Avioes instance = new Avioes();
        instance.setModelo(null);
        instance.setQtde_poltronas(350);
        // TODO review the generated test code and remove the default call to fail.
        fail("Era previsto um exceção !!!");
    }
    
}
