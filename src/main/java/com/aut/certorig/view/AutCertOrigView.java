package com.aut.certorig.view;

import com.aut.certorig.main.AutCertOrig;

public class AutCertOrigView {
	
	String nitKN;
	String tipoDoc;
	String usern;
	String pwdn;
	
	public AutCertOrigView() {
		nitKN = "800039996";
		tipoDoc = "Cédula de Ciudadanía";
		usern = "80088447";
		pwdn = "Ignaci0";
		new AutCertOrig(nitKN, tipoDoc, usern, pwdn);
	}

	public static void main(String[] args) {
		new AutCertOrigView();
	}

}
