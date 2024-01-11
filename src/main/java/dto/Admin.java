package dto;

public class Admin 
{
	private int adminid;
	private String adminname;
	private long admincontact;
	private String adminemail;
	private String adminpassword;
	
	public int getAdminid() 
	{
		return adminid;
	}
	public String getAdminname()
	{
		return adminname;
	}
	public long getAdmincontact() 
	{
		return admincontact;
	}
	public String getAdminemail() 
	{
		return adminemail;
	}
	public String getAdminpassword() 
	{
		return adminpassword;
	}
	
	
	public void setAdminid(int adminid)
	{
		this.adminid = adminid;
	}
	public void setAdminname(String adminname) 
	{
		this.adminname = adminname;
	}
	public void setAdmincontact(long admincontact)
	{
		this.admincontact = admincontact;
	}
	public void setAdminemail(String adminemail) 
	{
		this.adminemail = adminemail;
	}
	public void setAdminpassword(String adminpassword) 
	{
		this.adminpassword = adminpassword;
	}
}
