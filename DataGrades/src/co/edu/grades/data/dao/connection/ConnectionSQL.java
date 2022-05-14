package co.edu.grades.data.dao.connection;

import java.sql.Connection;

import co.edu.uco.corsscuting.util.sql.UtilConnection;
import co.edu.uco.grades.crosscuting.exception.GradesException;

public class ConnectionSQL {

	private Connection connection;
	
	protected ConnectionSQL(Connection connection) {
		if(UtilConnection.isClosed(connection)) {
			throw GradesException.buildTechnicalException("No es posible crear la especificacion DAO por que la conexion esta cerrada");
		}
		setConnection(connection);
	}

	protected Connection getConnection() {
		return connection;
	}

	private void setConnection(Connection connection) {
		this.connection = connection;
	}
	

}
