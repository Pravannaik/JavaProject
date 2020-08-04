package com.danyon.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.danyon.bean.*;

@RestController
public class MainController {
	
	@PostMapping(path = "/analyze")
	public DataResponse getDataResponse(@RequestBody Text text){
		
		List arrList = new ArrayList();
		int spaceCount = 0;
		int wrdcount = 0;
		
		if(text.getText().isEmpty()){
			int space = 0;                    
			int nspace = 0 - spaceCount;      
			return new DataResponse(new TextLength(space,nspace), 0, arrList);
		}else{
			
			String[] wrdCount = text.getText().split(" ");
			String[] arrData = text.getText().split("");
			
			//for sorting letter
			for(int i=0; i<arrData.length; i++){
				for(int j=0; j<arrData.length-1; j++){
					if(arrData[j].compareToIgnoreCase(arrData[j+1]) > 0){
						String temp = arrData[j];
						arrData[j] = arrData[j+1];
						arrData[j+1] = temp;
					}
				}
			}
			
			//to count number of letter occurrence 
			for(int i=0; i<arrData.length; i++){
				Map<String,Integer> dict = new HashMap<String,Integer>();  //print hashmap as list
				int charCount = 0;
				if(!arrData[i].equals(" ")){
					char[] c = arrData[i].toCharArray();
					if(Character.isAlphabetic(c[0])){                //condition to check alphabets
						for(int j=0; j<arrData.length; j++){
					
							if(arrData[i].equals(arrData[j]) && !arrData[i].equals(" ")){
								charCount += 1;
							}
						}
						dict.put(arrData[i].toLowerCase(), charCount);
						if(!arrList.contains(dict)){
							arrList.add(dict);  //add hashmap into arraylist
						}
					}else{
						charCount += 1;
					}
				}else{
					spaceCount += 1;
				}
			}
			int space = arrData.length;                     //length of data with space 
			int nspace = arrData.length - spaceCount;      //length of data without space
			for(String w : wrdCount){
				if(!w.isEmpty()){
					wrdcount += 1;
				}
			}
			return new DataResponse(new TextLength(space,nspace), wrdcount, arrList);
		}
	}
}
