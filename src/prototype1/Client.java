package prototype1;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
	private static final int MAX_COUNT = 10 ; 
	
	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newCachedThreadPool() ; 
		AdvTemplate advTemplate = new AdvTemplate("Ԫ�������,�����", "Ԫ�������") ; 
		Mail mail = new Mail(advTemplate) ; 
		mail.setTail("��Ȩ����");
		for(int i = 0;i < MAX_COUNT ; i++){
			final Mail sendMail = mail.clone() ; 
			Random random = new Random() ; 
			sendMail.setReceiver((1000000000 +  random.nextInt(1000000000)) + "@163.com");
			Callable<Boolean> task = new Callable<Boolean>(){
				public Boolean call(){
					return sendMail(sendMail) ; 
				}
			} ; 
			executor.submit(task) ; 
		}
		
		
	}
	
	
	
	public  static boolean sendMail(Mail mail){
		String s = "Reciever:" + mail.getReceiver() + "     Subject:" + 
                	mail.getSubject() + "               Context:" + mail.getContext() + 
                	"                   " ;
		boolean result = new Random().nextBoolean() ; 
		if(result){
			s += "���ͳɹ�" ; 
		}else{
			s += "����ʧ��" ; 
		}
		System.out.println(s);
		return result ; 
	}
	
	

	
	
}
