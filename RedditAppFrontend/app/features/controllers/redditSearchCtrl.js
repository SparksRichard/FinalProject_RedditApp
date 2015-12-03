angular.module('redditSearch.controller',[])


.controller('redditSearchCtrl',function($scope, $window, redditSearchService){
	$scope.redditUrlList = {};
	$scope.sendSearch = function(){
		var targetSubreddit = $scope.search;
		redditSearchService.sendRedditSearch(targetSubreddit);
	}
	$scope.$watch(function(){
		return redditSearchService.getData();
	}, function(newVal, oldVal) {
		if (newVal != undefined ) {
			$scope.redditUrlList = newVal;
		}
	console.log($scope.redditUrlList);
	}) 



})

 