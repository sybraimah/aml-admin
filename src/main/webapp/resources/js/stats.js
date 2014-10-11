var Stats = {
    setRequestMonth: function(data,element,xKey,yKey,label){
        new Morris.Area({
            // ID of the element in which to draw the chart.
            element: element,
            // Chart data records -- each entry in this array corresponds to a point on
            // the chart.
            data: data,
            fillOpacity: 0.5,
            // The name of the data record attribute that contains x-values.
            xkey: xKey,
            // A list of names of data record attributes that contain y-values.
            ykeys: [yKey],
            // Labels for the ykeys -- will be displayed when you hover over the
            // chart.
            labels: [label],
            lineColors: ['#56bc76'],
            pointFillColors: ['#56bc76'],
            parseTime: false
        });
    }

};



