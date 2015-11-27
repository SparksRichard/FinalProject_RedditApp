'use strict';

/**
 * @ngdoc overview
 * @name redditAppFrontendApp
 * @description
 * # redditAppFrontendApp
 *
 * Main module of the application.
 */
angular
  .module('redditAppFrontendApp', [
    'ngAnimate',
    'ngCookies',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch',
    'redditSearch.controller',
    'redditSearch.services'
  ])
  .config(function ($routeProvider) {
    $routeProvider
      .when('/', {
        templateUrl: 'features/views/search.html',
        controller: 'redditSearchCtrl',
      })
      .when('/list', {
        templateUrl: 'features/views/searchResult.html',
        controller: 'redditSearchCtrl',
        controllerAs: 'about' //what is this?
      })
      .otherwise({
        redirectTo: '/'
      });
  });
