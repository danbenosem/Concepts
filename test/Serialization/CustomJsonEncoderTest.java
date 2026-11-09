package Serialization;

import Serialization.Exception.JsonSerializationException;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomJsonEncoderTest {


    @Test
   public void testCanSerializeToJson  () throws JsonSerializationException {
        Product product = new Product();
        product.setName("iphone 20");
        product.setDescription("A london used");
        product.setPrice(new BigDecimal("200000.00"));
        product.setQuantity(100);


        String json = CustomJsonEncoder.serializeToJson(product);
        String expected= "{\"name\":\"iphone 20\",\"description\":\"A london used\",\"price\":200000.00,\"quantity\":100}";
        assertEquals(expected,json);
    }



    @Test
    public void testCanDeserializeFromJson()throws JsonSerializationException  {
        String json= "{\"name\":\"iphone\",\"description\":\"A london used\",\"price\":200000.00,\"quantity\":100}";
        Product product = CustomJsonEncoder.deserializeFromJson(json);

       Product expected= new Product();
       expected.setName("iphone");

       assertEquals(expected.getName(),product.getName());




    }

}
