/**
 * 
 */
package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * @author ami
 *
 */
public class SymptomsCounter {
	private List<String> symptomsList;

	public SymptomsCounter(List<String> symptomsList) {
		this.symptomsList = symptomsList;
	}

	public TreeMap<String, Integer> listToMap() {

		TreeMap<String, Integer> MapSympt = new TreeMap<String, Integer>();
		//

		for (String UnSymptome : symptomsList) {
			// boucle "for" basée sur une lecture ligne par ligne de la List entrée en
			// argument de la méthode.
			Integer j = MapSympt.get(UnSymptome); // pour la clé UnSymptome, on chope la valeur associée dans le
													// treemap, qu'on colle dans j

			MapSympt.put(UnSymptome, (j == null) ? 1 : j + 1); // soit on rentre un nouveau binôme dans la map,
			// System.out.println(UnSymptome); // (UnSymptome,1), si pas de clé UnSymptome
			// (garanti par
			// j inexistant), soit on met à jour le binome en
			// incrémentant la valeur associée à la clé
		}
		return MapSympt;
		// on retourne le treemap qui a fait tout le boulot : les symptomes en clé
		// (garantissant leur unicité ET l'ordre alphabétique) et en valeur associée leu
		// nombre d'apparitions dans notre argument ListeDesSymptomes
	}

}
