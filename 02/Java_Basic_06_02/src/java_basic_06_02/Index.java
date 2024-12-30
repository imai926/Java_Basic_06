package java_basic_06_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Index {
	public static void main(String[] args) {
		String filePath = "C:/Users/IMAJIN/Documents/Java_Basic/06/2_確認問題/02/Text.txt";
		String reversefile = "C:/Users/IMAJIN/Documents/Java_Basic/06/2_確認問題/02/reverseText.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(filePath));
			 BufferedWriter bw = new BufferedWriter(new FileWriter(reversefile)))	{
			
	            String line;
	            ArrayList <String>lines=new java.util.ArrayList<>();
	            
	            while ((line = br.readLine()) != null) {
	            	lines.add(line);
	            }
	            
	            //ソート前
	            System.out.println("ソート前:");
	            for (String text : lines) {
	                System.out.print(text + "\n");
	            }
	                        
	            //文字列の頭文字のアルファベット順にソート
	            Collections.sort(lines);
	            System.out.println("文字列の頭文字のアルファベット順にソート:");
	            for (String text : lines) {
	                System.out.print(text + "\n");
	            }
	            
	           System.out.println("\nファイルに書き込みます\n");
	           for(int num = 0; lines.size() > num; num++){
	        	   	  StringBuilder sb = new StringBuilder(lines.get(num));	 
	          		  String dst = sb.reverse().toString();
			
	          		  bw.write(dst + "\n");
	          		  System.out.println("反転後の" + (num + 1) + "行目の文字列： " + dst);
	            	}
	           System.out.println("\nファイルに書き込み完了");
	            
	        	}catch (IOException e) {
	            e.printStackTrace();
	        }
		}
	}