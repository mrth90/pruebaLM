package com.main.prueba.LM.utilites;

import java.util.Hashtable;
import java.util.Set;

public class UtilitiesMorse {

	public static Hashtable<String, String> obtainMorse() {
	    Hashtable<String, String> morseCode = new Hashtable<>();
	    morseCode.put("A", ".-");
	    morseCode.put("B", "-...");
	    morseCode.put("C", "-.-.");
	    morseCode.put("D", "-..");
	    morseCode.put("E", ".");
	    morseCode.put("F", "..-.");
	    morseCode.put("G", "--.");
	    morseCode.put("H", "....");
	    morseCode.put("I", "..");
	    morseCode.put("J", ".---");
	    morseCode.put("K", "-.-");
	    morseCode.put("L", ".-..");
	    morseCode.put("M", "--");
	    morseCode.put("N", "-.");	   
	    morseCode.put("O", "---");
	    morseCode.put("P", ".--.");
	    morseCode.put("Q", "--.-");
	    morseCode.put("R", ".-.");
	    morseCode.put("S", "...");
	    morseCode.put("T", "-");
	    morseCode.put("U", "..-");
	    morseCode.put("V", "...-");
	    morseCode.put("W", ".--");
	    morseCode.put("X", "-..-");
	    morseCode.put("Y", "-.--");
	    morseCode.put("Z", "--..");
	    return morseCode;
	}
	
	 public static String asciiAMorse(String ascii) {
	        Hashtable<String, String> morseCode = obtainMorse();
	        return morseCode.getOrDefault(ascii, "");
	    }

	    public static String morseAAscii(String morseSearch) {
	        Hashtable<String, String> morseCode = obtainMorse();
	        Set<String> values = morseCode.keySet();
	        
	        for (String value : values) {
	            String morse = morseCode.get(value);
	            if (morse.equals(morseSearch)) {
	                return value;
	            }
	        }
	        return "";
	    }

	    public static String codifiyMorse(String original) {
	        StringBuilder codify = new StringBuilder();
	        for (int i = 0; i < original.length(); i++) {
	            String orgitalUpperCase = String.valueOf(original.charAt(i)).toUpperCase();
	            String morseValue = asciiAMorse(orgitalUpperCase);
	            codify
	                    .append(morseValue)
	                    .append(" ");
	        }
	        return codify.toString();
	    }

	    public static String decodifyMorse(String codify) {
	        StringBuilder decodify = new StringBuilder();
	        String[] morse = codify.split(" ");
	        for (String morseActual : morse) {
	            String morseCode = morseAAscii(morseActual);
	            decodify.append(morseCode);
	        }
	        return decodify.toString();
	    }
}
