/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CadastroTreinoModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import util.Conexao;

/**
 *
 * @author tylui
 */
public class TreinoController {
    public boolean inserirTreino(CadastroTreinoModel treino) {
        boolean retorno = false;
        Conexao c = new Conexao();
        /*String sql="insert into produto(descricao,valor,estoque) "
                + "values('"+produto.getDescricao()+"',"+produto.getPreco()+","+produto.getEstoque()+")";*/
        String sql = "insert into treino(modalidade,descricao,duracao,esforco,freqCardiaca,gastoCalorico, idaluno_fk)"
                + "values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement sentenca = c.con.prepareStatement(sql);
            sentenca.setString(1, treino.getModalidade());
            sentenca.setString(2, treino.getDescricao());
            sentenca.setString(3, treino.getDuracao());
            sentenca.setString(4, treino.getEsforço());
            sentenca.setFloat(5, treino.getFreqCardiaca());
            sentenca.setFloat(6, treino.getGastoCalorico());
            sentenca.setInt(7, treino.getIdaluno_fk().getCodigoAluno());
            if (!sentenca.execute()) {
                retorno = true;
            }
            c.desconectar();
        } catch (SQLException erro) {
            System.out.println("Erro na sentenca: " + erro.getMessage());
        }
        return retorno;
    }
    
    public boolean editarTreino(CadastroTreinoModel treino) {
        boolean retorno = false;
        Conexao c = new Conexao();
        String sql = "update treino set modalidade = ?, descricao = ?, duracao = ?, esforco = ?,"
                + " freqCardiaca = ?, gastoCalorico = ?, idaluno_fk = ? "
                + "where idtreino=?";
        try {
            PreparedStatement sentenca = c.con.prepareStatement(sql);
            sentenca.setString(1, treino.getModalidade());
            sentenca.setString(2, treino.getDescricao());
            sentenca.setString(3, treino.getDuracao());
            sentenca.setString(4, treino.getEsforço());
            sentenca.setFloat(5, treino.getFreqCardiaca());
            sentenca.setFloat(6, treino.getGastoCalorico());
            sentenca.setInt(7, treino.getIdaluno_fk().getCodigoAluno());
            sentenca.setInt(8, treino.getCodigoTreino());
            if (sentenca.executeUpdate() == 1) {
                retorno = true;
            }
            c.desconectar();
        } catch (SQLException erro) {
            System.out.println("Erro na sentenca: " + erro.getMessage());
        }
        return retorno;
    }
    
    public CadastroTreinoModel selecionarTreino(CadastroTreinoModel treino) {
        CadastroTreinoModel t = null;
        Conexao c = new Conexao();
        String sql = "select * from treino t inner join aluno a on t.idaluno_fk = a.idaluno where idtreino=?";
        try {
            PreparedStatement sentenca = c.con.prepareStatement(sql);
            sentenca = c.con.prepareStatement(sql);
            sentenca.setInt(1, treino.getCodigoTreino());
            ResultSet rs = sentenca.executeQuery();
            if (rs.next()) {
                t = new CadastroTreinoModel();
                t.setCodigoTreino(rs.getInt("idtreino"));
                t.setModalidade(rs.getString("modalidade"));
                t.setDescricao(rs.getString("descricao"));
                t.setDuracao(rs.getString("duracao"));
                t.setEsforço(rs.getString("esforco"));
                t.setFreqCardiaca(rs.getFloat("freqCardiaca"));
                t.setGastoCalorico(rs.getFloat("gastoCalorico"));
                t.getIdaluno_fk().setCodigoAluno(rs.getInt("idaluno_fk"));
                t.getIdaluno_fk().setNomeAluno(rs.getString("nome"));
            }
            c.desconectar();
        } catch (SQLException erro) {
            System.out.println("Erro na sentenca: " + erro.getMessage());
        }
        return t;
    }
    
    public ArrayList<CadastroTreinoModel> selecionarTodosTreinos(){
        ArrayList<CadastroTreinoModel> lista = new ArrayList<>();
        Conexao c = new Conexao();
        String sql = "select * from treino t inner join aluno a on t.idaluno_fk = a.idaluno";
        try{
            PreparedStatement sentenca = c.con.prepareStatement(sql);
            ResultSet rs = sentenca.executeQuery();
            while(rs.next()){
                CadastroTreinoModel t= new CadastroTreinoModel();
                t.setCodigoTreino(rs.getInt("idtreino"));
                t.setModalidade(rs.getString("modalidade"));
                t.setDescricao(rs.getString("descricao"));
                t.setDuracao(rs.getString("duracao"));
                t.setEsforço(rs.getString("esforco"));
                t.setFreqCardiaca(rs.getFloat("freqCardiaca"));
                t.setGastoCalorico(rs.getFloat("gastoCalorico"));
                t.getIdaluno_fk().setCodigoAluno(rs.getInt("idaluno_fk"));
                t.getIdaluno_fk().setNomeAluno(rs.getString("nome"));
                lista.add(t);
            }
            c.desconectar();
        }catch(SQLException erro){
            System.out.println("Erro na sentenca: "+ erro.getMessage());
        }
        return lista;
    }
    
    public int ultimoIdTreino(){
        int codigo = 0;
        Conexao c = new Conexao();
        String sql = "select max(idtreino) from treino";
        try{
            PreparedStatement sentenca = c.con.prepareStatement(sql);
            ResultSet rs = sentenca.executeQuery();
            if(rs.next())
                codigo = rs.getInt(1);
            c.desconectar();
        }catch(SQLException erro){
            System.out.println("Erro na sentença: "+ erro.getMessage());
        }
        return codigo;
    }
    
    public ArrayList<CadastroTreinoModel> selecionarTodosModalidadesTreinos(CadastroTreinoModel treino){
        ArrayList<CadastroTreinoModel> lista = new ArrayList<>();
        Conexao c = new Conexao();
        String sql = "select * from treino t inner join aluno a on t.idaluno_fk = a.idaluno where nome=?";
        try{
            PreparedStatement sentenca = c.con.prepareStatement(sql);
            sentenca.setString(1, treino.getModalidade());
            ResultSet rs = sentenca.executeQuery();
            while(rs.next()){
                CadastroTreinoModel t= new CadastroTreinoModel();
                t.setCodigoTreino(rs.getInt("idtreino"));
                t.setModalidade(rs.getString("modalidade"));
                t.setDescricao(rs.getString("descricao"));
                t.setDuracao(rs.getString("duracao"));
                t.setEsforço(rs.getString("esforco"));
                t.setFreqCardiaca(rs.getFloat("freqCardiaca"));
                t.setGastoCalorico(rs.getFloat("gastoCalorico"));
                t.getIdaluno_fk().setCodigoAluno(rs.getInt("idaluno_fk"));
                t.getIdaluno_fk().setNomeAluno(rs.getString("nome"));
                lista.add(t);
            }
            c.desconectar();
        }catch(SQLException erro){
            System.out.println("Erro na sentenca: "+ erro.getMessage());
        }
        return lista;
    }
}
