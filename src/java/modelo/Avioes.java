/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Matheus
 */
public class Avioes {
    
    private long id_aviao;
    private String modelo;
    private int qtde_poltronas;
    
    public Avioes(){
        
    }

    /**
     * @return the id_aviao
     */
    public long getId_aviao() {
        return id_aviao;
    }

    /**
     * @param id_aviao the id_aviao to set
     */
    public void setId_aviao(long id_aviao) {
        this.id_aviao = id_aviao;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        
        if(modelo==null)
            throw new IllegalArgumentException("Não e permitido modelo nulo!!!");
        this.modelo = modelo;
    }

    /**
     * @return the qtde_poltronas
     */
    public int getQtde_poltronas() {
        return qtde_poltronas;
    }

    /**
     * @param qtde_poltronas the qtde_poltronas to set
     */
    public void setQtde_poltronas(int qtde_poltronas) {
        
        if(qtde_poltronas<=0)
            throw new IllegalArgumentException("Não é permitido o cadastro com quantidade negativa !!!");
        this.qtde_poltronas = qtde_poltronas;
        
        
    }
    
    
}
