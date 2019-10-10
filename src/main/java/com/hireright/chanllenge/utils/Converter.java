package com.hireright.chanllenge.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Converter {
    private static Logger logger = LoggerFactory.getLogger(Converter.class.getName());


    private static XmlMapper xmlMapper = new XmlMapper();
    private static ObjectMapper jsonMapper = new ObjectMapper();


    private static String objectToJson(Object input) {
        try {
            return jsonMapper.writeValueAsString(input);
        } catch (JsonProcessingException e) {
            logger.error("Error on convert to json.");
        }
        return null;
    }


    private static String objectToXml(Object input) {
        try {
            return xmlMapper.writeValueAsString(input);
        } catch (JsonProcessingException e) {
            logger.error("Error on convert to xml.");
        }
        return null;
    }

    public static String getConvertByType(ContentTypes contentTypes, Object object) {
        if (ContentTypes.XML.equals(contentTypes))
            return objectToXml(object);
        else
            return objectToJson(object);
    }
}
