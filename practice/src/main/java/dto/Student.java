package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private String std_name;
	private String std_email;
	private int mob_no;
	private String date;
	private String country;
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
	public String getStd_email() {
		return std_email;
	}
	public void setStd_email(String std_email) {
		this.std_email = std_email;
	}
	public int getMob_no() {
		return mob_no;
	}
	public void setMob_no(int mob_no) {
		this.mob_no = mob_no;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}


}
