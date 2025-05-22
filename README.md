# 🏥 Application de Gestion de Patients - Spring Boot + JPA

Ce projet **Spring Boot** est une application de gestion de patients utilisant **JPA avec Hibernate**.  
Il illustre comment manipuler des entités et persister les données en base, d’abord avec **H2**, puis après migration vers **MySQL**.  
Il inclut également une gestion plus avancée avec des entités telles que **Médecin**, **RendezVous**, et **Consultation**.

---

## 📑 Table des matières

- [🧱 Partie 1 : Création de la base de données avec Hibernate](#-partie-1--création-de-la-base-de-données-avec-hibernate)
- [🛠️ Partie 2 : Migration vers MySQL](#-partie-2--migration-vers-mysql)
- [📊 Partie 3 : Ajout des entités avancées et manipulation des données](#-partie-3--ajout-des-entités-avancées-et-manipulation-des-données)

---

## 🧱 Partie 1 : Création de la base de données avec Hibernate

- Définition de l'entité `Patient` avec ses attributs :
  - `id`, `nom`, `dateNaissance`, `malade`, `score`
- Utilisation de **Spring Data JPA** pour gérer la persistance.
- Implémentation des opérations CRUD via un `PatientRepository`.
- Tests via un `CommandLineRunner` :
  - Insertion de patients
  - Affichage et recherche
  - Suppression
- Utilisation de la base en mémoire **H2**.

---

## 🛠️ Partie 2 : Migration vers MySQL

- Passage de la base **H2** vers **MySQL**.
- Configuration dans `application.properties` :
  - URL, utilisateur, mot de passe
  - `spring.jpa.hibernate.ddl-auto=update` pour la gestion du schéma
- Persistance des données réelles dans une base relationnelle.

---

## 📊 Partie 3 : Ajout des entités avancées et manipulation des données

Ajout de nouvelles entités pour modéliser un système médical complet :

### ⚙️ Entités ajoutées

- `Medecin`
- `RendezVous`
- `Consultation`

### 🔗 Relations

- Un `RendezVous` associe un **patient** à un **médecin**
- Une `Consultation` est liée à un `RendezVous`

### 🧪 Manipulations

- Création et persistance des entités via Spring Data JPA
- Requêtes, associations et manipulations relationnelles via les repositories

---

## 🚀 Lancement du projet

1. Cloner le dépôt :
   ```bash
   git clone https://github.com/ANASS12341/TP2-sys-Dest-JPA.git
   cd TP2-sys-Dest-JPA
