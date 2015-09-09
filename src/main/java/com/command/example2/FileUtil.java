package com.command.example2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileUtil {
	
	public static void writeCommands(ArrayList<Command> commands){
		try {
			FileOutputStream fileOut = new FileOutputStream("/home/zc/config.log");
			ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
			
			objOut.writeObject(commands);
			objOut.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static ArrayList<Command> readCommands(){
		try {
			FileInputStream	fileIn = new FileInputStream("/home/zc/config.log");
			ObjectInputStream objIn = new ObjectInputStream(fileIn);
			
			ArrayList<Command> commands = (ArrayList<Command>) objIn.readObject();
			objIn.close();
			
			return commands;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
