package co.edu.uco.grades.dto;

import co.edu.uco.crosscutting.util.text.UtilText;

public class Student_DTO {
	private int id;
	private String name;
	private IdTypeDTO IdType;
	private String IdNumber;
	private String email;
	
	

	public Student_DTO(int id, String name, IdTypeDTO idType, String idNumber, String email) {
		super();
		
		setIdNumber(UtilText.EMPTY);
		setIdType(new IdTypeDTO());
		setName(UtilText.EMPTY);
		IdType = idType;
		IdNumber = idNumber;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IdTypeDTO getIdType() {
		return IdType;
	}

	public void setIdType(IdTypeDTO idType) {
		IdType = idType;
	}

	public String getIdNumber() {
		return IdNumber;
	}

	public void setIdNumber(String idNumber) {
		IdNumber = idNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = UtilText.getDefault(email);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	

}
