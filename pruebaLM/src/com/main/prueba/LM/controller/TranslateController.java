package com.main.prueba.LM.controller;

import com.main.prueba.LM.services.ITranslateService;

public class TranslateController  {


	private ITranslateService translateService;
	
	
	
	public TranslateController(ITranslateService translateService) {
		
		this.translateService = translateService;
	}



	public String translateInput(String text, String fromFormat, String toFormat) {
		
		String translated=""; 
		
		switch(fromFormat.toLowerCase()) {
		
		case "text":
			if(toFormat.toLowerCase()== "binary") {
				translated = translateService.translateBinary(text);	
			} else if(toFormat.toLowerCase()== "morse"){
				translated = translateService.translateMorse(text);
			}			
			break;
		case "binary": 
			if(toFormat.toLowerCase()== "text") {
				translated = translateService.translateBinaryText(text);	
			} else if(toFormat.toLowerCase()== "morse"){
				translated = translateService.translateBinaryText(text);
				translated = translateService.translateMorse(translated);
			}			
			break;
		case "morse": 
			if(toFormat.toLowerCase()== "text") {
				translated = translateService.translateMorseText(text);	
			} else if(toFormat.toLowerCase()== "binary"){
				translated = translateService.translateMorseText(text);
				translated = translateService.translateBinary(translated);
			}			
			break;
		default: 
			translated = "Error in the format, the translation doesn't exists";
			break;
		}
		
		return translated;
	}
		
}
