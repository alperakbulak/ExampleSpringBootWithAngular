/**
 * Created by alper on 17.10.2017.
 */
var app = angular.module('ExampleSpringBootWithAngular',['ui.router','ngStorage']);

app.constant('urls',{
   BASE:'http://localhost:9889/ExampleSpringBootWithAngular',
   USER_SERVICE_API:'http://localhost:9889/ExampleSpringBootWithAngular/api/user/'
});

app.config(['$stateProvider','$urlRouterProvider',
    function ($stateProvider,$urlRouterProvider){
        $stateProvider.state('home',{
            url:'/',
            templateUrl:'partials/list',
            controller:'RestApiController',
            controllerAs:'ctrl',
            resolve:{
                users:function($q,UserService){
                    console.log('Load all users');
                    var deferred = $q.defer();
                    UserService.loadAllUsers().then(deferred.resolve,deferred.resolve);
                    return deferred.promise;
                }
            }
        });
        $urlRouterProvider.otherwise('/');
}]);