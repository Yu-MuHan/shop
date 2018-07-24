package yjb.bean;

public class Category {
//	CID   NOT NULL VARCHAR2(32) 
//	CNAME          VARCHAR2(20)
	private String cid;
	private String name;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category(String cid, String name) {
		super();
		this.cid = cid;
		this.name = name;
	}
	public Category() {
		super();
	}
	
	
}
