package co.kr.fakebook.dto;

import java.sql.Date;

public class LikesDTO {
	private int id;
	private Date created;
	private int TimeLine_id;
	private int User_id;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public int getTimeLine_id() {
		return TimeLine_id;
	}
	public void setTimeLine_id(int timeLine_id) {
		TimeLine_id = timeLine_id;
	}
	public int getUser_id() {
		return User_id;
	}
	public void setUser_id(int user_id) {
		User_id = user_id;
	}
	
	
}
