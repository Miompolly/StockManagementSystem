package com.UserReg;

public class Stock {
	String itemname,suppliername,desc;
	int qty;
	
	public Stock() {
		super();
	}
	public Stock(String itemname, String suppliername, String desc, int qty) {
		super();
		this.itemname = itemname;
		this.suppliername = suppliername;
		this.desc = desc;
		this.qty = qty;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getSuppliername() {
		return suppliername;
	}
	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
}
