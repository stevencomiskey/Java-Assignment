/* 
 *  Search Engine 
 *  Author: Steven Comiskey
 *  File Manager Class
 */
package com.test.searchengine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class FileManager 
{

	static int count = 0;      // set count to 0

	public static String Search(String query) throws IOException
	{
		String s;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = query;
		File f1 = new File("C:/NewTextDocument.txt");  // open file
		String[] line=null;


		FileReader file = new FileReader(f1);
		BufferedReader f = new BufferedReader(file);

		//  While loop will run until there are no more words 
		count =0;
		while((s=f.readLine())!=null)
		{
			line=s.split(" ");  //Split the word using space
			for (String word : line) 
			{
				if (word.equals(input))   //see if users word is in file
				{
					count++;    //increment count
				}
			}
		}
		if(count!=0)  //Check count is not equal zero
		{
			String return1 = input +" was found "+count+ " times";
			file.close();
			return return1;
		}
		else
		{
			String return1 = input + " was not found";       // word not found
			file.close();
			return return1;
		}


	}
} 	
