# Epicrafter-s-Journey
# 🧱 Epicrafter's Journey

Projet Java orienté objet simulant un système de construction modulaire à base de blocs (murs, portes, kits) avec gestion d'exceptions personnalisées.

## 📋 Description du projet

Un bloc de construction est un élément reproductible défini par **3 caractéristiques** :
- **Longueur**
- **Largeur**
- **Hauteur**

Ce projet met en pratique les concepts fondamentaux de la Programmation Orientée Objet (POO) en Java : héritage, interfaces, collections et gestion des erreurs.

## 🏗️ Architecture & Fonctionnalités

Le package `prepa` contient les éléments suivants :
- **`IBloc` & `Bloc`** : Interface et classe de base définissant les dimensions et la couleur (`Couleur`) d'un bloc.
- **`Mur` & `Porte`** : Sous-classes spécialisées de `Bloc` (avec gestion du verrouillage pour les portes).
- **`Kit`** : Assemblage regroupant une collection de blocs (`Set<IBloc>`) et des mots-clés associés (`Set<String>`).
- **Exceptions personnalisées** :
  - `IllegalBlocException` : Levée lors d'une tentative de création d'un bloc aux dimensions invalides.
  - `PorteVerrouilleException` : Levée lorsqu'on tente de verrouiller une porte qui l'est déjà.
- **`Main`** : Point d'entrée permettant de tester la création et la manipulation des blocs.

## 🚀 Installation et exécution

1. **Cloner le dépôt :**
   ```bash
   git clone https://github.com
   ```
2. **Importer dans Eclipse (ou autre IDE Java) :**
   - Ouvrir Eclipse -> *File* -> *Import* -> *Existing Projects into Workspace*.
   - Sélectionner le dossier cloné.
3. **Lancer le programme :**
   - Exécuter la classe `prepa.Main` (*Run As -> Java Application*).

## 🛠️ Technologies utilisées

- **Langage :** Java
- **IDE :** Eclipse
- **Gestion de version :** Git & GitHub
