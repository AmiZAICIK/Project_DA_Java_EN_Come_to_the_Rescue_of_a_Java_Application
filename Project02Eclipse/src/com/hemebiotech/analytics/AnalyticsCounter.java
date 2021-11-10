package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter {
//on entre ici les noms des deux fichiers, pour modification facile si besoin
	public static final String fichierOriginal = "symptoms.txt";
	public static final String fichierFinal = "result.out";
//	Fonctionnement du programme :
//   	1) chopage des données sous forme de string : ReadSymptomDataFromFile, renvoie list	
//		2) Morpher la liste en TreeMap pour décompte : SymptomsCounter, renvoie treemap
//		3) Création du fichier de résultats (vide) : ResultsFileInitializer
//		4) Ecriture des résultats dans ledit fichier : ResultsWriter
//
// Nos classes et interfaces :
//	Interface ISymptomReader : l'interface. INCHANGEE, OPERATIONNELLE
// Class AnalyticsCounter : le main. En cours
// Class ReadSymptomsDataFromFile : transforme symptoms.txt en liste. INCHANGEE, OPERATIONNELLE
// Class SymptomsCounter : transforme la liste en treemap
// Class FileCreator : réinitialise le fichier de résultats
// Class ResultsWriter : remplit le ficher de résultat avec les données du treemap

	public static void main(String args[]) throws Exception {

//on crée une instance de ReadSymptomsDataFromFile		
		ReadSymptomDataFromFile cheminSymptomes = new ReadSymptomDataFromFile(fichierOriginal);
//on récupère la liste des symptomes 	
		List<String> listeDesSymptomes = cheminSymptomes.GetSymptoms();
//on crée le treemap avec ListeDesSymptomes en argument
		TreeMap<String, Integer> listeComptee = SymptomsCounter.ListToMap(listeDesSymptomes);
//on initialise le fichier de résultats
		ResultsFileInitializer.createurDeFichierDeResultats(fichierFinal);

	}

}