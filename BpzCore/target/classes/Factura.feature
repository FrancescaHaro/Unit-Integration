
Feature: Mantenimiento de Factura
  Yo como Personal de Cuentas por Pagar deseo gestionar facturas, para tener un mejor 
  manejo de la informacion.

  @tag1
 Scenario: Registrar Factura
		Given despues de iniciar sesion en la aplicacion
		When 	hago clic en el enlace de Facturas
		And 	luego hago clic en el boton de Registro
		And 	en la nueva pantalla escribo en campo codigo el valor de "1234"
		And 	en la nueva pantalla escribo en campo fecha facturacion el valor de "2018-09-26"
		And 	en la nueva pantalla escribo en campo fecha vencimiento el valor de "2018-10-26"
		And 	en la nueva pantalla escribo en campo moneda el valor de "soles"
		And 	en la nueva pantalla escribo en campo precio el valor de "1000"		
		And 	en la nueva pantalla escribo en campo proveedorId el valor de "1"
		And 	presiono el boton de Guardar
		Then 	el sistema me muestra el mensaje de "Se registro correctamente la Factura"

  Scenario: Actualizar Factura
		Given despues de iniciar sesion en la aplicacion
		When 	hago clic en el enlace de Facturas
		And 	busco la factura de codigo "1234" para seleccionarla
		And 	luego hago clic en el boton de Editar
		And 	en la nueva pantalla escribo en campo codigo el valor de "4321"
		And 	en la nueva pantalla escribo en campo fecha facturacion el valor de "2018-09-28"
		And 	en la nueva pantalla escribo en campo fecha vencimiento el valor de "2018-10-28"
		And 	en la nueva pantalla escribo en campo moneda el valor de "dolares"
		And 	en la nueva pantalla escribo en campo precio el valor de "2000"		
		And 	en la nueva pantalla escribo en campo proveedorId el valor de "2"
		And 	presiono el boton de Guardar
		Then 	el sistema me muestra el mensaje de "Se actualizo correctamente la Factura"
		
	Scenario: Actualizar FacturaID
		Given despues de iniciar sesion en la aplicacion
		When 	hago clic en el enlace de Facturas
		And 	busco la factura de id "1" para seleccionarla
		And 	luego hago clic en el boton de Editar
		And 	en la nueva pantalla escribo en campo codigo el valor de "4321"
		And 	en la nueva pantalla escribo en campo fecha facturacion el valor de "2018-09-28"
		And 	en la nueva pantalla escribo en campo fecha vencimiento el valor de "2018-10-28"
		And 	en la nueva pantalla escribo en campo moneda el valor de "dolares"
		And 	en la nueva pantalla escribo en campo precio el valor de "2000"		
		And 	en la nueva pantalla escribo en campo proveedorId el valor de "2"
		And 	presiono el boton de Guardar
		Then 	el sistema me muestra el mensaje de "Se actualizo correctamente la Factura"
 
  Scenario: Listar Factura
		Given despues de iniciar sesion en la aplicacion
		When 	hago clic en el enlace de Facturas
		Then 	la nueva pantalla muestra la lista de facturas
 
  Scenario: Eliminar Factura
		Given despues de iniciar sesion en la aplicacion
		When 	hago clic en el enlace de Facturas
		Then  la nueva pantalla muestra la lista de facturas
		When  hago clic en el boton de Eliminar de la factura con el id "1" 
		Then  el sistema muestra el mensaje de "Se elimino la Factura" 