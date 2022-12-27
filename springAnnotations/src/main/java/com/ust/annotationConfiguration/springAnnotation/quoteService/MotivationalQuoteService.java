package com.ust.annotationConfiguration.springAnnotation.quoteService;

import org.springframework.stereotype.Component;

@Component
public class MotivationalQuoteService implements QuoteService{
	
	  public String getQuote() {
	    return "Don't settle for average...";
	  }
}
