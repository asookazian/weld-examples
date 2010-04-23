package org.jboss.weld.examples.translator;

import javax.ejb.Local;

@Local 
public interface Translator2
{ 

   public String translate(String sentence);
   
   public String translate2(String sentence); 
   
}