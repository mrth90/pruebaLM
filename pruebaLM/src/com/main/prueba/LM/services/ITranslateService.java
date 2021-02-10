package com.main.prueba.LM.services;

public interface ITranslateService {

//	public String traducir(String texto, String formatoOrigen, String formatoDestino);
	
	public String translateMorse(String text);
	public String translateBinary(String text);
	public String translateBinaryText(String text);
	public String translateMorseText(String text);
}
