package es.aad.MorenoSanchez_unidad2_p1.ejercicio1.competition_utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Json
{

    private static ObjectMapper mapper;

    public static ObjectMapper mapper()
    {
        if(Json.mapper == null)
        {
            Json.mapper = Json.createJson();
        }

        return Json.mapper;
    }

    private static ObjectMapper createJson() {
        final ObjectMapper mapper = new ObjectMapper();

        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, true);
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);
        return mapper;
    }

}
