let urlApi="https://g4222a76c1dd50c-dbg5equipo3.adb.us-phoenix-1.oraclecloudapps.com/ords/admin/api/reto1"
$.ajax({
    url: urlApi,
    type: 'GET',
    dataType: 'json',
    success:function(data){
        console.log(data)
    },
    error:function(xhr, status) {
        console.log("Ha sucedido un problema al consumir la Api" + xhr.status+" "+status)
    },
    complete:function(xhr, status) {
        console.log("Peticion realizada con exito!!")
    }

});
