package org.jboss.weld.examples.translator;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.inject.Inject;

public class TextTranslator implements Serializable
{ 
   private SentenceParser sentenceParser; 
   
   //@EJB Translator translator;
   //@Inject Translator translator;
   @EJB Translator2 translator2;
   
   @Inject
   public TextTranslator(SentenceParser sentenceParser) 
   { 
      this.sentenceParser = sentenceParser;  
   }
   
   public String translate(String text) 
   { 
      StringBuilder sb = new StringBuilder(); 
      for (String sentence: sentenceParser.parse(text)) 
      { 
         sb.append(translator2.translate(sentence)).append(". "); 
      } 
      return sb.toString().trim(); 
   }
   
   public String translate2(String text) 
   { 
      StringBuilder sb = new StringBuilder(); 
      for (String sentence: sentenceParser.parse(text)) 
      { 
         sb.append(translator2.translate2(sentence)).append(". "); 
      } 
      return sb.toString().trim(); 
   }
   
}