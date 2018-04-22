package com.devluff.cms.module.member.model;

public class Member {
	
	private String member_id;
	private String member_pw;
	private String member_pw_confirm;
	private String member_pw_original;
	
	private String member_name;
	private String member_nickname;
	private String member_email;
	
	private String member_role;
	
	private String reg_id;
	private String reg_name;
	private String reg_nickname;
	private String reg_date;
	
	private String mod_id;
	private String mod_name;
	private String mod_nickname;
	private String mod_date;
	
	private String del_yn;

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getMember_pw() {
		return member_pw;
	}

	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}

	public String getMember_pw_confirm() {
		return member_pw_confirm;
	}

	public void setMember_pw_confirm(String member_pw_confirm) {
		this.member_pw_confirm = member_pw_confirm;
	}

	public String getMember_pw_original() {
		return member_pw_original;
	}

	public void setMember_pw_original(String member_pw_original) {
		this.member_pw_original = member_pw_original;
	}

	public String getMember_name() {
		return member_name;
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}

	public String getMember_nickname() {
		return member_nickname;
	}

	public void setMember_nickname(String member_nickname) {
		this.member_nickname = member_nickname;
	}

	public String getMember_email() {
		return member_email;
	}

	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}

	public String getMember_role() {
		return member_role;
	}

	public void setMember_role(String member_role) {
		this.member_role = member_role;
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
