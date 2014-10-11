var MorrisConverter = {
    addData: function(xKey,yKey,xValues,yValues){
        var data = [];
        for (var i = 0, len = xValues.length; i < len; i++) {
            var obj={};
            obj[xKey] = xValues[i];
            obj[yKey] = yValues[i];
            data.push(obj);
        }
        return data
    }
}

