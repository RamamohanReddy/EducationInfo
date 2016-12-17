/**
 * 
 */
package com.educationinfo.common.dto;

import java.util.Date;

/**
 * @author Admin
 *
 */
public class UserDto {

	private long id;

	private String name;
	
	private String userName;

	private String password;

	private long college;

	private String operatedBy;

	private Date createdDate;

	private Date updatedDate;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getCollege() {
		return college;
	}

	public void setCollege(long college) {
		this.college = college;
	}

	public String getOperatedBy() {
		return operatedBy;
	}

	public void setOperatedBy(String operatedBy) {
		this.operatedBy = operatedBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "UserDto [id=" + id + ", name=" + name + ", userName=" + userName + ", password=" + password
				+ ", college=" + college + ", operatedBy=" + operatedBy + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + "]";
	}
}
