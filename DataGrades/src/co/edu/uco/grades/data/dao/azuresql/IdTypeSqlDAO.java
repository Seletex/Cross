package co.edu.uco.grades.data.dao.azuresql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import co.edu.grades.data.dao.connection.ConnectionSQL;
import co.edu.uco.grades.crosscuting.exception.GradesException;
import co.edu.uco.grades.dto.IdTypeDTO;
import co.edu.grades.data.dao.IdTypeDAO;
import co.edu.grades.data.dao.StudentDAO;


public class IdTypeSqlDAO  extends ConnectionSQL implements IdTypeDAO {
	protected IdTypeSqlDAO(Connection connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	public static StudentDAO build(Connection connection) {
		return new StudentAzureSqlDAO(connection);
	}
	public void create(IdTypeSqlDAO idType) {
		String sql = "Insert Into IdType(name) VALUES (?)";
		
		try(PreparedStatement preparedStatement = getConnection().prepareStatement(sql)){
			preparedStatement.setString(1, IdType.getName());
			preparedStatement.executeUpdate();
		}catch (SQLException exception)	{
			throw GradesException.buildTechnicalDataException("hay un problema con la creacion de IdTypeSQLServer");
		}catch(Exception exception) {
			throw GradesException.buildTechnicalDataException("Error inesperado");
		}
	}

	public void update(IdTypeDTO idType) {
		// TODO Auto-generated method stub
		
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	public void find(IdTypeSqlDAO idType) {
		// TODO Auto-generated method stub
		
	}
}
