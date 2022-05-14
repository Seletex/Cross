package co.edu.uco.grdes.data.factory;

import co.edu.grades.data.dao.IdTypeDAO;
import co.edu.grades.data.dao.StudentDAO;
import co.edu.uco.grades.dto.Student_DTO;
import java.sql.Connection;
public abstract class DAOFactory {
	
	public static DAOFactory getDaoFactory(){
		return null;
	}
	
	
	protected abstract void commit();
	public abstract void init();
	protected abstract void rollback();
	protected abstract void openConnection();
	public abstract void cleseConection();
	public abstract void getConection();
	public abstract StudentDAO getStudentDAO();
	public abstract IdTypeDAO getIdTypeDAO();


	public void closeConection() {
		// TODO Auto-generated method stub
		
	}

}
