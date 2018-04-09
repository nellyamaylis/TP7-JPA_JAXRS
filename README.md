tp7sir
Le projet est généré avec la version 0.16.0 de yo angular generator.
Build & development
Run grunt for building and grunt serve for preview.
Testing
Running grunt test will run the unit tests with karma.
Ce TP est basé principalement sur le TP4sir et surtout sur la partie REST qui permet de créer une simple interface en utilisant Angular JS. L'interface est générée par Yeoman via la commande yo. On s’intéresse ici au dossier app qui contient les fichiers essentiels:
app/scripts/controllers: dans cette section il y a le contrôleur MainCtrl dans le fichier main.js qui a pour rôle de lister les différentes personnes qu’on a créé dans le tp4 avec JAX-RS et qu’on récupère en utilisant $http ayant comme URL le même URL Rest du TP4, sachant que dans le tp4 c’était sur le port 8080 d’où l’utilisation d’un proxy. 
