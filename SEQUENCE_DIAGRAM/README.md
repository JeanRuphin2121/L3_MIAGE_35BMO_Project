<<<<<<< HEAD
# Description textuelle du diagramme de Séquence

## Use Case "Se connecter"
=======
## Description textuelle du diagramme de Séquence du cas d'Utilisation Se connecter

>>>>>>> c479b54db2b8f7d14a39b1fbdeba9f6c87a9f1bf
### Scénario Nominal
1. L'utilisateur initie la connexion en fournissant son nom d'utilisateur et son mot de passe à l'application web.
2. L'application web reçoit les informations de connexion de l'utilisateur et envoie une requête SQL à la base de données pour vérifier les informations d'identification.
3. La base de données vérifie les informations d'identification et confirme qu'elles sont correctes.
4. L'application web reçoit la confirmation de la base de données et informe l'utilisateur que l'accès est accordé.
5. a. L'utilisateur est connecté avec succès à l'application web.

### Scénario Alternatif
5. b. L'application web informe l'utilisateur que l'accès est refusé en raison d'informations d'identification incorrectes. L'utilisateur ne parvient pas à se connecter à l'application web.


<<<<<<< HEAD
## Use Case "Placer un pari"
=======
## Description textuelle du diagramme de Séquence du cas d'Utilisation Placer un pari

>>>>>>> c479b54db2b8f7d14a39b1fbdeba9f6c87a9f1bf
### Scénario Nominal
1. L'utilisateur demande la liste des événements disponibles via l'application web.
2. L'application web envoie une requête à la base de données pour obtenir la liste des événements sportifs.
3. La base de données traite la requête et renvoie la liste des événements à l'application web.
4. L'application web affiche la liste des événements sportifs à l'utilisateur, regroupés par sport.
5. L'utilisateur sélectionne un sport et un événement sur lesquels il souhaite parier.
6. L'application web renvoie l'écran de paramétrage des paris à l'utilisateur.
7. L'utilisateur sélectionne les paramètres de son pari et saisit le montant qu'il souhaite miser.
8. L'application web compare le montant saisi avec le montant disponible sur le compte du parieur.
9. Si le montant saisi est inférieur ou égal au montant disponible:
10. L'application web envoie les informations du pari (côte, équipes, montant) à la base de données.
11. La base de données insère les informations du pari dans la base de données.
12. La base de données renvoie un message de confirmation à l'application web.
13. L'application web affiche un message à l'utilisateur indiquant que le pari a été effectué avec succès.
<<<<<<< HEAD

### Scénario Alternatif
Si le montant saisi est supérieur au montant disponible:
14. L'application web affiche un message à l'utilisateur indiquant que le pari n'a pas pu être effectué car le montant est insuffisant.

## Use Case "Consulter un évènement Sportif"
### Scénario Nominal
1. L'utilisateur demande les événements à l'application Web.
2. L'application Web envoie une requête "select *" à la base de données.
3. La base de données effectue une vérification et envoie une réponse à l'application Web.
4. L'application Web affiche à l'utilisateur une liste de tous les événements à venir ou en cours.
5. L'utilisateur choisit un événement.
6. L'application Web envoie une requête à la base de données pour obtenir toutes les informations relatives à l'événement choisi.
7. La base de données envoie les informations à l'application Web.
8. L'application Web affiche à l'utilisateur toutes les informations relatives à l'événement choisi.

### Scénario Alternatif
9. La base de données envoie une liste vide à l'application Web.
10. L'application Web affiche à l'utilisateur une liste vide.
11. L'utilisateur peut choisir de retourner à l'écran d'accueil.

## Use Case "Paramétrer un évènement"
### Scénario Nominal
1. L'utilisateur demande à l'application Web d'ajouter un événement sportif.
2. L'application Web affiche à l'utilisateur une interface pour paramétrer l'événement sportif.
3. L'utilisateur saisit les informations demandées dans l'interface et les envoie à l'application Web.
4. L'application Web envoie les informations à la base de données.
5. La base de données exécute une requête INSERT pour ajouter l'événement sportif.
6. La base de données informe l'application Web que l'insertion a été effectuée avec succès.
7. L'application Web redirige l'utilisateur vers l'accueil et affiche une notification de succès.

