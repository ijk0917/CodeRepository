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
public class JacksonSerializer {

    private static final Logger logger = LoggerFactory.getLogger(JacksonSerializer.class);

    @Autowired
    private ObjectMapper mapper;


    public String serialize(Object obj) {
        String retValue = null;
        if (mapper != null) {
            try {
                retValue = mapper.writeValueAsString(obj);
            } catch (IOException ex) {
                if (logger.isErrorEnabled()) {
                    logger.error("parse football order info!", ex);
                }
            }
        }
        return retValue;
    }


}