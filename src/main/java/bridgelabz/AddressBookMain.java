package bridgelabz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AddressBookMain {

	public static void main(String[] args) {
		
		try {
            ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            InputStream inputStream = new FileInputStream(new File("D:\\Development\\Eclipse_Workspace\\jsonpractice\\src\\main\\java\\bridgelabz\\AddressBook.json"));
            TypeReference<List<AddressBook>> typeReference = new TypeReference<List<AddressBook>>() {};
            List<AddressBook> address = mapper.readValue(inputStream, typeReference);
			for (AddressBook a : address) {
				System.out.println(a.getId() +", "+ a.getFirstName() +", "+ a.getLastName() +", "+ a.getAddress() +", "+ a.getCity() +", "+
			                       a.getState() +", "+ a.getZipNo() +", "+ a.getMobileNo() +", "+ a.getEmailId());
			}
		} catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
				
				
				
				
			

