
function initialise(){
    if(geoPosition.init()){
        geoPosition.getCurrentPosition(success_callback,error_callback,{enableHighAccuracy:true});
    }
    else{
        default_geo_values();
    }
}

function success_callback(p){
    var la = parseFloat( p.coords.latitude ).toFixed(2);
    var lo = parseFloat( p.coords.longitude ).toFixed(2);
    document.getElementById('latitude').value = la;
    document.getElementById('longitude').value = lo;
    document.getElementById('geoLaLo').innerHTML = la + ', ' + lo;
}

function error_callback(p){
    default_geo_values();
}

function default_geo_values(){
    document.getElementById('latitude').value = '36.72016';
    document.getElementById('longitude').value = '-4.42034';
    document.getElementById('geoLaLo').innerHTML = '36.72016, -4.42034';
}
