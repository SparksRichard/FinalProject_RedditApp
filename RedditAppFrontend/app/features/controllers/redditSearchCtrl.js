angular.module('redditSearch.controller',[])

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



}

 