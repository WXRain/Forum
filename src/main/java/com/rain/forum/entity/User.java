package com.rain.forum.entity;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

@Repository("User")
public class User implements Serializable {

	private int id;
	private String username;
	private String password;
	private String name;
	private int sex;
	private int exp;
	private int isManager;
	private int level;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getIsManager() {
		return isManager;
	}

	public void setIsManager(int isManager) {
		this.isManager = isManager;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", name=" + name + ", sex="
				+ sex + ", exp=" + exp + ", isManager=" + isManager + ", level=" + level + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public User(int id, String username, String password, String name, int sex, int exp, int isManager, int level) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.sex = sex;
		this.exp = exp;
		this.isManager = isManager;
		this.level = level;
	}

	public User() {
	}

}
