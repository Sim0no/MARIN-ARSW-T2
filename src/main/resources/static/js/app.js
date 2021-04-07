const app = (() =>{
    const mapWeatherToTable = (weatherStats) =>{

        $("#city > tbody").append(
            `
			<tr>
				<td>${weatherStats.name}</td>
				<td>${weatherStats.timezone}</td>
			</tr>
			`
        );


        $("#weather > tbody").append(
            `
			<tr>
				<td>${weatherStats.weather.main}</td>
                <td>${weatherStats.weather.description}</td>
			</tr>
			`
        );
        $("#mainStats > tbody").append(
            `<tr><td>Temperature</td><td>${weatherStats.main.temp}</td></tr>
             <tr><td>Feels Like</td><td>${weatherStats.main.feels_like}</td></tr>
             <tr><td>Min temp</td><td>${weatherStats.main.temp_min}</td></tr>
             <tr><td>Max temp</td><td>${weatherStats.main.temp_max}</td></tr>
            <tr><td>Presure</td><td>${weatherStats.main.pressure}</td></tr>
            <tr><td>humidity</td><td>${weatherStats.main.humidity}</td></tr>
        `
        );
        $("#windStats > tbody").append(
            `<tr><td>Wind speed</td><td>${weatherStats.wind.speed}</td></tr>
             <tr><td>Wind deg</td><td>${weatherStats.wind.deg}</td></tr>
             `
        );
        plotMarkers(weatherStats.coor);


    }
    const init = () =>{
        initMap();
    }
    var initMap = () => {
        map = new google.maps.Map(document.getElementById("map"), {
            zoom: 2,
            center: {lat: 35.717, lng: 139.731},
        });
    }
    function plotMarkers(m) {
        console.log(m)
        markers = [];
        bounds = new google.maps.LatLngBounds();
        console.log(m.lon, m.lat);
        var position = new google.maps.LatLng(m.lat, m.lon);
        console.log(position);
        markers.push(
            new google.maps.Marker({
                position: position,
                map: map,
                animation: google.maps.Animation.DROP
            })
        );
        bounds.extend(position);
        map.fitBounds(bounds);
        map.setZoom(4);
    }
    function empty(){
        $("#cityb").empty();
        $("#weatherb").empty();
        $("#mainStatsb").empty();
        $("#windStatsb").empty();
    }
    const getWeatherByCity = (city) =>{
        empty();
        weather.getWeatherStatsByCity(city,mapWeatherToTable);
    }
    return{
        getWeatherByCity:getWeatherByCity,
        init:init
    }
})();