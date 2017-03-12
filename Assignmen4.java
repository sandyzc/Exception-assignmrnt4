package com.exeption.assignment4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Scanner;

public class Assignmen4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// access the file
		java.io.File file = new java.io.File("c:\\users\\manjula\\desktop\\xyz.txt");

		// read the file using scanner class
		Scanner input = new Scanner(file);
		String fileContent = "";

		// Concat into a string
		while (input.hasNext()) {
			fileContent += input.next() + " ";
		}

		input.close();

		// create an char array of string
		char[] charArr = fileContent.toCharArray();
		int counter = 0;
		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] == 'a' || charArr[i] == 'e' || charArr[i] == 'i' || charArr[i] == 'o' || charArr[i] == 'u')
				counter++;
		}
		String output = "No. of vowels in the string are " + counter;
		System.out.println(output);
	

	try(

	Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("c:\\users\\manjula\\desktop\\xy22z.txt"))))
	{
		writer.write(output);
	}

}
}
