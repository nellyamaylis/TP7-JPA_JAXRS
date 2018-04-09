'use strict';

/**
 * @ngdoc function
 * @name TP7-yoApp.controller:ListHomesCtrl
 * @description
 * # ListHomesCtrl
 * Controller of the TP7-yoApp
 */
angular.module('TP7-yoApp')
  .controller('ListHomesCtrl', function ($scope,FactoryHome) {
    $scope.homes=[];
    var res= FactoryHome.query(function(){
      for(var i=0;i<res.length;i++){
        console.log(res[i]);
        $scope.homes.push({"address":res[i]['address'],"town":res[i]['town'],"rooms":res[i]['room'],"surface":res[i]['surface']});
      }
    });
  });


angular.module('tp7Yeoman').factory('FactoryHome', function($resource) {
  return $resource("rest/home/list");
});
