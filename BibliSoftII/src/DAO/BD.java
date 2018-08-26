package DAO;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Ricky
 */
public class BD {

   Connection conexao = null;
   Statement consulta;
   public ResultSet resultado;

    public Connection abrir(int op) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/biblisoft";
            conexao = DriverManager.getConnection(url, "root", "");
            if (op == 1) {
                JOptionPane.showMessageDialog(null, "Conexão realizada com sucesso!");
            }
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: Conexão não pode ser realizada!\n"+e.getMessage());
            //e.printStackTrace();
        }
        return conexao;
    }

    public Connection fechar(int op) {
        try {
            conexao.close();
            if (op == 1) {
                JOptionPane.showMessageDialog(null, "Conexão encerrada com sucesso!");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: Conexão não pode ser encerrada!\n"+e.getMessage());
            //e.printStackTrace();
        }
        return null;
    }


    public void inserir(String tabela, String campos, String valores) {
        try {
            conexao = this.abrir(0);
            consulta = conexao.createStatement();
            //String query = "INSERT INTO simples.user VALUES('RASF', '11071993', 'Ricardo Alves');";
            String sql = "INSERT INTO " + tabela + "(" + campos + ") VALUES(" + valores + ");";
            consulta.execute(sql);
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
            JOptionPane.showMessageDialog(null, sql);///exibe o codigo sql
            consulta.close();
            this.fechar(0);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: Não foi possivel inserir!\n" + e.getMessage());
        }

    }

    public void excluir(String tabela, String chave, String valor) {
        try {
            conexao = this.abrir(0);
            consulta = conexao.createStatement();
            String sql = "DELETE FROM " + tabela + " WHERE(" + chave + " = '" + valor + "');";
            consulta.execute(sql);
            JOptionPane.showMessageDialog(null, "Removido com sucesso!");
            JOptionPane.showMessageDialog(null, sql);///mostra o sql executado
            consulta.close();
            this.fechar(0);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: Não foi possivel excluir!\n" + e.getMessage());
        }
    }

    public void atualizar(String tabela, String chave, String valor, String query) {
        try {
            conexao = this.abrir(0);
            consulta = conexao.createStatement();
            //JOptionPane.showMessageDialog(null, query);
            String sql = "UPDATE " + tabela + " SET " + query + " WHERE " + chave + " = '" + valor + "';";
            consulta.execute(sql);
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
            JOptionPane.showMessageDialog(null, sql);///mostra o sql executado
            consulta.close();
            this.fechar(0);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: Não foi possivel atualizar!\n" + e.getMessage());
        }
    }

    public String consultar(String tabela, String chave, String valor, String campo) {
        String sql, retorno = "";
        sql = "SELECT " + campo + " FROM " + tabela + " WHERE " + chave + " = '" + valor + "'";
        try {
            conexao = this.abrir(0);
            consulta = conexao.createStatement();
            resultado = consulta.executeQuery(sql);
            if (resultado.next()) {
                retorno = (String) resultado.getString(campo);
            }
            JOptionPane.showMessageDialog(null, sql);///mostra o sql executado
            consulta.close();
            this.fechar(0);
        } catch (SQLException e) {
            System.out.println("Erro: Não foi possivel consultar!\n"+e.getMessage());
        }
        return retorno;
    }
    
    public ResultSet executar(String sql){
        conexao = this.abrir(1);
        System.out.println("SQL = " + sql + "\n\n");
        try {
            consulta = conexao.createStatement();
            resultado = consulta.executeQuery(sql);
            JOptionPane.showMessageDialog(null, sql);
        } catch (SQLException e) {
            System.out.println("Erro: Não foi possivel executar a query SQL!\n"+e.getMessage());
        }
        return resultado;
    }
    
    public int contar(String tabela, String campo, String query){
        int qtd = 0;            
        try {
            conexao = this.abrir(0);
            consulta = conexao.createStatement();
            resultado = consulta.executeQuery("SELECT COUNT("+campo+")FROM "+tabela+" WHERE "+query);
            JOptionPane.showMessageDialog(null, "SELECT COUNT("+campo+")FROM "+tabela+" WHERE "+query);
            resultado.first();
            qtd = this.resultado.getInt("COUNT("+campo+")");
        } catch (SQLException e) {
            System.out.println("Não foi possivel realizar a contagem!\n"+e.getMessage());
        }
         return qtd;
    }
    
        public int contar(String tabela){
        int qtd = 0;            
        try {
            conexao = this.abrir(0);
            consulta = conexao.createStatement();
            resultado = consulta.executeQuery("SELECT COUNT(*)FROM "+tabela);
            resultado.first();
            qtd = this.resultado.getInt("COUNT(*)");
        } catch (SQLException e) {
            System.out.println("Não foi possivel realizar a contagem!\n"+e.getMessage());
        }
         return qtd;
    }
        
       // public String primeiroEultimo(String tabela, String campo, String valor, int op){
        public String primeiroEultimo(String tabela, String campo, int op){
            String valor="";
            try {
                conexao = this.abrir(0);
                consulta = conexao.createStatement();
                if(op <=0){
                    resultado = consulta.executeQuery("SELECT MIN("+campo+") AS resultado FROM "+tabela);                    
                }else{
                    resultado = consulta.executeQuery("SELECT MAX("+campo+") AS resultado FROM "+tabela);
                }
                JOptionPane.showMessageDialog(null, "SELECT MIN("+campo+") AS resultado FROM "+tabela);
                if(resultado.next()){
                    valor = this.resultado.getString(1);
                }                
            } catch (SQLException e) {
                System.out.println("Não foi possivel realizar a pesquisar Firts/Last!\n"+e.getMessage());
            }            
            return valor;
        }
}
