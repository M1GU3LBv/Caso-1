package pe.edu.upeu.clase01.entity;

import java.io.Serializable;
import java.sql.Blob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data 
@AllArgsConstructor 
@NoArgsConstructor
public class Suppliers implements Serializable{
	
	
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String company;
	private String last_nanme;
	private String first_name;
	private String email_addres;
	private String job_title;
	private String bussines_phone;
	private String home_phone;
	private String mobile_phone;
	private String fax_number;
	private String address;
	private String city;
	private String state_province;
	private String zip_postal;
	private String country_region;
	private String web_page;
	private String notes;
	private String attachments;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getLast_nanme() {
		return last_nanme;
	}
	public void setLast_nanme(String last_nanme) {
		this.last_nanme = last_nanme;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getEmail_addres() {
		return email_addres;
	}
	public void setEmail_addres(String email_addres) {
		this.email_addres = email_addres;
	}
	public String getJob_title() {
		return job_title;
	}
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	public String getBussines_phone() {
		return bussines_phone;
	}
	public void setBussines_phone(String bussines_phone) {
		this.bussines_phone = bussines_phone;
	}
	public String getHome_phone() {
		return home_phone;
	}
	public void setHome_phone(String home_phone) {
		this.home_phone = home_phone;
	}
	public String getMobile_phone() {
		return mobile_phone;
	}
	public void setMobile_phone(String mobile_phone) {
		this.mobile_phone = mobile_phone;
	}
	public String getFax_number() {
		return fax_number;
	}
	public void setFax_number(String fax_number) {
		this.fax_number = fax_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState_province() {
		return state_province;
	}
	public void setState_province(String state_province) {
		this.state_province = state_province;
	}
	public String getZip_postal() {
		return zip_postal;
	}
	public void setZip_postal(String zip_postal) {
		this.zip_postal = zip_postal;
	}
	public String getCountry_region() {
		return country_region;
	}
	public void setCountry_region(String country_region) {
		this.country_region = country_region;
	}
	public String getWeb_page() {
		return web_page;
	}
	public void setWeb_page(String web_page) {
		this.web_page = web_page;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getAttachments() {
		return attachments;
	}
	public void setAttachments(String attachments) {
		this.attachments = attachments;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
		
	}


