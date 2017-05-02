function readPicture(input, output)
{
    if (input.files && input.files[0])
    {
        var reader = new FileReader();
        reader.onload = function(e)
        {
            output.attr('src', e.target.result);
        };
        reader.readAsDataURL(input.files[0]);
    }
}

function redirect (url) {
    var ua        = navigator.userAgent.toLowerCase(),
        isIE      = ua.indexOf('msie') !== -1,
        version   = parseInt(ua.substr(4, 2), 10);

    // Internet Explorer 8 and lower
    if (isIE && version < 9) {
        var link = document.createElement('a');
        link.href = url;
        document.body.appendChild(link);
        link.click();
    }

    // All other browsers can use the standard window.location.href (they don't lose HTTP_REFERER like Internet Explorer 8 & lower does)
    else { 
        window.location.href = url; 
    }
}

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
