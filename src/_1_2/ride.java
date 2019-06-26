/*
ID: k.chris1
LANG: JAVA
TASK: ride
*/

package _1_2;

import java.util.*;
import java.io.*;


public class ride {

	static Scanner in;
	static PrintWriter out;
	static String inFile = "ride.in";
	static String outFile = "ride.out";
	static String comet;
	static String group;
	static int num = 1;
	static int num2 = 1;
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
	      
		comet =  in.nextLine();
		group = in.nextLine();
		
			}
	
	private static String solve() {
		//Process and Output
		
		for(int i = 0; i < comet.length();i++) {
			num = num * (comet.charAt(i) - 64);
			
		
		}
		
		for(int i = 0; i < group.length();i++) {
			num2 = num2 * (group.charAt(i) - 64);
		}
		//System.out.println(group +  " " + comet);
		if(num % 47 == num2 % 47) {
			result = "GO";
		}else {
			result = "STAY";
		}
		
		return result;
		
	}
	
	//Algorithm methods
//	private static int changes(String s){
//	
//	
//	}	
}

