package com.model2.mvc.service.domain;


import java.sql.Date;



public class Purchase {
	
	private int tranNo;
	private Product purchaseProd;
	private User buyer;
	private String paymentOption;
	private String receiverName;
	private String receiverPhone;
	private String divyAddr;
	private String divyRequest;
	private String tranCode;
	private Date orderDate;
	private String divyDate;
	
	public Purchase(){}
	
	public void setBuyer(User buyer) {this.buyer = buyer;}
	public void setDivyAddr(String divyAddr) {this.divyAddr = divyAddr;}
	public void setDivyDate(String divyDate) {this.divyDate = divyDate;}
	public void setDivyRequest(String divyRequest) {this.divyRequest = divyRequest;}
	public void setOrderDate(Date orderDate) {this.orderDate = orderDate;}
	public void setPaymentOption(String paymentOption) {this.paymentOption = paymentOption;}
	public void setPurchaseProd(Product purchaseProd) {this.purchaseProd = purchaseProd;}
	public void setReceiverName(String receiverName) {this.receiverName = receiverName;}
	public void setReceiverPhone(String receiverPhone) {this.receiverPhone = receiverPhone;}
	public void setTranCode(String tranCode) {this.tranCode = tranCode;}
	public void setTranNo(int tranNo) {this.tranNo = tranNo;}
		
	public User getBuyer() {return buyer;}
	public String getDivyAddr() {return divyAddr;}
	public String getDivyDate() {return divyDate;}
	public String getDivyRequest() {return divyRequest;}
	public Date getOrderDate() {return orderDate;}
	public String getPaymentOption() {return paymentOption;}
	public Product getPurchaseProd() {return purchaseProd;}
	public String getReceiverName() {return receiverName;}
	public String getReceiverPhone() {return receiverPhone;}
	public String getTranCode() {return tranCode;}
	public int getTranNo() {return tranNo;}
	@Override
	public String toString() {
		return "PurchaseVO [buyer=" + buyer + ", divyAddr=" + divyAddr
				+ ", divyDate=" + divyDate + ", divyRequest=" + divyRequest
				+ ", orderDate=" + orderDate + ", paymentOption="
				+ paymentOption + ", purchaseProd=" + purchaseProd
				+ ", receiverName=" + receiverName + ", receiverPhone="
				+ receiverPhone + ", tranCode=" + tranCode + ", tranNo="
				+ tranNo + "]";
	}
}