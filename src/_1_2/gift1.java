/*
ID: k.chris1
LANG: JAVA
TASK: gift1
*/

package _1_2;
	
import java.util.*;
import java.io.*;
	

public class gift1 {

	static Scanner in;
	static PrintWriter out;

	//static String[] names;
	//static int[] balance;
	static int n;
//	static int temp2;
//	static String input;
//	static int give;
//	
//	static String[] list;
	static Map<String, Integer> bank = new LinkedHashMap<String, Integer>();
	
	public static void main(String[] args) {
		
		try {
			
			//Initialize in & out
			in = new Scanner(new File("gift1.in"));
			out = new PrintWriter(new File("gift1.out"));
			
			init();
			
			//write out file
			out.print(solve());
			
			out.close();
			in.close();
						
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private static void init() {
		//Get data
		//Initalize Input Varibles
		
		n = Integer.parseInt(in.nextLine());
		for(int i = 0; i < n;i++) {
			bank.put(in.nextLine(), 0);
		}
		//System.out.println(bank);
		
	}
	
	private static String solve() {
		//Process and Output
		
		

		
		for(int i = 0; i < n;i++) {
			String name = in.nextLine();
			String input[] = in.nextLine().split(" ");
			int money =  Integer.parseInt(input[0]);
			int give = Integer.parseInt(input[1]);
			
			if(give != 0) {
				int gift=money/give;
				int rem=money%give;
				bank.put(name,bank.get(name)-money+rem);
			
				for(int k = 0; k < give;k++) {
					name = in.nextLine();
					bank.put(name,gift + bank.get(name));
				}
			}
			
		}
		//System.out.println(bank);
		String result="";
		for(String s:bank.keySet()) {
			result += s + " " + bank.get(s) + "\n";
		}
		
		return result;
		
	}
	
	//Algorithm methods
//	private static int changes(String s){
//	
//	
//	}	
	
}

