import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem {
	
	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();
		
		Statement stm = connection.createStatement();
		stm.execute("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
		
		ResultSet rst = stm.getResultSet();
		
		while(rst.next()) {
			Integer id = rst.getInt("ID");
			String nome = rst.getString("NOME");
			String descricao = rst.getString("DESCRICAO");
			System.out.println(id);
			System.out.println(nome);
			System.out.println(descricao);
		}
		
		connection.close();
		
	}

}
