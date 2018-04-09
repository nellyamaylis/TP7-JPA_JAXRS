'use strict';
/**
 * @ngdoc function
 * @name TP7-yoApp.controller:AddPersonnesCtrl
 * @description
 * # AddPersonnesCtrl
 * Controller of the TP7-yoApp
 */
angular.module('TP7-yoApp')
  .controller('AddPersonnesCtrl', function (FactoryAddPersonnes,$scope) {
    $scope.nom="";
    $scope.prenom="";
    $scope.mail="";


    $scope.add = function(nom,prenom,mail) {
      var newPerson = new FactoryAddPersonnes();
      newPerson.nom=nom;
      newPerson.prenom=prenom;
      newPerson.mail=mail;
      console.log(nom + " " + prenom + " " + mail + " ");
      newPerson.$save();
    };

  });

// Le module va communiquer avec la méthode java grâce au path en rest en java
angular.module('TP7-yoApp').factory('FactoryAddPersonnes', function($resource) {
  return $resource("rest/Personne/addPersonne"); ///A REVOIR EN FONCTION DU CODE DE HOME
});
