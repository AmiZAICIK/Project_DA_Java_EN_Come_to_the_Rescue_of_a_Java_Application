/**
 * 
 */
package com.hemebiotech.analytics;

/**
 * @author ami
 *
 */
import java.io.File;

public class ResultsFileInitializer {

	private String fichierOut;

	public ResultsFileInitializer(String fichierOut) {
		this.fichierOut = fichierOut;
	}

	public void createurDeFichierDeResultats() throws Exception {

		File f = new File(fichierOut);
		// on définit un objet comme le fichier

		f.delete();

		f.createNewFile();

	} // on crée un beau fichier tout neuf avec le nom voulu, dans le répertoire
		// System.out.println(f);
		// System.out.println(f.getAbsolutePath());// racine du projet

}