### Scénario Alternatif
8. La base de données détecte une erreur dans les informations et informe l'application Web de l'échec de l'insertion.
9. L'application Web redirige l'utilisateur vers l'accueil et affiche une notification d'échec.

## Use Case "Créer un compte"
### Scénario Nominal
1. L'utilisateur demande à l'application Web d'afficher l'interface de création de compte.
2. L'application Web affiche à l'utilisateur l'interface de création de compte.
3. L'utilisateur remplit les informations demandées dans l'interface et les envoie à l'application Web.
4. L'application Web envoie les informations à la base de données.
5. La base de données exécute une requête INSERT pour créer le compte utilisateur.
6. La base de données informe l'application Web que la création du compte a été effectuée avec succès.
7. L'application Web informe l'utilisateur que son compte a été créé avec succès.

### Scénario Alternatif
8. La base de données détecte une erreur dans les informations et informe l'application Web de l'échec de la création du compte.
9. L'application Web informe l'utilisateur que l'inscription a échoué.
10. L'utilisateur peut recommencer le processus d'inscription jusqu'à 3 fois.


### Points importants:
- Les diagrammes montrent les interactions entre l'utilisateur, l'application web et la base de données.
- Les diagrammes utilisent des flèches pour représenter les messages échangés entre les participants.
- Les diagrammes utilisent des cases pour représenter les actions et les conditions.
- Tout les diagrammes sont des exemples simplifiés et ne montrent pas tous les détails des processus sur une application de pari en ligne.
=======
Si le montant saisi est supérieur au montant disponible:
14. L'application web affiche un message à l'utilisateur indiquant que le pari n'a pas pu être effectué car le montant est insuffisant.


Description textuelle du diagramme de séquence UML "Placer un pari"
Acteurs et Participants:

Utilisateur: Acteur principal qui souhaite placer un pari.
Web App: Interface web qui permet à l'utilisateur de placer son pari.
Base de données (BDD): Stocke les informations sur les événements sportifs et les paris.
Déroulement du scénario:

L'utilisateur demande la liste des événements disponibles via l'application web.
L'application web envoie une requête à la base de données pour obtenir la liste des événements sportifs.
La base de données traite la requête et renvoie la liste des événements à l'application web.
L'application web affiche la liste des événements sportifs à l'utilisateur, regroupés par sport.
L'utilisateur sélectionne un sport et un événement sur lesquels il souhaite parier.
L'application web renvoie l'écran de paramétrage des paris à l'utilisateur.
L'utilisateur sélectionne les paramètres de son pari et saisit le montant qu'il souhaite miser.
L'application web compare le montant saisi avec le montant disponible sur le compte du parieur.
Si le montant saisi est inférieur ou égal au montant disponible:
L'application web envoie les informations du pari (côte, équipes, montant) à la base de données.
La base de données insère les informations du pari dans la base de données.
La base de données renvoie un message de confirmation à l'application web.
L'application web affiche un message à l'utilisateur indiquant que le pari a été effectué avec succès.
Si le montant saisi est supérieur au montant disponible:
L'application web affiche un message à l'utilisateur indiquant que le pari n'a pas pu être effectué car le montant est insuffisant.


### Points importants:

- Le diagramme montre les interactions entre l'utilisateur, l'application web et la base de données.
- Le diagramme est découpé en deux fragments pour représenter les deux cas possibles : montant suffisant et montant insuffisant.
- Le diagramme utilise des flèches pour représenter les messages échangés entre les participants.
- Le diagramme utilise des cases pour représenter les actions et les conditions.
- Ce diagramme est un exemple simplifié et ne montre pas tous les détails du processus de pari.
>>>>>>> c479b54db2b8f7d14a39b1fbdeba9f6c87a9f1bf
