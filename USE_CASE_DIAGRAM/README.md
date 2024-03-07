## Description Textuelle du Diagramme des Cas d'Utilisation
Le diagramme des Cas d'Utilisation représente un système de gestion des paris en ligne avec les différents types d'utilisateurs que nous pourrions avoir.

#### Les Acteurs
Pour ce système, nous avons recensés deux (02) types d'utilisateurs à savoir :
    - Les Utilisateurs
    - Les Bookmakers

#### Les Cas d'Utilisations (Uses Cases / Fonctionalités)
Nous avons recensés plusieurs cas d'utilisation. On déplore entre autre les cas suivants :
    
    1. Créer un  compte : Les utilisateurs ont la possibilité de créer un compte sur le système.
    
    2. Se connecter : Les utilisateurs peuvent se connecter à leur compte existant sur le système.
    
    3. Placer un pari (Avancé ou Simple) : Les utilisateurs peuvent placer des paris sur des événements sportifs. Ce cas d'utilisation    est subdivisé en deux variantes : **Placer un Pari Simple** et **Placer un Pari Avancé**, offrant différentes options de paris.
    
    4. Consulter évènements sportifs : Les utilisateurs peuvent consulter les événements sportifs disponibles pour les paris.
    
    5. Paramétrer évènements : Les bookmakers peuvent paramétrer les événements sportifs disponibles pour les paris.
    
    6. Plafonner les gains : Les bookmakers peuvent définir des limites sur les montants de gains pouvant être obtenus par les            utilisateurs.
    
    7. Limiter le montant maximal d'un pari : Les bookmakers peuvent définir des limites sur les montants maximaux pouvant être misés sur un pari.

Les cas d'utilisations 1 à 4 sont spécifiques aux Utilisateurs (Parieurs) et le reste des uses cases (5 à 7) sont spécifiques au Bookmaker.

#### Les Relations entre les cas d'utilisations et les acteurs du Système
Le cas d'utilisation "Placer un Pari Simple" est une extension de "Placer un Pari", ce qui signifie qu'il ajoute des fonctionnalités supplémentaires au processus de placement de pari. De même, "Placer un Pari Avancé" est également une extension de "Placer un Pari".

L'acteur "Utilisateur" est associé aux fonctionnalités liées à la consultation et au placement de paris, ainsi qu'à la gestion de compte. L'acteur "Bookmaker" est associé aux fonctionnalités de paramétrage des événements, de plafonnement des gains et de limitation des montants de paris.

En résumé, ce diagramme illustre les interactions entre les différents acteurs et les fonctionnalités offertes par le système de gestion des paris en ligne.
