package com.driver;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.builder.QueryBuilder;

public class DriverProgram {

	public static void main(String[] args) {

		// For testing
		QueryBuilder qb = new QueryBuilder();
		qb.bool().mustMatch("item", "milk").shouldMatch("company", "dodla").shouldMatch("item_type", "dairy").bool().shouldMatch("company", "popular").mustMatch("item", "bread");
		//qb.bool().mustMatch("item", "milk").shouldMatch("opo", "ppplll").bool();
		objToJson(qb);

	}

	public static void objToJson(QueryBuilder user) {
		ObjectMapper mapper = new ObjectMapper();

		try {
			// Convert object to JSON string and save into file directly
			// mapper.writeValue(new File("D:\\user.json"), user);

			// Convert object to JSON string
			String jsonInString = mapper.writeValueAsString(user);
			// System.out.println(jsonInString);

			// Convert object to JSON string and pretty print
			jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
			System.out.println(jsonInString);

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
