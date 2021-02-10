package com.main.prueba.LM.services;

import com.main.prueba.LM.utilites.UtilitiesBinary;
import com.main.prueba.LM.utilites.UtilitiesMorse;

public class TranslateServiceImpl implements ITranslateService{

//	@Override
//	public String traducir(String texto, String formatoOrigen, String formatoDestino) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public String translateMorse(String text) {
		
		return UtilitiesMorse.codifiyMorse(text);
	}

	@Override
	public String translateBinary(String text) {
		// TODO Auto-generated method stub
		return UtilitiesBinary.codifiyBinary(text);
	}

	@Override
	public String translateBinaryText(String text) {
		// TODO Auto-generated method stub
		return UtilitiesBinary.decodifyBinary(text);
	}

	@Override
	public String translateMorseText(String text) {
		// TODO Auto-generated method stub
		return UtilitiesMorse.decodifyMorse(text);
	}	
		

}
