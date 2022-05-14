package co.edu.uco.grades.data.dao.azuresql;
import co.edu.uco.grades.dto.Student_DTO;

import java.sql.Connection;

import co.edu.grades.data.dao.StudentDAO;
import co.edu.grades.data.dao.connection.ConnectionSQL;

public class StudentAzureSqlDAO extends ConnectionSQL implements StudentDAO{

	protected StudentAzureSqlDAO(Connection connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	public static StudentDAO build(Connection connection) {
		return new StudentAzureSqlDAO(connection);
	}
	@Override
	public void create(Student_DTO student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Student_DTO student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void find(Student_DTO student) {
		// TODO Auto-generated method stub
		
	}

	
}

