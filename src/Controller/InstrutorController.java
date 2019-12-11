/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CadastroInstrutorModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import util.Conexao;

/**
 *
 * @author tylui
 */
public class InstrutorController {
    public boolean inserirInstrutor(CadastroInstrutorModel instrutor) {
        boolean retorno = false;
        Conexao c = new Conexao();
        /*String sql="insert into produto(descricao,valor,estoque) "
                + "values('"+produto.getDescricao()+"',"+produto.getPreco()+","+produto.getEstoque()+")";*/
        String sql = "insert into instrutor(nome,sexo,cpf,rua,bairro,numero,cidade,horario,salario,estado)"
                + "values(?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement sentenca = c.con.prepareStatement(sql);
            sentenca.setString(1, instrutor.getNomeInstrutor());
            sentenca.setString(2, instrutor.getSexoInstrutor());
            sentenca.setString(3, instrutor.getCpfInstrutor());
            sentenca.setString(4, instrutor.getRuaInstrutor());
            sentenca.setString(5, instrutor.getBairroInstrutor());
            sentenca.setInt(6, instrutor.getNumeroInstrutor());
            sentenca.setString(7, instrutor.getCidadeInstrutor());
            sentenca.setString(8, instrutor.getHorarioInstrutor());
            sentenca.setString(9, instrutor.getSalarioInstrutor());
            sentenca.setString(10, instrutor.getEstadoInstrutor());
            if (!sentenca.execute()) {
                retorno = true;
            }
            c.desconectar();
        } catch (SQLException erro) {
            System.out.println("Erro na sentenca: " + erro.getMessage());
        }
        return retorno;
    }
    
    public boolean editarInstrutor(CadastroInstrutorModel instrutor) {
        boolean retorno = false;
        Conexao c = new Conexao();
        String sql = "update instrutor set nome = ?, sexo = ?, cpf = ?, rua = ?, bairro = ?, numero = ?, cidade = ?"
                + ", horario = ?, salario=?,estado = ?"
                + "where idinstrutor=?";
        try {
            PreparedStatement sentenca = c.con.prepareStatement(sql);
            sentenca.setString(1, instrutor.getNomeInstrutor());
            sentenca.setString(2, instrutor.getSexoInstrutor());
            sentenca.setString(3, instrutor.getCpfInstrutor());
            sentenca.setString(4, instrutor.getRuaInstrutor());
            sentenca.setString(5, instrutor.getBairroInstrutor());
            sentenca.setInt(6, instrutor.getNumeroInstrutor());
            sentenca.setString(7, instrutor.getCidadeInstrutor());
            sentenca.setString(8, instrutor.getHorarioInstrutor());
            sentenca.setString(9, instrutor.getSalarioInstrutor());
            sentenca.setString(10, instrutor.getEstadoInstrutor());
            sentenca.setInt(11, instrutor.getCodigoInstrutor());
            if (sentenca.executeUpdate() == 1) {
                retorno = true;
            }
            c.desconectar();
        } catch (SQLException erro) {
            System.out.println("Erro na sentenca: " + erro.getMessage());
        }
        return retorno;
    }
    
    public CadastroInstrutorModel selecionarInstrutor(CadastroInstrutorModel instrutor) {
        CadastroInstrutorModel i = null;
        Conexao c = new Conexao();
        String sql = "select * from instrutor where idinstrutor=?";
        try {
            PreparedStatement sentenca = c.con.prepareStatement(sql);
            sentenca = c.con.prepareStatement(sql);
            sentenca.setInt(1, instrutor.getCodigoInstrutor());
            ResultSet rs = sentenca.executeQuery();
            if (rs.next()) {
                i = new CadastroInstrutorModel();
                i.setCodigoInstrutor(rs.getInt("idinstrutor"));
                i.setNomeInstrutor(rs.getString("nome"));
                i.setSexoInstrutor(rs.getString("sexo"));
                i.setCpfInstrutor(rs.getString("cpf"));
                i.setRuaInstrutor(rs.getString("rua"));
                i.setBairroInstrutor(rs.getString("bairro"));
                i.setNumeroInstrutor(rs.getInt("numero"));
                i.setCidadeInstrutor(rs.getString("cidade"));
                i.setHorarioInstrutor(rs.getString("horario"));
                i.setSalarioInstrutor(rs.getString("salario"));
                i.setEstadoInstrutor(rs.getString("estado"));
            }
            c.desconectar();
        } catch (SQLException erro) {
            System.out.println("Erro na sentenca: " + erro.getMessage());
        }
        return i;
    }
    
    public ArrayList<CadastroInstrutorModel> selecionarTodosInstrutores(){
        ArrayList<CadastroInstrutorModel> lista = new ArrayList<>();
        Conexao c = new Conexao();
        String sql = "select * from instrutor";
        try{
            PreparedStatement sentenca = c.con.prepareStatement(sql);
            ResultSet rs = sentenca.executeQuery();
            while(rs.next()){
                CadastroInstrutorModel i= new CadastroInstrutorModel();
                i.setCodigoInstrutor(rs.getInt("idinstrutor"));
                i.setNomeInstrutor(rs.getString("nome"));
                i.setSexoInstrutor(rs.getString("sexo"));
                i.setCpfInstrutor(rs.getString("cpf"));
                i.setRuaInstrutor(rs.getString("rua"));
                i.setBairroInstrutor(rs.getString("bairro"));
                i.setNumeroInstrutor(rs.getInt("numero"));
                i.setCidadeInstrutor(rs.getString("cidade"));
                i.setHorarioInstrutor(rs.getString("horario"));
                i.setSalarioInstrutor(rs.getString("salario"));
                i.setEstadoInstrutor(rs.getString("estado"));
                lista.add(i);
            }
            c.desconectar();
        }catch(SQLException erro){
            System.out.println("Erro na sentenca: "+ erro.getMessage());
        }
        return lista;
    }
    
    public int ultimoIdInstrutor(){
        int codigo = 0;
        Conexao c = new Conexao();
        String sql = "select max(idinstrutor) from instrutor";
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
    
    public ArrayList<CadastroInstrutorModel> selecionarTodosNomesInstrutores(CadastroInstrutorModel instrutor){
        ArrayList<CadastroInstrutorModel> lista = new ArrayList<>();
        Conexao c = new Conexao();
        String sql = "select * from instrutor where nome=?";
        try{
            PreparedStatement sentenca = c.con.prepareStatement(sql);
            sentenca.setString(1, instrutor.getNomeInstrutor());
            ResultSet rs = sentenca.executeQuery();
            while(rs.next()){
                CadastroInstrutorModel i= new CadastroInstrutorModel();
                i.setCodigoInstrutor(rs.getInt("idinstrutor"));
                i.setNomeInstrutor(rs.getString("nome"));
                i.setSexoInstrutor(rs.getString("sexo"));
                i.setCpfInstrutor(rs.getString("cpf"));
                i.setRuaInstrutor(rs.getString("rua"));
                i.setBairroInstrutor(rs.getString("bairro"));
                i.setNumeroInstrutor(rs.getInt("numero"));
                i.setCidadeInstrutor(rs.getString("cidade"));
                i.setHorarioInstrutor(rs.getString("horario"));
                i.setSalarioInstrutor(rs.getString("salario"));
                i.setEstadoInstrutor(rs.getString("estado"));
                lista.add(i);
            }
            c.desconectar();
        }catch(SQLException erro){
            System.out.println("Erro na sentenca: "+ erro.getMessage());
        }
        return lista;
    }
}
