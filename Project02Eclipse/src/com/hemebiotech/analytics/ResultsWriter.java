/**
 * 
 */
package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author ami
 *
 */
public class ResultsWriter {

	private String fichierFinal;
	private TreeMap<String, Integer> listeComptee;

	public ResultsWriter(TreeMap<String, Integer> listeComptee, String fichierFinal) {
		// TODO Auto-generated constructor stub
		this.listeComptee = listeComptee;
		this.fichierFinal = fichierFinal;
	}

	/**
	 * @param args
	 */
	public void remplisseurDeFichierDeResultats() {
		// TODO Auto-generated method stub
		try (FileWriter fileW = new FileWriter(fichierFinal, true); // on initialise la possibilité d'écrire dans
																	// result.out

				BufferedWriter writer = new BufferedWriter(fileW);) {
			for (Map.Entry<String, Integer> val : listeComptee.entrySet())// boucle d'extraction des paires
			{
				// ci dessous le test de bon déroulement de la boucle
				// System.out.println(1);
				writer.write("" + val.getKey() + " " + val.getValue());
				writer.newLine();
				// on sort le résultat dans le format demandé
			}
			writer.close();
		} catch (

		IOException i) {
			i.printStackTrace();
		}

	}
}
