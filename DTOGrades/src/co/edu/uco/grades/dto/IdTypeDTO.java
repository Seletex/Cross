package co.edu.uco.grades.dto;

import co.edu.uco.crosscutting.util.text.UtilText;

public class IdTypeDTO {
	
	private int id;
	private String name;
	
	public IdTypeDTO() {
		super();
	}
	
	public IdTypeDTO(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = UtilText.trim(name);
	}

}
