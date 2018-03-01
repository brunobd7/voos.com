/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import Controle.Aviao;
import java.util.List;
import modelo.Avioes;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;

/**
 *
 * @author Bruno
 */
public class AviaoDAOTest {
    
    public AviaoDAOTest() {
    }

    /**
     * Test of cadastrarAviao method, of class AviaoDAO.
     */
    @Test
    public void testCadastrarAviao() throws Exception {
        System.out.println("Teste de cadastro do Avião no sistema");
        
        Avioes aviao = new Avioes();
        
        AviaoDAO dao = Mockito.mock(AviaoDAO.class);
        when(dao.cadastrarAviaoTeste(aviao)).thenReturn(true);
        
        boolean expResult = true;
        boolean result = dao.cadastrarAviaoTeste(aviao);
        
        assertEquals(expResult, result);
    }
    
}
