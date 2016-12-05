package TeamWork.EmployeeManipulation;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.core.JsonParseException;

public class Main {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		InputStream input = new FileInputStream("Employee.json");
		ObjectMapper objectMapper = new ObjectMapper();
		TypeFactory typeFactory = TypeFactory.defaultInstance();
		List<User> person = objectMapper.readValue(input,typeFactory.constructCollectionType(ArrayList.class, User.class));

}
}