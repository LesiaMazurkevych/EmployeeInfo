package TeamWork.EmployeeManipulation;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeDriver {

	private String name;
	private String position;
	private int salary;
	
	@JsonCreator
	public EmployeeDriver(@JsonProperty("name") String name,
						@JsonProperty("position") String position,
						@JsonProperty("salary") int salary){
		this.name=name;
		this.position=position;
		this.salary=salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
