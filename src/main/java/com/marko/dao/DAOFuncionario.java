package com.marko.dao;

import com.marko.interfaces.IFuncionario;
import com.marko.model.Funcionario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Objeto de acesso aos dados de funcionarios
 *
 * @author douglas
 */
public class DAOFuncionario implements IFuncionario {

    private Connection conexao;

    public DAOFuncionario() {
        this.conexao = new Conexao().conectar();
    }

    /**
     * Adiciona um funcionario
     */
    public void inserirFuncionario(Funcionario funcionario) {
        String sql = DAOUtil.getQuery("funcionario.insert");
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, funcionario.getLogin());
            stmt.setString(2, funcionario.getSenha());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw DAOUtil.exception(e, "Problemas ao cadastrar funcionario");
        }

    }

    /**
     * Lista todos os funcionarios da base
     *
     * @return uma lista com todos os funcionarios
     */
    public ArrayList<Funcionario> listarFuncionarios() {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        String sql = DAOUtil.getQuery("funcionario.select");

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setId(rs.getInt("CODIGO"));
                funcionario.setLogin(rs.getString("LOGIN"));
                funcionario.setSenha(rs.getString("SENHA"));
                funcionarios.add(funcionario);
            }

            rs.close();
            return funcionarios;
        } catch (SQLException e) {
            throw DAOUtil.exception(e, "Problemas ao listar os funcionarios");
        }
    }

    /**
     * Altera os dados de um funcionario
     */
    public void atualizarFuncionario(Funcionario funcionario) {
        String sql = DAOUtil.getQuery("funcionario.update");

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, funcionario.getSenha());
            stmt.setLong(2, funcionario.getId());
            stmt.execute();

        } catch (SQLException e) {
            throw DAOUtil.exception(e, "Problemas ao alterar um funcionario");
        }
    }

    /**
     * Remove um funcionario do banco
     */
    public void removerFuncionario(int id) {
        String sql = DAOUtil.getQuery("funcionario.delete");
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setLong(1, id);
            stmt.execute();
        } catch (SQLException e) {
            throw DAOUtil.exception(e, "Problemas ao remover um funcionario");
        }
    }

    @Override
    public Funcionario buscarFuncionarioNome(String Login) {
        String sql = DAOUtil.getQuery("funcionario.login");
        Funcionario funcionario = new Funcionario();
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, Login);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                funcionario.setId(rs.getInt("CODIGO"));
                funcionario.setLogin(rs.getString("LOGIN"));
                funcionario.setSenha(rs.getString("SENHA"));

            }
            rs.close();
            return funcionario;

        } catch (SQLException e) {
            throw DAOUtil.exception(e, "problemas ao buscar funcionario pelo Login");
        }
    }

}