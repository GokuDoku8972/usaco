import java.util.*;
import java.io.*;
public class inout {
	public static void main(String[] args)throws IOException {
		
//		Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("inout.in"));
		PrintWriter out = new PrintWriter(new File("inout.out"));
		
		long startTime = System.currentTimeMillis();
		
		for(int i = 0; i < 30000;i++) {
			
			String[] temp = in.nextLine().split(" ");
			
			for(int j = 0; j < temp.length;j++) {
				out.print(temp[j] + " ");
			}
			out.println("");
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	
		in.close();
		out.close();
		
		BufferedReader in2 = new BufferedReader(new FileReader("inout.in"));
        
		PrintWriter out2 = new PrintWriter(new BufferedWriter(new FileWriter("inout.out")));
		
	    
		
		startTime = System.currentTimeMillis();
		
		for(int i = 0; i < 30000;i++) {
			
			StringTokenizer st = new StringTokenizer(in2.readLine());
		//	String[] temp = in.nextLine().split(" ");
			
			for(int j = 0; j < 5;j++) {
				out2.print(st.nextToken() + " ");
			}

			out.println("");
		}
		
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		
		
		StringBuilder sb = new StringBuilder();
		BufferedReader in3 = new BufferedReader(new FileReader("inout.in"));
		PrintWriter out3 = new PrintWriter(new BufferedWriter(new FileWriter("inout.out")));
		startTime = System.currentTimeMillis();
		for(int i = 0; i < 3000;i++) {	
			StringTokenizer st = new StringTokenizer(in3.readLine());
			for(int j = 0; j < 5; j++) {
				
				sb.append(st.nextToken() + " " );
				
			}
			sb.append("\n");
		}
	
	out3.print(sb);
	endTime = System.currentTimeMillis();
	
	System.out.println(endTime - startTime);
	
	in3.close();
	out3.close();
	
}
}
