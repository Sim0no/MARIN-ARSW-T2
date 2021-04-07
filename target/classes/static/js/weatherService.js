
weather = (function (){

    return{
        getWeatherStatsByCity: function(city, callback){
            var getStat = $.getJSON("/api/weather/"+city, function(){
                let response = getStat.responseText;
            }).done(()=>{
                callback(JSON.parse(getStat.responseText));
            }).fail(()=>{
                alert("Error");
            });
        }
    }



})();