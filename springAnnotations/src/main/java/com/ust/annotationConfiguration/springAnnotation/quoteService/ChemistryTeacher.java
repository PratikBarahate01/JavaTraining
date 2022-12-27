package com.ust.annotationConfiguration.springAnnotation.quoteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChemistryTeacher implements Teacher {

	private QuoteService quoteService;

	@Autowired
	public ChemistryTeacher(QuoteService quoteService) {
		this.quoteService = quoteService;
	}

	public String getDailyHomework() {
		return "Revise thermodyamics";

	}

	public String getDailyQuote() {
		return quoteService.getQuote();
	}

}
