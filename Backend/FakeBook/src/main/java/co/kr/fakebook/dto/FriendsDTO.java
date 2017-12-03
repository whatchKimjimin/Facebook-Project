package co.kr.fakebook.dto;

import java.sql.Date;

public class FriendsDTO {
	private int id;
	private int User_id;
	private int Friends_id;
	private int Agree;
	private Date created;
	private Date AgreeDate;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser_id() {
		return User_id;
	}
	public void setUser_id(int user_id) {
		User_id = user_id;
	}
	public int getFriends_id() {
		return Friends_id;
	}
	public void setFriends_id(int friends_id) {
		Friends_id = friends_id;
	}
	public int getAgree() {
		return Agree;
	}
	public void setAgree(int agree) {
		Agree = agree;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getAgreeDate() {
		return AgreeDate;
	}
	public void setAgreeDate(Date agreeDate) {
		AgreeDate = agreeDate;
	}
	
	
}
