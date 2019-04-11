package com.test.searchengine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileManager 
{

	static int count = 0;

	public static String Search(String query) throws IOException
	{
		String s;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = query;
		File f1 = new File("C:/TextFiles/NewTextDocument.txt");

		String[] line=null;


		FileReader file = new FileReader(f1);
		BufferedReader f = new BufferedReader(file);

		//  While loop which will run for as long as BufferedReader object can find content
		count =0;
		while((s=f.readLine())!=null)
		{
			line=s.split(" ");  //Split the word using space
			for (String word : line) 
			{
				if (word.equals(input))   //Search for the given word
				{
					count++;    //If Present count is incremented
				}
			}
		}
		if(count!=0)  //Check for count not equal to zero
		{
			String return1 = "The word "+input+" was found "+count+ " times";
			file.close();
			return return1;
		}
		else
		{
			String return1 = input + " was not found";
			file.close();
			return return1;
		}


	}
} 	
