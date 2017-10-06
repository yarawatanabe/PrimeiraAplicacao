package primeiraaplicacao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author internet
 */
public class Carro {

    //Atributos    
    private String chassi;
    private String cor;
    private String modelo;
    
/**
 * Este método recebe o chassi do carro.
 * @return 
 */
    public String getChassi() {
        return chassi;
    }
/**
 * Este método atribui o chassi do carro.
 * @param chassi 
 */
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
/**
 * Este método recebe o cor do carro.
 * @return 
 */
    public String getCor() {
        return cor;
    }
/**
 * Este método atribui a cor do carro.
 * @param cor 
 */
    public void setCor(String cor) {
        this.cor = cor;
    }
/**
 * Este método recebe o modelo do carro.
 * @return 
 */
    public String getModelo() {
        return modelo;
    }
/**
 * Este método atribui o modelo do carro.
 * @param modelo 
 */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
}
