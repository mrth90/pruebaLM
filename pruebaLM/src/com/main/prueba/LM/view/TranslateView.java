package com.main.prueba.LM.view;

import com.main.prueba.LM.controller.TranslateController;

public class TranslateView {

	private TranslateController translateController;
	
	public String translate() {
		
		String text ="texto";
		String fromFormat = "text";
		String toFormat = "binary";
		
		return translateController.translateInput(text, fromFormat, toFormat);
		
	}

}
