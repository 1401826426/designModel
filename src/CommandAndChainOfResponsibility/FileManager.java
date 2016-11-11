package CommandAndChainOfResponsibility;

public class FileManager {

	public static String ls() {
		return "file1\nfile2\nfile3\n";
	}
	
	public static String ls_l(){
		String str = "drw-rw-rwe root system 1024 2009-8-20 10:23 file1\n" +
					"drw-rw-rwe root system 1024 2009-8-20 10:23 file2\n" + 
					"drw-rw-rwe root system 1024 2009-8-20 10:23 file3\n"  ; 
		return str ; 
	}
	
	
	public static String ls_a(){
		return ".\n..\nfile1\nfile2\nfile3\n" ; 
	}

}
