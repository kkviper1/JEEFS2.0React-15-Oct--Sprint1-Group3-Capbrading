package com.cg.capbrading.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
/**
 * This Employee Component is used as a data traveler object from layer to layer
 * 
 * @author Sushma
 *
 */
public class Employee extends Account {
	/**
	 * Phone Number of the Employee
	 */
	@Column
	private String empPhone;
	/**
	 * Email Id of the Employee
	 */
	@Column
	private String empEmail;
	/**
	 * Location of the Employee
	 */
	@Column
	private String empLocation;
	/**
	 * 
	 * @return Employee Phone Number
	 */
	public String getEmpPhone() {
		return empPhone;
	}
	/**
	 * 
	 * @param empPhone, set to empPhone
	 */
	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}
	/**
	 * 
	 * @return Employee Email Id
	 */
	public String getEmpEmail() {
		return empEmail;
	}
	/**
	 * 
	 * @param empEmail, set to empEmail
	 */
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	/**
	 * 
	 * @return Location of employee
	 */
	public String getEmpLocation() {
		return empLocation;
	}
	/**
	 * 
	 * @param empLocation, Set to empLocation
	 */
	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
	

public Employee(int id, String name, String password, String empPhone, String empEmail, String empLocation) {
		super(id, name, password);
		this.empPhone = empPhone;
		this.empEmail = empEmail;
		this.empLocation = empLocation;
	}
@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((empEmail == null) ? 0 : empEmail.hashCode());
	result = prime * result + ((empLocation == null) ? 0 : empLocation.hashCode());
	result = prime * result + ((empPhone == null) ? 0 : empPhone.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (empEmail == null) {
		if (other.empEmail != null)
			return false;
	} else if (!empEmail.equals(other.empEmail))
		return false;
	if (empLocation == null) {
		if (other.empLocation != null)
			return false;
	} else if (!empLocation.equals(other.empLocation))
		return false;
	if (empPhone == null) {
		if (other.empPhone != null)
			return false;
	} else if (!empPhone.equals(other.empPhone))
		return false;
	return true;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", empPhone=" + empPhone + ", empEmail=" + empEmail
			+ ", empLocation=" + empLocation + "]";
}

}


