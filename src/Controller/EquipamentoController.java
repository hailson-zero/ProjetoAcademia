/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CadastroEquipamentoModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import util.Conexao;

/**
 *
 * @author tylui
 */
public class EquipamentoController {
    public boolean inserirEquipamento(CadastroEquipamentoModel equipamento) {
        boolean retorno = false;
        Conexao c = new Conexao();
        /*String sql="insert into produto(descricao,valor,estoque) "
                + "values('"+produto.getDescricao()+"',"+produto.getPreco()+","+produto.getEstoque()+")";*/
        String sql = "insert into equipamento(descricao,marca,modelo,peso,tipo,danificado) values(?,?,?,?,?,?)";
        try {
            PreparedStatement sentenca = c.con.prepareStatement(sql);
            sentenca.setString(1, equipamento.getDescricaoEquipamento());
            sentenca.setString(2, equipamento.getMarcaEquipamento());
            sentenca.setString(3, equipamento.getModeloEquipamento());
            sentenca.setString(4, equipamento.getPesoEquipamento());
            sentenca.setString(5, equipamento.getTipoEquipamento());
            sentenca.setString(6, equipamento.getDanificadoEquipamento());
            if (!sentenca.execute()) {
                retorno = true;
            }
            c.desconectar();
        } catch (SQLException erro) {
            System.out.println("Erro na sentenca: " + erro.getMessage());
        }
        return retorno;
    }
    
    public boolean editarEquipamento(CadastroEquipamentoModel equipamento) {
        boolean retorno = false;
        Conexao c = new Conexao();
        String sql = "update equipamento set descricao=?,marca=?,modelo=?,peso=?,tipo=?,danificado=?"
                + "where idequipamento=?";
        try {
            PreparedStatement sentenca = c.con.prepareStatement(sql);
            sentenca.setString(1, equipamento.getDescricaoEquipamento());
            sentenca.setString(2, equipamento.getMarcaEquipamento());
            sentenca.setString(3, equipamento.getModeloEquipamento());
            sentenca.setString(4, equipamento.getPesoEquipamento());
            sentenca.setString(5, equipamento.getTipoEquipamento());
            sentenca.setString(6, equipamento.getDanificadoEquipamento());
            sentenca.setInt(7, equipamento.getCodigoEquipamento());
            if (sentenca.executeUpdate() == 1) {
                retorno = true;
            }
            c.desconectar();
        } catch (SQLException erro) {
            System.out.println("Erro na sentenca: " + erro.getMessage());
        }
        return retorno;
    }
    
    public CadastroEquipamentoModel selecionarEquipamento(CadastroEquipamentoModel equipamento) {
        CadastroEquipamentoModel e = null;
        Conexao c = new Conexao();
        String sql = "select * from equipamento where idEquipamento=?";
        try {
            PreparedStatement sentenca = c.con.prepareStatement(sql);
            sentenca = c.con.prepareStatement(sql);
            sentenca.setInt(1, equipamento.getCodigoEquipamento());
            ResultSet rs = sentenca.executeQuery();
            if (rs.next()) {
                e = new CadastroEquipamentoModel();
                e.setCodigoEquipamento(rs.getInt("idequipamento"));
                e.setDescricaoEquipamento(rs.getString("descricao"));
                e.setMarcaEquipamento(rs.getString("marca"));
                e.setModeloEquipamento(rs.getString("modelo"));
                e.setPesoEquipamento(rs.getString("peso"));
                e.setTipoEquipamento(rs.getString("tipo"));
                e.setDanificadoEquipamento(rs.getString("danificado"));
            }
            c.desconectar();
        } catch (SQLException erro) {
            System.out.println("Erro na sentenca: " + erro.getMessage());
        }
        return e;
    }
    
    public ArrayList<CadastroEquipamentoModel> selecionarTodosEquipamentos(){
        ArrayList<CadastroEquipamentoModel> lista = new ArrayList<>();
        Conexao c = new Conexao();
        String sql = "select * from equipamento";
        try{
            PreparedStatement sentenca = c.con.prepareStatement(sql);
            ResultSet rs = sentenca.executeQuery();
            while(rs.next()){
                CadastroEquipamentoModel e= new CadastroEquipamentoModel();
                e.setCodigoEquipamento(rs.getInt("idequipamento"));
                e.setDescricaoEquipamento(rs.getString("descricao"));
                e.setMarcaEquipamento(rs.getString("marca"));
                e.setModeloEquipamento(rs.getString("modelo"));
                e.setPesoEquipamento(rs.getString("peso"));
                e.setTipoEquipamento(rs.getString("tipo"));
                e.setDanificadoEquipamento(rs.getString("danificado"));
                lista.add(e);
            }
            c.desconectar();
        }catch(SQLException erro){
            System.out.println("Erro na sentenca: "+ erro.getMessage());
        }
        return lista;
    }
    
    public int ultimoIdEquipamento(){
        int codigo = 0;
        Conexao c = new Conexao();
        String sql = "select max(idequipamento) from equipamento";
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
    
    public ArrayList<CadastroEquipamentoModel> selecionarTodosTiposEquipamentos(CadastroEquipamentoModel equipamento){
        ArrayList<CadastroEquipamentoModel> lista = new ArrayList<>();
        Conexao c = new Conexao();
        String sql = "select * from equipamento where tipo=?";
        try{
            PreparedStatement sentenca = c.con.prepareStatement(sql);
            sentenca.setString(1, equipamento.getTipoEquipamento());
            ResultSet rs = sentenca.executeQuery();
            while(rs.next()){
                CadastroEquipamentoModel e= new CadastroEquipamentoModel();
                e.setCodigoEquipamento(rs.getInt("idequipamento"));
                e.setDescricaoEquipamento(rs.getString("descricao"));
                e.setMarcaEquipamento(rs.getString("marca"));
                e.setModeloEquipamento(rs.getString("modelo"));
                e.setPesoEquipamento(rs.getString("peso"));
                e.setTipoEquipamento(rs.getString("tipo"));
                e.setDanificadoEquipamento(rs.getString("danificado"));
                lista.add(e);
            }
            c.desconectar();
        }catch(SQLException erro){
            System.out.println("Erro na sentenca: "+ erro.getMessage());
        }
        return lista;
    }
}
