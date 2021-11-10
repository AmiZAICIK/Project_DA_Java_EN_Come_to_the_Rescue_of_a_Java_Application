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

	public static void createurDeFichierDeResultats(String fichierFinal) throws Exception {
		// TODO Auto-generated method stub
		String nomFichierOut = fichierFinal; // on stocke le nom du fichier dans un string
		File f = new File(nomFichierOut); // on définit un objet comme le fichier
		try {
			f.delete();
		} catch (Exception e) {

		} // on tente d'effacer le fichier. Si il existait, il est effacé. Si il
			// n'existait pas, la gestion d'erreur permet de passer à la suite

		File file = new File(nomFichierOut);
		System.out.println(file);
		file.createNewFile(); // on crée un beau fichier tout neuf avec le nom voulu, dans le répertoire
								// racine du projet

	}

}
