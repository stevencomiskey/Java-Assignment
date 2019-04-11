package com.test.assignment;

import java.io.File;
import java.io.IOException;

public class FileManager 
{
	public String[] textfiles;

	public FileManager() throws IOException
	{



		File dir = new File("C:\\TextFiles");            // open folder
		textfiles = dir.list();
		FileWordSearch fws = new FileWordSearch(null, null);
		String query = "qwerty";

		if (textfiles == null) 
		{
			System.out.println( "No text files");
		} 
		else
		{ 
			for (int i = 0; i< textfiles.length; i++)    // list contents of folder
			{
				System.out.println(textfiles[i]);
				textfiles[i] = "C:\\TextFiles\\" +textfiles[i];
				fws.FileWordSearch(textfiles[i], query);
			}
		}
	}
}
