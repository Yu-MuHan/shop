package yjb.bean;

public class Order {
//	OID       NOT NULL VARCHAR2(32) 
//	ORDERTIME          DATE         
//	TOTAL              NUMBER(8,2)  
//	STATE              NUMBER(11)   
//	ADDRESS            VARCHAR2(30) 
//	NAME               VARCHAR2(20) 
//	TELEPHONE          VARCHAR2(20) 
//	UUID               VARCHAR2(32)
	private String oid;
	private String ordertime;
	private double  total;
	private int state;
	private String address;
	private String name;
	private String telephone;
	private String uuid;
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public String getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(String ordertime) {
		this.ordertime = ordertime;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public Order(String oid, String ordertime, double total, int state, String address, String name, String telephone,
			String uuid) {
		super();
		this.oid = oid;
		this.ordertime = ordertime;
		this.total = total;
		this.state = state;
		this.address = address;
		this.name = name;
		this.telephone = telephone;
		this.uuid = uuid;
	}
	public Order() {
		super();
	}
	
	
}
