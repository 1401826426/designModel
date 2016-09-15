package decorator;

public class Father{
	
	public static void main(String[] args) {
		
		SchoolReport sr = new FuthGradeSchoolReport() ; 
		sr = new HignScoreDecorator(sr) ; 
		sr = new SortDecorator(sr) ; 
		sr.report(); 
		sr.sign("ÀÏÈý");
	}
}
