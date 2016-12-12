package com.java.cor;

import java.util.Random;

import com.java.cor.handler.PriceHandler;
import com.java.cor.handler.PriceHandlerFactory;

/*
 * �ͻ��������ۿ�
 */
public class Customer {
	
	private PriceHandler priceHandler;
	
	public void setPriceHandler(PriceHandler priceHandler) {
		this.priceHandler = priceHandler;
	}

	public void requestDiscount(float discount){
		priceHandler.processDiscount(discount);
	}
	
	
	public static void main(String[] args){
		Customer customer = new Customer();
		customer.setPriceHandler(PriceHandlerFactory.createPriceHandler());
		
		Random rand = new Random();
		
		for(int i=1;i<=20;i++){
			System.out.print(i+":");
			customer.requestDiscount(rand.nextFloat());
		}
		
		
	}
	

}
