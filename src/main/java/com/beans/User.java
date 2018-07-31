package com.beans;

import com.baomidou.mybatisplus.annotations.TableLogic;
import com.baomidou.mybatisplus.annotations.TableName;

@TableName(value="user")
public class User {

	private Integer id;
	@TableLogic
	private Integer logic;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getLogic() {
		return logic;
	}
	public void setLogic(Integer logic) {
		this.logic = logic;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", logic=" + logic + ", name=" + name + "]";
	}
	
}
