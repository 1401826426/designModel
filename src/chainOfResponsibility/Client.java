package chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client {
	
	public static void main(String[] args) {
		List<IWomen> womens = new ArrayList<IWomen>() ; 
        Random rand = new Random() ; 
        String request = "我要出去逛街" ; 
        for(int i = 0 ;i < 5;i++){
        	IWomen women = new Women(rand.nextInt(4) , request) ; 
        	womens.add(women) ; 
        }
        Son son  =  new Son() ; 
        Husband husband = new Husband() ; 
        husband.setNext(son);
        Handler father = new Father() ; 
        father.setNext(husband);
        
        for(IWomen women:womens){
        	father.handleMessage(women);
        }
	}
}



















