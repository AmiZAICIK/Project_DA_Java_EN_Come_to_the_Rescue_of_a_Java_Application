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
		try (FileWriter g = new FileWriter(fichierFinal, true); // on initialise la possibilité d'écrire dans result.out

				BufferedWriter b = new BufferedWriter(g);) {
			for (Map.Entry<String, Integer> val : listeComptee.entrySet())// boucle d'extraction des paires
			{
				// ci dessous le test de bon déroulement de la boucle
				// System.out.println(1);
				b.write("The Symptom : " + val.getKey() + " " + "occurs" + " " + val.getValue()
						+ ((val.getValue() == 1) ? " time" : " times"));
				b.newLine();
				// on sort un message propre en bon anglais, pas le machin minimaliste proposé
				// dans le cours
			}
		} catch (

		IOException i) {
			i.printStackTrace();
		}
	}

}
