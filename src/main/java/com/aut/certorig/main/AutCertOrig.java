package com.aut.certorig.main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AutCertOrig extends AutCertOrigSetup {
	
	public AutCertOrig() {
	}
	
	public AutCertOrig(String nitKN, String tipoDoc, String user, String pwd) {
		
		startUpBrowser();
		
		// Usuario Registrado
//		WebElement userReg = findBy("xpath", "//*[@id=\"sliderHInner\"]/div[1]/div[2]/div/ul/li[1]/a");
//		userReg.click();			

		refresh();
		
		// Iniciar Sesion
		sendBy("id", "vistaLogin:frmLogin:txtNit", nitKN);	
		WebElement selectTipoDoc = findBy("id", "vistaLogin:frmLogin:selTipoDoc");
		Select select = new Select(selectTipoDoc);
		select.selectByVisibleText(tipoDoc);
		sendBy("id", "vistaLogin:frmLogin:txtUsuario", user);	
		sendBy("id", "vistaLogin:frmLogin:txtCadena", pwd);
		clickBy("name", "vistaLogin:frmLogin:_id18");
		
		// Consulta Asuntos
		waitBy("xpath", "//*[@id=\"vistaMenuUsuario:frmMenuUsuario:_id28:id5609\"]/td[3]/a");
		WebElement consAsuntos = findBy("xpath", "//*[@id=\"vistaMenuUsuario:frmMenuUsuario:_id28:id5609\"]/td[3]/a");
		consAsuntos.click();
		
//		closeBrowser();
	}

}
