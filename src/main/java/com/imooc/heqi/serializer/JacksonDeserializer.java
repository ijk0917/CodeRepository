package com.imooc.heqi.serializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Created by David.Zheng05 on 2017/9/20.
 */
@Component
public class JacksonDeserializer {

    private static final Logger logger = LoggerFactory.getLogger(JacksonDeserializer.class);

    @Autowired
    protected ObjectMapper mapper;


    public <T> T deserialize(String jsonStr, Class<T> clazz) {
        T retValue = null;
        if (mapper != null) {
            try {
                retValue = mapper.readValue(jsonStr, clazz);
            } catch (IOException ex) {
                if (logger.isErrorEnabled()) {
                    logger.error("parse football order info!", ex);
                }
            }
        }
        return retValue;
    }


}
