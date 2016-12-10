package decorator;

import java.io.IOException;

public class Father{
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		SchoolReport sr = new FourthGradeSchoolReport() ; 
		sr = new HignScoreDecorator(sr) ; 
		sr = new SortDecorator(sr) ; 
		sr.report();  
		sr.sign("ÀÏÈý");
	}
}
