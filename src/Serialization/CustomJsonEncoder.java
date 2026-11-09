package Serialization;

import Serialization.Exception.JsonSerializationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CustomJsonEncoder {
    public static String serializeToJson(Product product) throws JsonSerializationException {
        try{

            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(product);

        }catch(JsonProcessingException e){
            throw new JsonSerializationException(e.getMessage());
        }
    }

    public static Product deserializeFromJson(String json) throws JsonSerializationException {

        try{
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, Product.class);

    } catch (JsonProcessingException e){
            throw new JsonSerializationException(e.getMessage());
        }
    }
}
