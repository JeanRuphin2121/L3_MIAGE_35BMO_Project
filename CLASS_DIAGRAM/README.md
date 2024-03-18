## Description textuelle du Diagramme des classes
### Les diiférentes classes
Pour notre Système de Gestion des Paris en ligne, nous avons recensé les classes suisvantes :
1. User : Représente un utilisateur du système de gestion de paris en ligne. Il possède des attributs tels que le nom, le prénom, l'email, le rôle, le solde, et le statut de connexion. Il a une méthode publique login pour se connecter au système.
2. Sport : Représente un sport sur lequel les paris peuvent être placés.
3. Bet : Représente un pari. Il a un attribut décrivant le type de pari.
4. Option : Représente une option associée à un pari.
5. SportEvent : Représente un événement sportif sur lequel les paris peuvent être placés. Il a des attributs tels que le nom de l'événement, la date, l'équipe à domicile et l'équipe à l'extérieur.
6. BetTicket : Représente un ticket de pari. Il contient des informations telles que l'événement sportif, le type de pari, l'option de pari et le montant misé.
7. RealTimeDataProvider : Représente un fournisseur de données en temps réel qui fournit des informations sur les événements sportifs.

### Les Règles de gestion
Les différentes relations et multiplicités présentent sur le diagramme des classes sont traduites par les règles de gestions suivcantes:
- User réalise 0 à plusieurs Bets.
- Bet concerne 0 à plusieurs Sports.
- Option possède 0 à plusieurs Sports.
- SportEvent est lié à 1 à plusieurs BetTickets.
- User possède 0 à plusieurs BetTickets.
- RealTimeDataProvider donne des informations sur 1 à plusieurs SportEvents.
Ce diagramme montre comment les différentes classes du système de gestion de paris en ligne sont interconnectées et quelles sont les relations entre elles.