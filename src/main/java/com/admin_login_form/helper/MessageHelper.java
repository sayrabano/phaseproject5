package com.admin_login_form.helper;



//Helper class for message------->
public class MessageHelper {
	private String content;
	private String type;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public MessageHelper() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MessageHelper(String content, String type) {
		super();
		this.content = content;
		this.type = type;
	}
	
	
	

}
