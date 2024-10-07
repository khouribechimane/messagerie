# Système de Messagerie

## Description
Ce projet consiste à créer un système de messagerie interne pour une société, permettant aux employés d'échanger des messages entre eux. Ce TP inclut la création d'une base de données MySQL avec les tables `Employe` et `Message`, la connexion à cette base de données, ainsi que des opérations CRUD (Create, Read, Update, Delete) sur les employés et les messages.

## Fonctionnalités
- Création et gestion des employés
- Envoi et réception de messages entre employés
- Affichage des messages reçus par un employé spécifique
- Connexion à une base de données MySQL via un fichier de configuration externe
- Implémentation d'opérations CRUD pour les employés et les messages

## Structure du Projet

### Connexion à la base de données
Un fichier `base.properties` contient les informations de connexion à la base de données, telles que l'URL, le nom d'utilisateur, et le mot de passe.

### Classes Java
- **Connexion** : Gère la connexion à la base de données.
- **Employe** et **Message** : Représentent respectivement les employés et les messages échangés.
- **EmployeService** et **MessageService** : Implémentent les opérations CRUD pour les employés et les messages.
- **Messagerie** : Classe de test permettant d'envoyer et recevoir des messages entre les employés.


### Prérequis
- **Java** (JDK 8 ou supérieur)
- **MySQL** (ou autre SGBD compatible JDBC)


