import csv
import inspect
from enum import Enum

# importation des autres shémas tables 
from ExempleEssaisColonneRef import RefCroise


# importation des algo
#fonctions signature
#entrée : - valeurs en entrée 
#         - ...
#         - valeurs en entrée 
#sortie ; - valeurs en sortie
import AlgoMoyExp as AlgoMoyExp 





#la classe des contraintes
class Contrainte:
    def __init__(self, message, actionContrainte, comparatifs, colonnes):
        self.message = message
        self.actionContrainte = actionContrainte
        self.comparatifs = comparatifs
        self.colonnes = colonnes



class colonne:
    valeur = []
    type = "str"
    nom = ""

    def __init__(self,nom,type):
        self.valeur = []
        self.type = type
        self.nom = nom





class ColonneCal:

    colonnesImport = []
    colonnesReference = []
    colonnesCalcule = []
    

    def __init__(self):
        self.colonnesImport = [colonne("taille","float"), colonne("contraintes","float")]
        self.colonnesReference = [colonne("Open","float")]
        self.colonnesCalcule = [colonne("Moy","float")]


        

    #permet de vérifier que la matrice est conforme
    #argument : - self classe
    #sortie : booléen, retourne true si le fichier à bien été importé et false sinon
    # affiche les messages d'avertissements ou d'éreurs 
    def verificationImport(self,contenue):  
        tableau = []

       
        #vérification
        for ligne in range(1,len(contenue)):
            for colonne in range (0,len(self.colonnesImport)) :
                
                #vérification de type
                try :
                    contenue[ligne][colonne]  = eval(self.colonnesImport[colonne].type + "(\"" + contenue[ligne][colonne] + "\")")  

                    #ajout de la valeur dans le tableau 
                    self.colonnesImport[colonne].valeur.append(contenue[ligne][colonne])          
                except Exception as e:
                    print("mauvais type de données ligne : " + str(ligne) + ", colonne : " + str(colonne))
                    return False      
            
            #vérification des contraintes     
            #contrainte 1
            #contraintes à vérifier qui ne concerne que des colonnes importées
            contrainteMinMax = Contrainte("max valeur","Erreur","<=",[0,1])

            
            colonnes = contrainteMinMax.colonnes
            if eval("not(" + str(contenue[ligne][colonnes[0]]) + contrainteMinMax.comparatifs + str(contenue[ligne][colonnes[1]]) + ")") :
                if contrainteMinMax.actionContrainte == "Erreur":
                    print(str(contrainteMinMax.message) + ", ligne:" + str(ligne) )
                    return False
                elif contrainteMinMax.actionContrainte == "Avertissement":
                    print(str(contrainteMinMax.message) + ", ligne: " + str(ligne) ) 
                else :
                    print("Erreur de transformation")


                
        return True



    #permet d'importer in fichier CSV
    #argument : - self classe
    #           - fichierCSV : chemin du fichier CSV que l'on veut importer
    #sortie : booléen, retourne true si le fichier à bien été importé et false sinon
    def importationCSV(self,fichierCSV):
        try:
            with open(fichierCSV, mode='r', encoding='utf-8') as fichier:
                    fichierCSV = fichier
                    lecteur_csv = csv.reader(fichier)
                    contenue = [ligne for ligne in lecteur_csv]
                            #verification que la matrice importer est conforme aux contraintes et aux types
                    if not(self.verificationImport(contenue)):
                            print("retour false Calcul")                                                 
        except Exception as e:
            print("Erreur dans l'importation de Calcul")



        
    #permet d'ajouter les colonnes des autres tableaux
    def AjoutColonneReference(self,addresseTabRef):
        #création du tableau 
        RefC = RefCroise()
        #appel des fonctions d'importations des données et calcul des données sur le tableau en référence
        RefC.AjoutColonneReference([])
        RefC.importationCSV(addresseTabRef[0])
        RefC.calcul()
        if not(RefC.verificationFinal):
            raise("Erreur dans les vérifications")
        self.colonnesReference[0].valeur = RefC.colonnesImport[0].valeur




    def calcul(self):
        for ColonneActive in self.colonnesCalcule:
            #imaginons une colonne calculée 
            intermediaire = []
            #ici à aller chercher dans industrieAllemande
            identifiantColonnesEntree = [0,0]
            
            #faire de l'introspection pour récupérer le nom de la fonction
            methodes = [name for name, obj in inspect.getmembers(AlgoMoyExp, inspect.isfunction)]
            #si il y a plusieurs méthode fini 
            if len(methodes) > 1:
                raise("L'algo " + "AlgoMoyExp" + "a trop de fonction alors que nous en voulons qu'une")
            for i in range(0,len(self.colonnesReference[identifiantColonnesEntree[0]].valeur)):
                #Il faut ajouter le nom du dossier de la fonction importer
                intermediaire.append(eval("AlgoMoyExp." + str(methodes[0]) + "(self.colonnesReference[identifiantColonnesEntree[0]].valeur[i], self.colonnesImport[identifiantColonnesEntree[1]].valeur[i])"))
            ColonneActive.valeur = intermediaire



    #permet de vérifier que les calculs sont les bons
    #argument : - self classe
    #sortie : booléen, retourne true si le fichier à bien été importé et false sinon
    # affiche les messages d'avertissements ou d'éreurs 
    def verificationFinal(self):  
        tableau = []

        #reste des contraintes
        contrainteMinMax = Contrainte("mauvaise moy","Erreur",">=",[0,0])

        #vérification des contraintes     
        #contrainte 1
        for ligne in range(0,len(self.colonnesReference[0].valeur)):
            identifiantColonnesEntree = contrainteMinMax.colonnes
            if eval("not(" +"self.colonnesImport[identifiantColonnesEntree[0]].valeur[ligne]"+ contrainteMinMax.comparatifs +  "self.colonnesCalcule[identifiantColonnesEntree[1]].valeur[ligne])") :
                if contrainteMinMax.actionContrainte == "Erreur":
                    print(str(contrainteMinMax.message) + ", ligne:" + str(ligne) )
                    return False
                elif contrainteMinMax.actionContrainte == "Avertissement":
                    print(str(contrainteMinMax.message) + ", ligne: " + str(ligne) ) 
                else :
                    print("Erreur de transformation")
        return True


    def ExmportationCSV(self):
        # Écriture des données dans le fichier CSV
        with open("fichierSortie.csv", mode='w', newline='', encoding='utf-8') as fichier_csv: 
            writer = csv.writer(fichier_csv) 
            #création de la matrice adéquate :
            taille = 0
            if len(self.colonnesReference) != 0:
                taille = len(self.colonnesReference[0].valeur)
                donnees = [[] for i in range(0,taille+1)]
            elif len(self.colonnesCalcule) != 0:
                taille = len(self.colonnesCalcule[0].valeur)
                donnees = [[] for i in range(0,taille+1)]
            elif len(self.colonnesImport) != 0:
                taille = len(self.colonnesImport[0].valeur)
                donnees = [[] for i in range(0,taille+1)]
            else :
                raise("Le tableau ne contient aucune colonne")
            #colonne de référence
            for colonne in self.colonnesReference:
                donnees[0].append(colonne.nom)
                for ligne in range (0,taille):
                    donnees[ligne+1].append(colonne.valeur[ligne])
            #colonne importe
            for colonne in self.colonnesImport:
                donnees[0].append(colonne.nom)
                for ligne in range(0,taille):
                    donnees[ligne+1].append(colonne.valeur[ligne])
            #colonne calculé
            for colonne in self.colonnesCalcule:
                donnees[0].append(colonne.nom)
                for ligne in range(0,taille):
                    donnees[ligne+1].append(colonne.valeur[ligne])

            writer.writerows(donnees)  # Écrit chaque ligne du dictionnair

    

tabCal = ColonneCal()
tabCal.AjoutColonneReference(["fichierDeTest/testRef.csv"])
tabCal.importationCSV("fichierDeTest/testCal.csv")
tabCal.calcul()
tabCal.verificationFinal()
tabCal.ExmportationCSV()
