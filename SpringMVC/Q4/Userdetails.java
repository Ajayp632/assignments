package com.collection4;

public class Userdetails 
{
	String usname,uspwd,usmail;
	public Userdetails() {}
	
	public Userdetails(String usname, String uspwd, String usmail) {
		super();
		this.usname = usname;
		this.uspwd = uspwd;
		this.usmail = usmail;
	}

	public String getUsname() {
		return usname;
	}

	public void setUsname(String usname) {
		this.usname = usname;
	}

	public String getUspwd() {
		return uspwd;
	}

	public void setUspwd(String uspwd) {
		this.uspwd = uspwd;
	}

	public String getUsmail() {
		return usmail;
	}

	public void setUsmail(String usmail) {
		this.usmail = usmail;
	}

}