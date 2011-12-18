package br.ufrpe.bcc.ibusiness.venda;

import br.ufrpe.bcc.ibusiness.funcionario.Funcionario;
import br.ufrpe.bcc.ibusiness.cliente.Cliente;
import br.ufrpe.bcc.ibusiness.usuario.Usuario;
import br.ufrpe.bcc.idatabase.Conexao;
import br.ufrpe.bcc.idatabase.DAOUtil;
import java.sql.*;
import java.util.*;

/**
 *
 * @author douglas
 */
public class DAOVenda implements IVenda {

    private Connection conexao;

    public DAOVenda() {
        try {
            this.conexao = new Conexao().conectar();
        } catch (ClassNotFoundException ex) {
            System.err.println(ex.getMessage() );
        }
    }

    public void submeterVenda(Venda venda) {
        String sql = DAOUtil.getQuery("venda.insert");

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, venda.getCliente().getNome());
            stmt.setString(2, venda.getUsuario().getFuncionario().getNome());

            java.util.Date utilDate = venda.getHorario();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            stmt.setDate(3, sqlDate);

            stmt.execute();
        } catch (SQLException e) {
            throw DAOUtil.exception(e, "Problemas ao adicionar fornecedor ao banco");
        }

    }

    public List<Venda> listarVendas() {
        List<Venda> Vendas = new ArrayList<>();
        String sql = DAOUtil.getQuery("venda.select");

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Venda venda = new Venda();
                Cliente cliente = new Cliente();
                Usuario usuario = new Usuario();
                Funcionario funcionario = new Funcionario();
                funcionario.setNome(rs.getString("VENDEDOR"));
                usuario.setFuncionario(funcionario);
                cliente.setNome(rs.getString("CLIENTE"));
                java.sql.Date sqlDate = rs.getDate("HORARIO");  // import java.util.Date;  
                java.util.Date utilDate = new java.util.Date(sqlDate.getYear(), sqlDate.getMonth(), sqlDate.getDate());
                venda.setId(rs.getLong("CODIGO_VENDA"));
                venda.setCliente(cliente);
                venda.setUsuario(usuario);
                venda.setHorario(utilDate);
                Vendas.add(venda);
            }
            rs.close();
            return Vendas;
        } catch (SQLException e) {
            throw DAOUtil.exception(e, "Problemas ao cadastrar funcionario");
        }
    }

    public Venda buscarVenda(Integer codigo) {
        String sql = DAOUtil.getQuery("venda.codigo");

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, codigo);
            ResultSet rs = stmt.executeQuery();
            Venda venda = new Venda();

            while (rs.next()) {
                venda.setId(rs.getLong("CODIGO"));
                Cliente cliente = new Cliente();
                cliente.setNome(rs.getString("CLIENTE"));
                venda.setCliente(cliente);
                Usuario usuario = new Usuario();
                Funcionario funcionario = new Funcionario();
                funcionario.setNome(rs.getString("VENDEDOR"));
                usuario.setFuncionario(funcionario);
                venda.setUsuario(usuario);
                java.sql.Date sqlDate = rs.getDate("HORARIO");  // import java.util.Date;  
                java.util.Date utilDate = new java.util.Date(sqlDate.getYear(), sqlDate.getMonth(), sqlDate.getDate());
                venda.setHorario(utilDate);
            }
            rs.close();
            return venda;

        } catch (SQLException e) {
            throw DAOUtil.exception(e, "Erro ao buscar pelo login do usuario");
        }
    }

    public List<Venda> buscarVenda(Usuario usuario) {
        String sql = DAOUtil.getQuery("venda.usuario");
        List<Venda> Vendas = new ArrayList<>();

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, usuario.getFuncionario().getNome());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Venda venda = new Venda();
                venda.setId(rs.getLong("CODIGO"));
                Cliente cliente = new Cliente();
                cliente.setNome(rs.getString("CLIENTE"));
                venda.setCliente(cliente);
                venda.setUsuario(usuario);
                java.sql.Date sqlDate = rs.getDate("HORARIO");  // import java.util.Date;  
                java.util.Date utilDate = new java.util.Date(sqlDate.getYear(), sqlDate.getMonth(), sqlDate.getDate());
                venda.setHorario(utilDate);
                Vendas.add(venda);
            }
            rs.close();
            return Vendas;

        } catch (SQLException e) {
            throw DAOUtil.exception(e, "Erro ao buscar pelo login do usuario");
        }

    }

    public List<Venda> buscarVenda(Cliente cliente) {
        String sql = DAOUtil.getQuery("venda.cliente");
        List<Venda> Vendas = new ArrayList<>();

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, cliente.getNome());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Venda venda = new Venda();
                venda.setId(rs.getLong("CODIGO"));
                venda.setCliente(cliente);
                Usuario usuario = new Usuario();
                Funcionario funcionario = new Funcionario();
                funcionario.setNome(rs.getString("VENDEDOR"));
                usuario.setFuncionario(funcionario);
                venda.setUsuario(usuario);
                venda.setUsuario(usuario);
                java.sql.Date sqlDate = rs.getDate("HORARIO");  // import java.util.Date;  
                java.util.Date utilDate = new java.util.Date(sqlDate.getYear(), sqlDate.getMonth(), sqlDate.getDate());
                venda.setHorario(utilDate);
                Vendas.add(venda);
            }
            rs.close();
            return Vendas;

        } catch (SQLException e) {
            throw DAOUtil.exception(e, "Erro ao buscar pelo login do usuario");
        }
    }

}