package co.edu.uco.grdes.data.factory.azuresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import co.edu.grades.data.dao.StudentDAO;
import co.edu.uco.corsscuting.util.sql.UtilConnection;
import co.edu.uco.crosscutting.util.object.UtilObject;
import co.edu.uco.grades.crosscuting.exception.GradesException;
import co.edu.uco.grades.crosscuting.exeption.enumeration.ExceptionLocation;
import co.edu.uco.grades.crosscuting.exeption.enumeration.ExeptionType;
import co.edu.uco.grades.data.dao.azuresql.StudentAzureSqlDAO;
import co.edu.uco.grades.dto.Student_DTO;
import co.edu.uco.grdes.data.factory.DAOFactory;
import co.edu.uco.corsscuting.util.sql.UtilConnection;

public class AzuresqlDAOFactory extends DAOFactory {
	
	private Connection connection;
	
	private void AzureSqlDAOFactory() {
		openConnection();
	}
	protected void OpenConnection(){
		if(UtilConnection.isOpen(connection)) {
			throw GradesException.buildTechnicalException("No es posible la que la coneccion este abierta"	);
		}
		
    String stringConnection = "jdbc:sqlserver://academic-database-server.database.windows.net:1433;database=academic-db;user=academicDmlUser;password=4c4d3m1cDmlUs3r;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30";
	try {
    	connection = DriverManager.getConnection(stringConnection);
	}catch (SQLException excepcion) {
		throw GradesException.buildTechnicalException("No fue posible", stringConnection, excepcion, null, null);
	}catch(Exception exception) {
		throw GradesException.buildTechnicalException("Imposible", stringConnection, exception, null, null);
	}
	}
	protected Connection getConnection() {
		return connection;
	}
    	
	

	@Override
	public void commit() {
		if(UtilConnection.isClosed(connection)) {
			throw GradesException.buildTechnicalException("No es posible confirmar la transaccionporque la conexion esta cerrada", null, null, ExeptionType.TECHNICAL, null);
		}
		
	}

	@Override
	public void rollback() {
		if(UtilConnection.isClosed(connection)) {
			throw GradesException.buildTechnicalException("Es ");
		}
		try
		{
			if(getConnection().getAutoCommit()) {
				throw GradesException.buildTechnicalException("No es posible confirmar la transaccionporque la conexion esta cerrada", null, null, ExeptionType.TECHNICAL, null);
			}
			getConnection().rollback();
		}catch(GradesException exception) {
			throw exception;
		}catch (SQLException exception) {
			GradesException.buildTechnicalException("No es posible confirmar la transaccionporque la conexion esta cerrada", null, null, ExeptionType.TECHNICAL, null);
		}catch (Exception exception) {
			GradesException.buildTechnicalException("No es posible confirmar la transaccionporque la conexion esta cerrada", null, null, ExeptionType.TECHNICAL, null);
		}
		
	}

	@Override
	protected void openConnection() {
		if(!UtilObject.getUtilObject().isNull(connection)
			&& !UtilConnection.isClosed(connection)){
				//podemos abrir una conexion
			
				throw GradesException.buildTechnicalExeption("it's not possible open a connection because it's alredy is open");
			}
		
	}

	@Override
	public void closeConection() {
		if(UtilConnection.isClosed(connection)) {
			throw GradesException.buildTechnicalException("Es ", null, null, ExeptionType.TECHNICAL, null);
		}
		try {
			getConnection().close();
	    	
		}catch (SQLException excepcion) {
			throw GradesException.buildTechnicalException("No fue posible", null, excepcion, ExeptionType.TECHNICAL, null);
		}catch(Exception exception) {
			throw GradesException.buildTechnicalException("Imposible", null, exception, ExeptionType.TECHNICAL, null);
		}
		
	}


public  boolean isOpen() {
	return !UtilConnection.isClosed(connection);
}
@Override
public void init() {
	// TODO Auto-generated method stub
	
}
@Override
public void cleseConection() {
	// TODO Auto-generated method stub
	
}
@Override
public void getConection() {
	// TODO Auto-generated method stub
	
}
@Override
public StudentDAO getStudentDAO() {
	// TODO Auto-generated method stub
	return StudentAzureSqlDAO.create(connection);
}
	
}
