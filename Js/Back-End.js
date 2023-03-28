$(document).ready(function(){
    $("#listar").on("click", function(){

        let tabla = document.querySelector("#tabla")
        tabla.innerHTML = "<th>Codigo</th><th>Nombre</th><th>Categoria</th><th>Precio</th><th>Cantidad</th><th>Total</th><th>Total con IVA</th><th>Descuento</th>"

        $.ajax({
            url : "http://localhost:8080/listarProductos",
            type : "GET",
            dataType : "JSON",
            success : function(respuesta){
                console.log(respuesta)
                for (i = 0; i <= respuesta.length; i++) {
                    console.log(respuesta[i])
                    tabla.innerHTML += "<tr><td>" + respuesta[i].codigo + "</td><td>" +
                    respuesta[i].nombre + "</td><td>" +
                    respuesta[i].categoria + "</td><td>"+
                    respuesta[i].precio + "</td><td>" +
                    respuesta[i].cantidad + "</td><td>" + 
                    respuesta[i].total + "</td><td>" + 
                    respuesta[i].totalIva + "</td><td>" + 
                    respuesta[i].descuento + "</td></tr>" 
                }
            }
        });
    });

    $("#enviar").on("click", function(){
        let codigo = parseInt($("#id").val());

        $.ajax({
            url : "http://localhost:8080/descuento/" + codigo,
            type : "GET",
            dataType : "JSON",
            success : function(respuesta){
                if(respuesta){
                    alert("Se actualizó el descuento correctamente")
                }else{
                    alert("No se actualizó el descuento")
                }
            }
        })
    })
})