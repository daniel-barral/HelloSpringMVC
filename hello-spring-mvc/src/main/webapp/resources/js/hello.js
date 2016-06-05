function Hello($scope, $http) {
	$http.get('http://localhost:8080/hello-spring-mvc/rest/greeting').success(
			function(data) {
				$scope.greeting = data;
			});
}
