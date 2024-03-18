## Description textuelle des diagrammes d'états-transition

### Classe User :
#### Transition de l'état initial "LoggedOut" vers les autres états:

1. LoggedIn:
- Événement déclencheur: L'utilisateur saisit ses informations de connexion et se connecte avec succès.
- Action: Le système authentifie l'utilisateur et le connecte.

2. Locked:
- Événement déclencheur: L'utilisateur effectue un nombre prédéfini de tentatives de connexion infructueuses.
- Action: Le système verrouille le compte de l'utilisateur pour des raisons de sécurité.


#### Transitions vers l'état final "Logged out":

1. LoggedIn:
- Événement déclencheur: L'utilisateur choisit de se déconnecter.
- Action: Le système déconnecte l'utilisateur et le ramène à l'état "Logged out".

2. Locked:
- Événement déclencheur: L'utilisateur ou un administrateur déverrouille le compte.
- Action: Le système déverrouille le compte et l'utilisateur est ramené à l'état "Logged out".

* * 

### Classe SportEvent :
#### Transition de l'état initial "Upcoming" vers les autres états:

1. Live:
- Événement déclencheur: La date et l'heure de l'événement correspondent au moment présent.
- Action: Le système passe l'événement à l'état "Live".

2. Cancelled:
- Événement déclencheur: L'organisateur annule l'événement avant son début.
- Action: Le système annule l'événement et le passe à l'état "Cancelled".


### Transitions vers l'état final "Completed":
1. Live:
- Événement déclencheur: L'événement se termine (fin du match, etc.).
- Action: Le système passe l'événement à l'état "Completed".


### Transitions vers l'état final "Cancelled":
1. Completed:
- Événement déclencheur: L'organisateur annule l'événement après sa fin (résultats annulés, etc.).
- Action: Le système annule l'événement et le passe à l'état "Cancelled".

* * 

### Classe Bet
#### Transition de l'état initial "Placed" vers les autres états:

1. Pending:
- Événement déclencheur: Le pari est placé et validé par le système.
- Action: Le système met le pari en cours de traitement et le passe à l'état "Pending".

2. Cancelled:
- Événement déclencheur: L'utilisateur annule le pari avant son règlement.
- Action: Le système annule le pari et le passe à l'état "Cancelled".

#### Transitions vers l'état final "Settled Win":
1. Pending:
- Événement déclencheur: Le résultat de l'événement correspond au pari placé par l'utilisateur.
- Action: Le système calcule les gains et met le pari à l'état "Settled Win".

#### Transitions vers l'état final "Settled Loss":
1. Pending:
- Événement déclencheur: Le résultat de l'événement ne correspond pas au pari placé par l'utilisateur.
- Action: Le système met le pari à l'état "Settled Loss".

#### Transitions vers l'état final "Cancelled":
1. Pending:
- Événement déclencheur: Le pari est annulé par le système pour des raisons exceptionnelles (erreur de traitement, etc.).
- Action: Le système annule le pari et le passe à l'état "Cancelled".


* * 

### Remarques :
Ces diagrammes d'états sont des exemples simplifiés et peuvent être adaptés en conséquence.