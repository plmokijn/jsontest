package jsontest;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class json {

	public static void main(String[] args) {
		String str = "[{'NO':1,'NAME':'APPLE','KOR':'사과','PRICE':'1000'},{'NO':2,'NAME':'BANANA','KOR':'바나나','PRICE':'500'},{'NO':3,'NAME':'MELON','KOR':'메론','PRICE':'2000'}]";

		JsonParser jsonParser = new JsonParser();
		JsonArray jsonArray = (JsonArray) jsonParser.parse(str);
		strprint(jsonArray);
		
//		for (int i = 0; i < jsonArray.size(); i++) {
//			JsonObject object = (JsonObject) jsonArray.get(i);
//			String NO = object.get("NO").getAsString();
//			String NAME = object.get("NAME").getAsString();
//			String KOR = object.get("KOR").getAsString();
//			String PRICE = object.get("PRICE").getAsString();
//
//			System.out.println(NO);
//			System.out.println(NAME);
//			System.out.println(KOR);
//			System.out.println(PRICE);
//			System.out.println();
//		}
		
		String str1 = "{'fruit':[{'NO':1,'NAME':'APPLE','KOR':'사과','PRICE':'1000'},"
				+ " 			{'NO':2,'NAME':'BANANA','KOR':'바나나','PRICE':'500'},"
				+ "				{'NO':3,'NAME':'MELON','KOR':'메론','PRICE':'2000'}], "
				+ "		'animal':[{'NO':1,'NAME':'cat','KOR':'고양이','age':'3'}, "
  				+ "       	 	{'NO':2,'NAME':'dog','KOR':'개','age':'5'}, "
  				+ "       		{'NO':3,'NAME':'rabbit','KOR':'토끼','age':'2'}]}";
		
		JsonParser Parser = new JsonParser();
		JsonObject jsonObj = (JsonObject) Parser.parse(str1);
		strprint1(jsonObj, "fruit");
		strprint1(jsonObj, "animal");
		
		
//		JsonArray memberArray = (JsonArray) jsonObj.get("fruit");
//		System.out.println("=========fruit=========");          
//		for (int i = 0; i < memberArray.size(); i++) {          
//			JsonObject object = (JsonObject) memberArray.get(i);
//			System.out.println("번호 : " + object.get("NO"));     
//			System.out.println("영어 : " + object.get("NAME"));   
//			System.out.println("한글 : " + object.get("KOR"));    
//			System.out.println("가격 : " + object.get("PRICE"));  
//			System.out.println("------------------------");     
//		}                                                       
//		                                                        
//		memberArray = (JsonArray) jsonObj.get("animal");        
//		System.out.println("=========animal=========");         
//		for (int i = 0; i < memberArray.size(); i++) {          
//			JsonObject object = (JsonObject) memberArray.get(i);
//			System.out.println("번호 : " + object.get("NO"));     
//			System.out.println("영어 : " + object.get("NAME"));   
//			System.out.println("한글 : " + object.get("KOR"));    
//			System.out.println("나이 : " + object.get("age"));    
//			System.out.println("------------------------");     
//		}
		
	}
	
	public static void strprint(JsonArray jsonArray) {
		for (int i = 0; i < jsonArray.size(); i++) {
			JsonObject object = (JsonObject) jsonArray.get(i);
			String NO = object.get("NO").getAsString();
			String NAME = object.get("NAME").getAsString();
			String KOR = object.get("KOR").getAsString();
			String PRICE = object.get("PRICE").getAsString();

			System.out.println(NO);
			System.out.println(NAME);
			System.out.println(KOR);
			System.out.println(PRICE);
			System.out.println();
		}
	}
	
	public static void strprint1(JsonObject jsonObj, String value) {
		JsonArray memberArray = (JsonArray) jsonObj.get(value);
		System.out.println("========="+ value +"=========");         
		for (int i = 0; i < memberArray.size(); i++) {          
			JsonObject object = (JsonObject) memberArray.get(i);
			System.out.println("번호 : " + object.get("NO"));     
			System.out.println("영어 : " + object.get("NAME"));   
			System.out.println("한글 : " + object.get("KOR"));    
			System.out.println("나이 : " + object.get("age"));    
			System.out.println("------------------------"); 
		}
	}

}
