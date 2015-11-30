angular.module('redditSearch.services',[])

.factory('redditSearchService', function($http, $window){

	var redditUrlList = undefined;

	function sendRedditSearch(searchReddit){
<<<<<<< HEAD
		console.log(searchReddit);
=======
>>>>>>> zooqini
		$http({
			method: 'GET',
			url: 'http://127.0.0.1:8080/search',
			params: {search: searchReddit}
		}).then(function successCallback(output){
<<<<<<< HEAD
			console.log(output);
=======
>>>>>>> zooqini
			redditUrlList = output.data;
			$window.location.href='#/'
		}) 
	}
<<<<<<< HEAD
	return{
		getData: function(){return redditUrlList},
		sendRedditSearch: sendRedditSearch
	}
=======
	function
>>>>>>> zooqini

})
