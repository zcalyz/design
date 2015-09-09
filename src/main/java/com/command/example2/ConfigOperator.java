package com.command.example2;

import java.io.Serializable;

public class ConfigOperator implements Serializable{
	public void insert(String args){
		System.out.println("插入参数");
	}
	
	public void modify(String args){
		System.out.println("修改参数");
	}
	
	public void delete(String args){
		System.out.println("删除参数");
	}
}
