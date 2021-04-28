function upload() {
    var filename = document.getElementById("importFile1").value;
    if(filename.equals(null)){
        filename = document.getElementById("importFile2").value;
    }
    $.ajax({
        type:'POST',
        data:JSON.stringify(filename),
        contentType:'application/json',
        dataType:'json',
        url:'http://localhost:8080/carNumber',
        success:function(data){
            alert("OK!");
            document.getElementById("carnumber").value=data;
        },
        error:function(e){
            alert("error!");
        },
    })
};