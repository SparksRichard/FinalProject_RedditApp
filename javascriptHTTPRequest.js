var request = new XMLHttpRequest();
request.open('GET', 'http://www.reddit.com/.json');
request.onreadystatechange = function() {
	if ((request.status == 200) && (request.readyState == 4)) {
		var parsedRequest = JSON.parse(request.responseText);
		console.log(parsedRequest);
	}
}
request.send();