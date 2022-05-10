package bankManagement.service;

import bankManagement.bean.customer;
/**
 * 
 * @author wangyihui
 *
 */
public class customerList{
	private customer[] cust;
	private int total;//顾客总人数
	
	public customerList(int total) {
		super();
		cust =new customer[total];
	}
	public boolean addCustomer(customer custh) {
		if(total>= cust.length) {
			return false;
		}
		cust[total++]=custh;
		return true;
	}
	public boolean replaceCustomer(customer custh,int index) {
		if(index<0||index>=total) { 
			return false;
		}
		cust[index]=custh;//替换地址 new一个新的customer
		return true;
	}
	public boolean delCustomer(int index) {
		if(index<0||index>=total) {
			return false;
		}
		for(int i=index;i<total-1;i++) {
			cust[i]=cust[i+1];
		}
		cust[--total]=null;
		return true;
 	}
	public customer[] getAllCustomer() {
		customer[] custs=new customer[total];
		for(int i=0;i<total;i++) {
			custs[i]=cust[i];
		}
		return custs;
  	}
	public customer getCustomer(int index) {
		if(index<0||index>=total) { 
			return null;
		}
		return cust[index];
	}
	public int getTotal() {
		return total; 
	}
}
