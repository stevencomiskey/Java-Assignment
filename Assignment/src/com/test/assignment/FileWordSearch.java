package com.test.assignment;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileWordSearch 
{
   public static void FileWordSearch(String fileName,String query) throws IOException
   {
      //File f1=new File(fileName); //Creation of File Descriptor for input file
      String[] words=null;  //Intialize the word Array
      String s;     
      int count=0;   //Intialize the word to zero

      BufferedReader reader;//Found a code example of buffer reader online
      try {
    	  reader = new BufferedReader(new FileReader(fileName));
    	  String line = reader.readLine();
    	  while (line != null) 
    	  {
    		  line = reader.readLine();
    		  words=line.split(" ");  //Split the word using space
              for (String word : words) 
              {
                     if (word.equals(query))   //Search for the given word
                     {
                       count++;    //If Present increase the count by one
                     }
              }

    	  }

    	  reader.close();

      } catch (IOException e) {

    	  System.out.println("Failed to read");

    	  e.printStackTrace();

      }
      if(count!=0)  //Check for count not equal to zero
      {
         System.out.println("The given word is present for "+count+ " Times in the file:"+ fileName);
      }
      else
      {
         //System.out.println("The given word is not present in the file:");
      }
      
        // fr.close();
   }


}