Contenu du Mini-Projet
Dans ce mini-projet, vous trouverez plusieurs packages, chacun jouant un rôle clé dans son fonctionnement :

Package CaseTest (Modèle)
Dans ce package, vous trouverez la définition de notre modèle principal, appelé CaseTest. J'ai utilisé toutes les annotations nécessaires pour le mapper correctement avec notre base de données.

Package Repo (Répertoire JPA)
Ce package héberge notre JPA Repository, où tous les pouvoirs CRUD (CREATE "POST", READ "GET", UPDATE "PUT", DELETE) prennent vie ! C'est là que nous faisons appel à notre classe CaseTest annotée et que la magie opère.

Package Controller
Ah, le contrôleur ! C'est là que les choses deviennent intéressantes. Dans ce package, vous trouverez toutes les routes et les méthodes nécessaires pour interagir avec notre application. Que ce soit pour créer, lire, mettre à jour ou supprimer, tout se passe ici.

Package Test (Tests Unitaires)
Et bien sûr, nous ne pouvons pas oublier les tests ! Dans ce package, j'ai préparé quelques tests unitaires pour m'assurer que tout fonctionne comme prévu. Parce que la qualité est importante !

Outils et Technologies Utilisés
Dans ce mini-projet, j'ai utilisé Maven pour gérer les dépendances et le processus de construction. De plus, j'ai utilisé la puissante base de données H2-DB pour stocker nos données, et Postman pour tester notre API et nous assurer que tout fonctionne correctement
