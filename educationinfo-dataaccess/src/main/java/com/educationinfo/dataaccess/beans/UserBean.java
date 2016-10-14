/**
 * 
 */
package com.educationinfo.dataaccess.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author Admin
 *
 */
@Entity
@Table(name = "user_info")
@NamedQueries({
	@NamedQuery(name = "getUserById", query = "SELECT u FROM UserBean u WHERE u.id = :id")

})
public class UserBean {

	@Id
	@GeneratedValue
	@Column(name = "U_ID")
	private long id;

	@Column(name = "U_NAME")
	private String name;

	@Column(name = "U_PASSWORD")
	private String password;

	@Column(name = "U_COLLEGE")
	private long college;

	@Column(name = "U_OPERATED_BY")
	private String operatedBy;

	@Column(name = "U_CREATED_DATE")
	private Date createdDate;

	@Column(name = "U_UPDATED_DATE")
	private Date updatedDate;

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
}
