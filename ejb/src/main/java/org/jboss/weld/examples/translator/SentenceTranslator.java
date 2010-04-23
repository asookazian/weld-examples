package org.jboss.weld.examples.translator;

import javax.ejb.Stateless;

@Stateless
//public class SentenceTranslator implements Translator 
public class SentenceTranslator implements Translator2
{ 
   
   public String translate(String sentence) 
   { 
      return "Lorem ipsum dolor sit amet"; 
	   //return "arbi";
   }
   
   public String translate2(String sentence) 
   { 
      //return "Lorem ipsum dolor sit amet"; 
	   return "arbi";
   }
   
}