package com.practise.examples;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class FilterBusinessLocationAddressField {
	public static void main(String[] args) {
		int count = 0;
		try {

			Scanner scan = new Scanner(new File("D:\\LocationListCASReport31Jan2018.txt"));
			while (scan.hasNext()) {
				JSONObject jsonObject = (JSONObject) new JSONParser()
				.parse(scan.nextLine());
				String name = (String) jsonObject.get("_id");
				System.out.println(name);

				JSONObject address = (JSONObject) jsonObject.get("addresses");
				JSONObject postalad = (JSONObject) address.get("postal");
				String state = null;
				String city = null;
				String town = null;
				String street = null;
				String postalcode = null;
				if (postalad != null) {
					state = (String) ((String) postalad.get("state") != null ? postalad
							.get("state") : null);
					city = (String) ((String) postalad.get("city") != null ? postalad
							.get("city") : null);
					town = (String) ((String) postalad.get("town") != null ? postalad
							.get("town") : null);
					street = (String) ((String) postalad.get("street") != null ? postalad
							.get("street") : null);
					postalcode = (String) ((String) postalad.get("zipcode") != null ? postalad
							.get("zipcode") : null);
				}
				writeToFile("_id:" + name + "," + "state:" + state + ","
						+ "city:" + city + ","+ "town:" + town + "," + "street:" + street + ","
						+ "postalcode:" + postalcode);
				++count;
			}
			scan.close();
			System.out.println("No of businesslocations processed :"+count); 
			System.out.println("Done");	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 catch (ParseException e) {
			e.printStackTrace();
		}

	}

	public static void writeToFile(String text) {
		try {
			FileOutputStream outputStream = new FileOutputStream(
					"D:/processed.txt", true);
			OutputStreamWriter bw = new OutputStreamWriter(outputStream,
					"UTF-8");
			PrintWriter pw = new PrintWriter(bw);
			pw.write(text);
			pw.println();
			pw.close();
			bw.close();
		} catch (Exception e) {
		}
	}
}
