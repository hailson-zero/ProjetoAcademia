/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CadastroAlunoModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import util.Conexao;

/**
 *
 * @author tylui
 */
public class AlunoController {

    public boolean inserirAluno(CadastroAlunoModel aluno) {
        boolean retorno = false;
        Conexao c = new Conexao();
        /*String sql="insert into produto(descricao,valor,estoque) "
                + "values('"+produto.getDescricao()+"',"+produto.getPreco()+","+produto.getEstoque()+")";*/
        String sql = "insert into aluno(nome,sexo,cpf,rua,bairro,numero,cidade,horario,estado,pesoCorporal,"
                + "estatura,triceps,subescapular,abdominal,supra,punho,femur,gordura,muscular,imc,pesoMagro,pesoMuscular,"
                + "pesoGordo,pesoResidual,pesoOsseo,pesoMinimo,pesoMaximo,excesso) "
                + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement sentenca = c.con.prepareStatement(sql);
            sentenca.setString(1, aluno.getNomeAluno());
            sentenca.setString(2, aluno.getSexoAluno());
            sentenca.setString(3, aluno.getCpfAluno());
            sentenca.setString(4, aluno.getRuaAluno());
            sentenca.setString(5, aluno.getBairroAluno());
            sentenca.setInt(6, aluno.getNumeroAluno());
            sentenca.setString(7, aluno.getCidadeAluno());
            sentenca.setString(8, aluno.getHorarioAluno());
            sentenca.setString(9, aluno.getEstadoAluno());
            sentenca.setFloat(10, aluno.getPesoCorporal());
            sentenca.setFloat(11, aluno.getEstatura());
            sentenca.setFloat(12, aluno.getTriceps());
            sentenca.setFloat(13, aluno.getSubescapular());
            sentenca.setFloat(14, aluno.getAbdominal());
            sentenca.setFloat(15, aluno.getSupra());
            sentenca.setFloat(16, aluno.getPunho());
            sentenca.setFloat(17, aluno.getFemur());
            sentenca.setFloat(18, aluno.getGordura());
            sentenca.setFloat(19, aluno.getMuscular());
            sentenca.setFloat(20, aluno.getImc());
            sentenca.setFloat(21, aluno.getPesoMagro());
            sentenca.setFloat(22, aluno.getPesoMuscular());
            sentenca.setFloat(23, aluno.getPesoGordo());
            sentenca.setFloat(24, aluno.getPesoResidual());
            sentenca.setFloat(25, aluno.getPesoOsseo());
            sentenca.setFloat(26, aluno.getPesoMinimo());
            sentenca.setFloat(27, aluno.getPesoMaximo());
            sentenca.setFloat(28, aluno.getExcesso());
            if (!sentenca.execute()) {
                retorno = true;
            }
            c.desconectar();
        } catch (SQLException erro) {
            System.out.println("Erro na sentenca: " + erro.getMessage());
        }
        return retorno;
    }

    public boolean editarAluno(CadastroAlunoModel aluno) {
        boolean retorno = false;
        Conexao c = new Conexao();
        String sql = "update aluno set nome = ?, sexo = ?, cpf = ?, rua = ?, bairro = ?, numero = ?, cidade = ?"
                + ", horario = ?, estado = ?, pesoCorporal = ?, estatura = ?, triceps = ?, subescapular = ?"
                + ", abdominal = ? , supra = ?, punho = ?, femur = ?, gordura = ?, muscular = ?, imc = ?"
                + ", pesoMagro = ?, pesoMuscular = ?, pesoGordo = ?, pesoResidual = ?, pesoOsseo = ?"
                + ", pesoMinimo = ?, pesoMaximo = ?, excesso = ?"
                + "where idaluno=?";
        try {
            PreparedStatement sentenca = c.con.prepareStatement(sql);
            sentenca.setString(1, aluno.getNomeAluno());
            sentenca.setString(2, aluno.getSexoAluno());
            sentenca.setString(3, aluno.getCpfAluno());
            sentenca.setString(4, aluno.getRuaAluno());
            sentenca.setString(5, aluno.getBairroAluno());
            sentenca.setInt(6, aluno.getNumeroAluno());
            sentenca.setString(7, aluno.getCidadeAluno());
            sentenca.setString(8, aluno.getHorarioAluno());
            sentenca.setString(9, aluno.getEstadoAluno());
            sentenca.setFloat(10, aluno.getPesoCorporal());
            sentenca.setFloat(11, aluno.getEstatura());
            sentenca.setFloat(12, aluno.getTriceps());
            sentenca.setFloat(13, aluno.getSubescapular());
            sentenca.setFloat(14, aluno.getAbdominal());
            sentenca.setFloat(15, aluno.getSupra());
            sentenca.setFloat(16, aluno.getPunho());
            sentenca.setFloat(17, aluno.getFemur());
            sentenca.setFloat(18, aluno.getGordura());
            sentenca.setFloat(19, aluno.getMuscular());
            sentenca.setFloat(20, aluno.getImc());
            sentenca.setFloat(21, aluno.getPesoMagro());
            sentenca.setFloat(22, aluno.getPesoMuscular());
            sentenca.setFloat(23, aluno.getPesoGordo());
            sentenca.setFloat(24, aluno.getPesoResidual());
            sentenca.setFloat(25, aluno.getPesoOsseo());
            sentenca.setFloat(26, aluno.getPesoMinimo());
            sentenca.setFloat(27, aluno.getPesoMaximo());
            sentenca.setFloat(28, aluno.getExcesso());
            sentenca.setInt(29, aluno.getCodigoAluno());
            if (sentenca.executeUpdate() == 1) {
                retorno = true;
            }
            c.desconectar();
        } catch (SQLException erro) {
            System.out.println("Erro na sentenca: " + erro.getMessage());
        }
        return retorno;
    }

    public CadastroAlunoModel selecionarAluno(CadastroAlunoModel aluno) {
        CadastroAlunoModel a = null;
        Conexao c = new Conexao();
        String sql = "select * from aluno where idaluno=?";
        try {
            PreparedStatement sentenca = c.con.prepareStatement(sql);
            sentenca = c.con.prepareStatement(sql);
            sentenca.setInt(1, aluno.getCodigoAluno());
            ResultSet rs = sentenca.executeQuery();
            if (rs.next()) {
                a = new CadastroAlunoModel();
                a.setCodigoAluno(rs.getInt("idaluno"));
                a.setNomeAluno(rs.getString("nome"));
                a.setSexoAluno(rs.getString("sexo"));
                a.setCpfAluno(rs.getString("cpf"));
                a.setRuaAluno(rs.getString("rua"));
                a.setBairroAluno(rs.getString("bairro"));
                a.setNumeroAluno(rs.getInt("numero"));
                a.setCidadeAluno(rs.getString("cidade"));
                a.setHorarioAluno(rs.getString("horario"));
                a.setEstadoAluno(rs.getString("estado"));
                a.setPesoCorporal(rs.getFloat("pesoCorporal"));
                a.setEstatura(rs.getFloat("estatura"));
                a.setTriceps(rs.getFloat("triceps"));
                a.setSubescapular(rs.getFloat("subescapular"));
                a.setAbdominal(rs.getFloat("abdominal"));
                a.setSupra(rs.getFloat("supra"));
                a.setPunho(rs.getFloat("punho"));
                a.setFemur(rs.getFloat("femur"));
                a.setGordura(rs.getFloat("gordura"));
                a.setMuscular(rs.getFloat("muscular"));
                a.setImc(rs.getFloat("imc"));
                a.setPesoMagro(rs.getFloat("pesoMagro"));
                a.setPesoMuscular(rs.getFloat("pesoMuscular"));
                a.setPesoGordo(rs.getFloat("pesoGordo"));
                a.setPesoResidual(rs.getFloat("pesoResidual"));
                a.setPesoOsseo(rs.getFloat("pesoOsseo"));
                a.setPesoMinimo(rs.getFloat("pesoMinimo"));
                a.setPesoMaximo(rs.getFloat("pesoMaximo"));
                a.setExcesso(rs.getFloat("excesso")); 
            }
            c.desconectar();
        } catch (SQLException erro) {
            System.out.println("Erro na sentenca: " + erro.getMessage());
        }
        return a;
    }
    
    public ArrayList<CadastroAlunoModel> selecionarTodosAlunos(){
        ArrayList<CadastroAlunoModel> lista = new ArrayList<>();
        Conexao c = new Conexao();
        String sql = "select * from aluno";
        try{
            PreparedStatement sentenca = c.con.prepareStatement(sql);
            ResultSet rs = sentenca.executeQuery();
            while(rs.next()){
                CadastroAlunoModel a= new CadastroAlunoModel();
                a.setCodigoAluno(rs.getInt("idaluno"));
                a.setNomeAluno(rs.getString("nome"));
                a.setSexoAluno(rs.getString("sexo"));
                a.setCpfAluno(rs.getString("cpf"));
                a.setRuaAluno(rs.getString("rua"));
                a.setBairroAluno(rs.getString("bairro"));
                a.setNumeroAluno(rs.getInt("numero"));
                a.setCidadeAluno(rs.getString("cidade"));
                a.setHorarioAluno(rs.getString("horario"));
                a.setEstadoAluno(rs.getString("estado"));
                a.setPesoCorporal(rs.getFloat("pesoCorporal"));
                a.setEstatura(rs.getFloat("estatura"));
                a.setTriceps(rs.getFloat("triceps"));
                a.setSubescapular(rs.getFloat("subescapular"));
                a.setAbdominal(rs.getFloat("abdominal"));
                a.setSupra(rs.getFloat("supra"));
                a.setPunho(rs.getFloat("punho"));
                a.setFemur(rs.getFloat("femur"));
                a.setGordura(rs.getFloat("gordura"));
                a.setMuscular(rs.getFloat("muscular"));
                a.setImc(rs.getFloat("imc"));
                a.setPesoMagro(rs.getFloat("pesoMagro"));
                a.setPesoMuscular(rs.getFloat("pesoMuscular"));
                a.setPesoGordo(rs.getFloat("pesoGordo"));
                a.setPesoResidual(rs.getFloat("pesoResidual"));
                a.setPesoOsseo(rs.getFloat("pesoOsseo"));
                a.setPesoMinimo(rs.getFloat("pesoMinimo"));
                a.setPesoMaximo(rs.getFloat("pesoMaximo"));
                a.setExcesso(rs.getFloat("excesso")); 
                lista.add(a);
            }
            c.desconectar();
        }catch(SQLException erro){
            System.out.println("Erro na sentenca: "+ erro.getMessage());
        }
        return lista;
    }
    
    public int ultimoIdAluno(){
        int codigo = 0;
        Conexao c = new Conexao();
        String sql = "select max(idaluno) from produto";
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
    
    
    public ArrayList<CadastroAlunoModel> selecionarTodosNomesAlunos(CadastroAlunoModel aluno){
        ArrayList<CadastroAlunoModel> lista = new ArrayList<>();
        Conexao c = new Conexao();
        String sql = "select * from aluno where nome=?";
        try{
            PreparedStatement sentenca = c.con.prepareStatement(sql);
            sentenca.setString(1, aluno.getNomeAluno());
            ResultSet rs = sentenca.executeQuery();
            while(rs.next()){
                CadastroAlunoModel a= new CadastroAlunoModel();
                a.setCodigoAluno(rs.getInt("idaluno"));
                a.setNomeAluno(rs.getString("nome"));
                a.setSexoAluno(rs.getString("sexo"));
                a.setCpfAluno(rs.getString("cpf"));
                a.setRuaAluno(rs.getString("rua"));
                a.setBairroAluno(rs.getString("bairro"));
                a.setNumeroAluno(rs.getInt("numero"));
                a.setCidadeAluno(rs.getString("cidade"));
                a.setHorarioAluno(rs.getString("horario"));
                a.setEstadoAluno(rs.getString("estado"));
                a.setPesoCorporal(rs.getFloat("pesoCorporal"));
                a.setEstatura(rs.getFloat("estatura"));
                a.setTriceps(rs.getFloat("triceps"));
                a.setSubescapular(rs.getFloat("subescapular"));
                a.setAbdominal(rs.getFloat("abdominal"));
                a.setSupra(rs.getFloat("supra"));
                a.setPunho(rs.getFloat("punho"));
                a.setFemur(rs.getFloat("femur"));
                a.setGordura(rs.getFloat("gordura"));
                a.setMuscular(rs.getFloat("muscular"));
                a.setImc(rs.getFloat("imc"));
                a.setPesoMagro(rs.getFloat("pesoMagro"));
                a.setPesoMuscular(rs.getFloat("pesoMuscular"));
                a.setPesoGordo(rs.getFloat("pesoGordo"));
                a.setPesoResidual(rs.getFloat("pesoResidual"));
                a.setPesoOsseo(rs.getFloat("pesoOsseo"));
                a.setPesoMinimo(rs.getFloat("pesoMinimo"));
                a.setPesoMaximo(rs.getFloat("pesoMaximo"));
                a.setExcesso(rs.getFloat("excesso")); 
                lista.add(a);
            }
            c.desconectar();
        }catch(SQLException erro){
            System.out.println("Erro na sentenca: "+ erro.getMessage());
        }
        return lista;
    }
}
