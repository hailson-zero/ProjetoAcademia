/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author tylui
 */
public class CadastroTreinoModel {
    private int codigoTreino;
    private String modalidade;
    private String descricao;
    private String duracao;
    private String esforço;
    private float freqCardiaca;
    private float gastoCalorico;
    private CadastroAlunoModel idaluno_fk;

    public CadastroAlunoModel getIdaluno_fk() {
        return idaluno_fk;
    }

    public void setIdaluno_fk(CadastroAlunoModel idaluno_fk) {
        this.idaluno_fk = idaluno_fk;
    }

    public CadastroTreinoModel(){
        idaluno_fk = new CadastroAlunoModel();
    }
    
    public int getCodigoTreino() {
        return codigoTreino;
    }

    public void setCodigoTreino(int codigoTreino) {
        this.codigoTreino = codigoTreino;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getEsforço() {
        return esforço;
    }

    public void setEsforço(String esforço) {
        this.esforço = esforço;
    }

    public float getFreqCardiaca() {
        return freqCardiaca;
    }

    public void setFreqCardiaca(float freqCardiaca) {
        this.freqCardiaca = freqCardiaca;
    }

    public float getGastoCalorico() {
        return gastoCalorico;
    }

    public void setGastoCalorico(float gastoCalorico) {
        this.gastoCalorico = gastoCalorico;
    }
    
    
}
