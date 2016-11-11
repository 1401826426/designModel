package CommandAndChainOfResponsibility;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class ClassUtils {

	public static List<Class> getSonClass(Class<? extends CommandName> abstractClass) {
		List<Class> returnClassList = new ArrayList<Class>() ; 
		String packageName = abstractClass.getPackage().getName(); 
		List<Class> packClasses = getSonClass(packageName) ; 
		for(Class c:packClasses){
			if(abstractClass.isAssignableFrom(c)  && !abstractClass.equals(c)){
				returnClassList.add(c) ; 
			}
		}
		return returnClassList;
	}

	private static List<Class> getSonClass(String packageName) {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader() ; 
		String path = packageName.replace(".", "/") ; 
		Enumeration<URL> resources = null ; 
		try {
			resources = classLoader.getResources(path) ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		List<File> dirs = new ArrayList<File>() ; 
		while(resources.hasMoreElements()){
			URL resource = resources.nextElement() ; 
			dirs.add(new File(resource.getFile())) ; 
		}
		
		return null;
	}

}





















