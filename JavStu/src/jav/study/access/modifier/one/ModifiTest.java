package jav.study.access.modifier.one;

public class ModifiTest {
	public static void main(String[] args) {
		//Samepackage //diff class //same folder
		Class6 cls6 = new Class6();
//		cls6.name1 = "Henv"; //Error;
		cls6.setName1("Henv");//phai thong qua setter, getter de truy cap
		cls6.name2 = "";
		cls6.name3= "";
		cls6.defaultMethod();
		
		//sampackage// diff class
		Class5 cls5 = new Class5();
//		cls5.name1 = "";//private none access --err!!!
		cls5.name2 = "";//default
		cls5.name3 = "";//protected
		
	}
}