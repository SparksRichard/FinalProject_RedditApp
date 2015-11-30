angular.module('redditSearch.controller',[])

<<<<<<< HEAD
.controller('redditSearchCtrl',function($scope, $window, redditSearchService){
	$scope.redditUrlList = {};
=======
.controller('redditSearchCtrl',function($scope, $window, redditService){
	$scope.redditUrlList = {};

	$scope.sendSearch = function(){
		var targetSubreddit = $scope.search;
		redditService.sendRedditSearch(targetSubreddit);
	}
	$scope.$watch(function(){return redditService.getVerified();}, function(newVal, oldVal) {
		if (newVal !== "undefined" ) {
			$scope.redditUrlList = newVal;
			$window.location.href='#/question';
		}
	}) 
>>>>>>> zooqini

	$scope.sendSearch = function(){
		var targetSubreddit = $scope.search;
		redditSearchService.sendRedditSearch(targetSubreddit);
	}
	$scope.$watch(function(){
		return redditSearchService.getData();
	}, function(newVal, oldVal) {
		console.log(newVal);
		console.log(oldVal);
		if (newVal != undefined ) {
			$scope.redditUrlList = newVal;
		}
	}) 



})

 