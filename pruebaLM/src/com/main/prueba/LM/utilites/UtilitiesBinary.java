package com.main.prueba.LM.utilites;

import java.util.Hashtable;
import java.util.Set;

public class UtilitiesBinary {

	public static Hashtable<String, String> obtainBinary() {
	    Hashtable<String, String> binaryCode = new Hashtable<>();
	    binaryCode.put("A", "01000001");
	    binaryCode.put("B", "01000010");
	    binaryCode.put("C", "01000011");
	    binaryCode.put("D", "01000100");
	    binaryCode.put("E", "01000101");
	    binaryCode.put("F", "01000110");
	    binaryCode.put("G", "01000111");
	    binaryCode.put("H", "01001000");
	    binaryCode.put("I", "01001001");
	    binaryCode.put("J", "01001010");
	    binaryCode.put("K", "01001011");
	    binaryCode.put("L", "01001100");
	    binaryCode.put("M", "01001101");
	    binaryCode.put("N", "01001110");	   
	    binaryCode.put("O", "01001111");
	    binaryCode.put("P", "01010000");
	    binaryCode.put("Q", "01010001");
	    binaryCode.put("R", "01010010");
	    binaryCode.put("S", "01010011");
	    binaryCode.put("T", "01010100");
	    binaryCode.put("U", "01010101");
	    binaryCode.put("V", "01010110");
	    binaryCode.put("W", "01010111");
	    binaryCode.put("X", "01011000");
	    binaryCode.put("Y", "01011001");
	    binaryCode.put("Z", "01011010");
	    return binaryCode;
	}

	 public static String binaryText(String ascii) {
	        Hashtable<String, String> binaryText = obtainBinary();
	        return binaryText.getOrDefault(ascii, "");
	    }

	    public static String textBinary(String binarySearch) {
	        Hashtable<String, String> binaryText = obtainBinary();
	        Set<String> values = binaryText.keySet();
	        
	        for (String value : values) {
	            String morse = binaryText.get(value);
	            if (morse.equals(binarySearch)) {
	                return value;
	            }
	        }
	        return "";
	    }

	    public static String codifiyBinary(String original) {
	        StringBuilder codify = new StringBuilder();
	        for (int i = 0; i < original.length(); i++) {
	            String orgitalUpperCase = String.valueOf(original.charAt(i)).toUpperCase();
	            String binaryValue = textBinary(orgitalUpperCase);
	            codify
	                    .append(binaryValue)
	                    .append(" ");
	        }
	        return codify.toString();
	    }

	    public static String decodifyBinary(String codify) {
	        StringBuilder decodify = new StringBuilder();
	        String[] binaryT = codify.split(" ");
	        for (String binaryActual : binaryT) {
	            String binaryCode = binaryText(binaryActual);
	            decodify.append(binaryCode);
	        }
	        return decodify.toString();
	    }
}
