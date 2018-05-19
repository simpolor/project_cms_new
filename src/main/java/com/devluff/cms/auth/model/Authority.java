package com.devluff.cms.auth.model;

public class Authority {
	
	private int role_seq;
	private String role_name;
	private String role_code;
	
	private String reg_id;
	private String reg_name;
	private String reg_nickname;
	private String reg_date;
	
	private String mod_id;
	private String mod_name;
	private String mod_nickname;
	private String mod_date;
	
	private String del_yn;

	public int getRole_seq() {
		return role_seq;
	}

	public void setRole_seq(int role_seq) {
		this.role_seq = role_seq;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public String getRole_code() {
		return role_code;
	}

	public void setRole_code(String role_code) {
		this.role_code = role_code;
	}

	public String getReg_id() {
		return reg_id;
	}

	public void setReg_id(String reg_id) {
		this.reg_id = reg_id;
	}

	public String getReg_name() {
		return reg_name;
	}

	public void setReg_name(String reg_name) {
		this.reg_name = reg_name;
	}

	public String getReg_nickname() {
		return reg_nickname;
	}

	public void setReg_nickname(String reg_nickname) {
		this.reg_nickname = reg_nickname;
	}

	public String getReg_date() {
		return reg_date;
	}

	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}

	public String getMod_id() {
		return mod_id;
	}

	public void setMod_id(String mod_id) {
		this.mod_id = mod_id;
	}

	public String getMod_name() {
		return mod_name;
	}

	public void setMod_name(String mod_name) {
		this.mod_name = mod_name;
	}

	public String getMod_nickname() {
		return mod_nickname;
	}

	public void setMod_nickname(String mod_nickname) {
		this.mod_nickname = mod_nickname;
	}

	public String getMod_date() {
		return mod_date;
	}

	public void setMod_date(String mod_date) {
		this.mod_date = mod_date;
	}

	public String getDel_yn() {
		return del_yn;
	}

	public void setDel_yn(String del_yn) {
		this.del_yn = del_yn;
	}
	
}
