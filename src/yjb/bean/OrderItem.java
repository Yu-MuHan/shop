package yjb.bean;

public class OrderItem {
//	ITEMID   NOT NULL VARCHAR2(32) 
//	QUANTITY          NUMBER(11)   
//	TOTAL             NUMBER(8,2)  
//	PID               VARCHAR2(32) 
//	OID               VARCHAR2(32)
	private String itemId;
	private int quantity;
	private double total;
	private String pid;
	private String oid;
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public OrderItem(String itemId, int quantity, double total, String pid, String oid) {
		super();
		this.itemId = itemId;
		this.quantity = quantity;
		this.total = total;
		this.pid = pid;
		this.oid = oid;
	}
	public OrderItem() {
		super();
	}
	
	
	
}
