package com.practise.examples;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class JsonSimpleReadExample {
	public static void main(String[] args) {
       int count =0;
        JSONParser parser = new JSONParser();
        String line = null;
        ArrayList<JSONObject> json=new ArrayList<JSONObject>();
        JSONObject obj1;
        try {

          /*  Object obj = parser.parse(new FileReader("D:\\testjson.txt"));

            JSONObject jsonObject = (JSONObject) obj;
            System.out.println(jsonObject);

            String name = (String) jsonObject.get("_id");
            System.out.println(name);
            
            JSONObject address = (JSONObject) jsonObject.get("addresses");
            System.out.println(address);
            JSONObject postalad = (JSONObject) address.get("postal");
            System.out.println(postalad);*/
        	
        	
        	/*Scanner scan = new Scanner(new File("D:\\LocationListCASReport12Mar2018.txt"));
        	while(scan.hasNext()){
        	   System.out.println(scan.nextLine());
        	}
        	scan.close()*/;
        	
        	File file = new File("D:\\LocationListCASReport17April2018.txt");

        	BufferedReader bufferedReader  = new BufferedReader(
        	    new InputStreamReader(new FileInputStream(file)));
        	

        /*	line = bufRdr.readLine();

            FileReader fileReader = new FileReader("D:\\testjson.txt");

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);
*/
            while((line = bufferedReader.readLine()) != null) {
            	
            	JSONObject jsonObject = (JSONObject)  new JSONParser().parse(line);
                String name = (String) jsonObject.get("_id");
                //System.out.println("_id:"+name);
                
                JSONObject address = (JSONObject) jsonObject.get("addresses");
                JSONObject postalad = (JSONObject) address.get("postal");
                writeToFile("_id:"+name+","+"postal_address:"+postalad);
               // System.out.println(postalad);
               // System.out.println(++count);  //state city street postal 
                
            }
            // Always close files.
            bufferedReader.close();    

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
	
	public static void writeToFile(String text) {
		try {
			/*BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
					"D:/processed.txt"), true));*/
			
			FileOutputStream outputStream = new FileOutputStream("D:/processed.txt",true);
            OutputStreamWriter bw = new OutputStreamWriter(outputStream, "UTF-16");
            
			bw.write(text);
			
			//bw.newLine();
			bw.close();
		} catch (Exception e) {
		}
	}
}
