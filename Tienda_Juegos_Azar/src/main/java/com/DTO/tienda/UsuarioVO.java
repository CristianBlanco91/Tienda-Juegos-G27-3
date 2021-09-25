package com.DTO.tienda;
//VO objeto de vista
public class UsuarioVO {
	
	private int Cedu;
	private String Name;
	private String User;
	private String Pass;
	private String Mail;
	
	public int getCedu() {
		return Cedu;
	}
	public void setCedu(int cedu) {
		Cedu = cedu;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getUser() {
		return User;
	}
	public void setUser(String user) {
		User = user;
	}
	public String getPass() {
		return Pass;
	}
	public void setPass(String pass) {
		Pass = pass;
	}
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		Mail = mail;
	}
	

}
