
weather = (function (){

    return{
        getWeatherStatsByCity: function(city, callback){
            var getStat = $.getJSON("https://marin-arsw-t2.herokuapp.com/api/weather/"+city, function(){
                let response = getStat.responseText;
            }).done(()=>{
                callback(JSON.parse(getStat.responseText));
            }).fail(()=>{
                alert("Error");
            });
        }
    }



})();