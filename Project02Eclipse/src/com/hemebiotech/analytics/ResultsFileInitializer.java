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

	public static void createurDeFichierDeResultats(String fichierOut) throws Exception {

		File f = new File(fichierOut); // on définit un objet comme le fichier
		try {
			f.delete();
			// System.out.println(f + "1");
		} catch (Exception e) {
			// System.out.println("erreur");
		} // on tente d'effacer le fichier. Si il existait, il est effacé. Si il
			// n'existait pas, la gestion d'erreur permet de passer à la suite

		// File file = new File(fichierOut);

		f.createNewFile(); // on crée un beau fichier tout neuf avec le nom voulu, dans le répertoire
		// System.out.println(f);
		// System.out.println(f.getAbsolutePath());// racine du projet

	}

}
