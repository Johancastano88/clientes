

function leeerClientes(){
    //FUNCION GET
    $.ajax({
    url : 'https://g4222a76c1dd50c-dbg5equipo3.adb.us-phoenix-1.oraclecloudapps.com/ords/admin/client/client',
    type : 'GET',
    dataType : 'json',
    success : function(clientes) {
        let cs=clientes.items;

        for(i=0;i<cs.length;i++){
            $("#listaClientes").append("<b>"+cs[i].name+"</b> " + cs[i].email+"<br>");
           
        }

    },
    error : function(xhr, status) {
    //alert('ha sucedido un problema');
    },

 });

}

function guardarClientes(){
    let idCliente=$("#idCliente").val();
    let nombreCliente=$("#nombreCliente").val();
    let emailCliente=$("#emailCliente").val();
    let edadCliente=$("#edadlCliente").val();

    let data={
        id:idCliente,
        name:nombreCliente,
        email:emailCliente,
        age:edadCliente
    };
    let dataToSend= JSON.stringify(data);
    console.log(dataToSend);


    $.ajax({
        url : 'https://g4222a76c1dd50c-dbg5equipo3.adb.us-phoenix-1.oraclecloudapps.com/ords/admin/client/client',
        type : 'POST',
        dataType : 'json',
        data:dataToSend,
        contentType:'application/json',

        success : function(clientes) {
            console.log(clientes);
        
        },
        error : function(xhr, status) {
        //alert('ha sucedido un problema');
        }

    });
}
