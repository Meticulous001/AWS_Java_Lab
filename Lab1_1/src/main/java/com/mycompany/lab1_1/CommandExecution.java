package com.mycompany.lab1_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CommandExecution {
	public static void main(String[] args) {
		String COMMAND = "cmd.exe /c ";
		String command = "dir";
	    Process process = null;
	    
		if(command != ""){
            command = COMMAND + command;
            try {
                process = Runtime.getRuntime().exec(command);

                // Get input streams
                BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream(), "windows-1251"));
                BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream(), "windows-1251"));

                // Read command standard output


                String str, all_lines = "";
           //for(int count =0; count < loop; count++){
                System.out.println("Standard output: ");
                while ((str = stdInput.readLine()) != null) {
                    all_lines += str+"\n";
                }

                System.out.println(all_lines);
//                prt.println(all_lines);
               
                // Read command errors
               
            } catch (Exception e) {
                e.printStackTrace(System.err);
            }
        }
	}
}
