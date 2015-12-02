angular.module('redditSearch.services',[])

.factory('redditSearchService', function($http, $window){

	var redditUrlList = undefined;

	function sendRedditSearch(searchReddit){

		$http({
			method: 'GET',
			url: 'http://127.0.0.1:8080/search',
			params: {search: searchReddit}
		}).then(function successCallback(output){

			redditUrlList = output.data;
			$window.location.href='#/'
		}) 
	}
	return{
		getData: function(){return redditUrlList},
		sendRedditSearch: sendRedditSearch
	}

})
