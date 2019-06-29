/*
ID: k.chris1
LANG: JAVA
TASK: beads
*/
package _1_2;

import java.util.*;
import java.io.*;

public class beads {

	static Scanner in;
	static PrintWriter out;

	// Input Variables
	static String[] list;
	static int counter;
	static char color;
	static int max;
	static int N;
	static String b;

	public static void main(String[] args) {

		try {

			// Initialize in & out
			in = new Scanner(new File("beads.in"));
			out = new PrintWriter(new File("beads.out"));

			init();

			// Write out file
			out.print(solve());

			out.close();
			in.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void init() {
		// Get data
		// Initialize Input Variables

		N = Integer.parseInt(in.nextLine());
		b = in.nextLine();

	}

	private static String solve() {
		String result = "";
		int max = 0;
		b += b;
		for (int i = 0; i < b.length() / 2; i++) {
			int c = 1;

			char first = b.charAt(i);

			if (first == 'w') {

				c = Math.max(foundW('r', i), foundW('b', i));

			} else {
				c = foundW(first, i);
			}

			if (c > max) {
				max = c;
			}

		}
		result = Integer.toString(max) + "\n";

		return result;

	}

	// Algorithm methods
	private static int foundW(char color, int i) {
		int count = 1;
		int index = i + 1;
		boolean flag = false;

		while (count < b.length() / 2) {

			char current = b.charAt(index);

			if (!flag) {
				if (current == color || current == 'w') {
					count++;
				} else {
					flag = true;
					count++;
				}
			} else {
				if (current != color || current == 'w') {
					count++;
				} else {
					break;
				}
			}
			index++;

		}
		return count;

	}

}