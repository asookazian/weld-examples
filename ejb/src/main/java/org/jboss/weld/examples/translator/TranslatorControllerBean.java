package org.jboss.weld.examples.translator;

import javax.ejb.Remove;
import javax.ejb.Stateful;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Event;
import javax.enterprise.inject.Any;
import javax.inject.Inject;
import javax.inject.Named;

@Stateful
@RequestScoped
@Named("translator")
public class TranslatorControllerBean implements TranslatorController
{
   
   @Inject
   private TextTranslator translator;
   
   @Inject @Any Event<Document> documentEvent;
   
   @Inject Document document;
   
   private String inputText;
   
   private String translatedText;
   
   public String getText()
   {
      return inputText;
   }
   
   public void setText(String text)
   {
      this.inputText = text;
   }
   
   public void translate()
   {
      translatedText = translator.translate(inputText);
      documentEvent.fire(document);
      
   }
   
   public void translate2()
   {
      translatedText = translator.translate2(inputText);
      documentEvent.fire(document);
   }
   
   public String getTranslatedText()
   {
      return translatedText;
   }
   
   @Remove
   public void remove()
   {
      
   }
   
}
