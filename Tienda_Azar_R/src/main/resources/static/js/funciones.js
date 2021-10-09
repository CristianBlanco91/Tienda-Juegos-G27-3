function eliminarProv(NIT_Prov) {
	swal({
		title: "¿Esta seguro que desea Eliminar el registro?",
		text: "Una vez eliminado el registro no puede ser recuperado!",
		icon: "warning",
		buttons: true,
		dangerMode: true,
	})
		.then((OK) => {
			if (OK) {
				$.ajax({
					url: "/eliminarProv/" + NIT_Prov,
					success: function(res) {
						console.log(res);
					}
				});
				swal("El registro fué eliminado satisfactoriamente", {
					icon: "success",
				}).then((ok) => {
					if (ok) {
						location.href = "/listarProv";
					}
				});
			} else {
				swal("El registro sigue guardado");
			}
		});
}
function eliminar(Cedula_Usu) {
	swal({
		title: "¿Esta seguro que desea Eliminar al Usuario?",
		text: "Una vez eliminado el Usuario no puede ser recuperado!",
		icon: "warning",
		buttons: true,
		dangerMode: true,
	})
		.then((OK) => {
			if (OK) {
				$.ajax({
					url: "/eliminarUsu/" + Cedula_Usu,
					success: function(res) {
						console.log(res);
					}
				});
				swal("El registro fué eliminado satisfactoriamente", {
					icon: "success",
				}).then((ok) => {
					if (ok) {
						location.href = "/listarUsu";
					}
				});
			} else {
				swal("El registro sigue guardado");
			}
		});
}