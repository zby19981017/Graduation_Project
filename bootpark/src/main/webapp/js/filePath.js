function upload() {
    var filename = document.getElementById("importFile").value;
    // 这时的filename不是 importFile 框中的值
    // document.getElementById("ppath").value=filename;
    // document.getElementById("carnumber").value=filename;
    var filepath = [{
        path: filename,
    }]
    $.ajax({
        type:'POST',
        data:JSON.stringify(filename),
        contentType:'application/json',
        dataType:'json',
        url:'http://localhost:8080/carNumber',
        success:function(data){
            alert("OK");
            document.getElementById("carnumber").value=data;
        },
        error:function(e){
            alert(e);
            // alert(data);
            // alert("error");
        },
    })
}