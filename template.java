/*
ID: k.chris1
LANG: JAVA
TASK: gift1
*/

import java.util.*;
import java.io.*;


public class template {

	static Scanner in;
	static PintWriter out;
	static String inFile = "xxx.in";
	static String outFile = "xxx.out";
	
	static String result;
	static String[] list;
	
	public static void main(String[] args) {
		
		try {
			
			//Initialize in & out
			in = new Scanner(new File(inFile));
			out = new PrintWriter(new File(outFile));
			
			init();
			result = solve();
			
			//write out file
			out.println(result);
			
			out.close();
			in.close();
						
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private static void init() {
		//Get data
		//Initalize Input Varibles
		
	}
	
	private static String solve() {
		//Process and Output
		
		return result;
		
	}
	
	//Algorithm methods
//	private static int changes(String s){
//	
//	
//	}	
	}
}
