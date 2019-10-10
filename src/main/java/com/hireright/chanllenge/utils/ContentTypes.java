package com.hireright.chanllenge.utils;

public enum ContentTypes {
    XML,JSON;
   public static ContentTypes getType(String contentType){
       if( Constants.XML_CONTENT_TYPE.equals(contentType)  )
           return XML;
       return JSON;
   }
}
