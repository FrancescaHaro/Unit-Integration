$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Factura.feature");
formatter.feature({
  "line": 2,
  "name": "Mantenimiento de Factura",
  "description": "Yo como Personal de Cuentas por Pagar deseo gestionar facturas, para tener un mejor \nmanejo de la informacion.",
  "id": "mantenimiento-de-factura",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Registrar Factura",
  "description": "",
  "id": "mantenimiento-de-factura;registrar-factura",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "despues de iniciar sesion en la aplicacion",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "hago clic en el enlace de Facturas",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "luego hago clic en el boton de Registro",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "en la nueva pantalla escribo en campo codigo el valor de \"1234\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "en la nueva pantalla escribo en campo fecha facturacion el valor de \"2018-09-26\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "en la nueva pantalla escribo en campo fecha vencimiento el valor de \"2018-10-26\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "en la nueva pantalla escribo en campo moneda el valor de \"soles\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "en la nueva pantalla escribo en campo precio el valor de \"1000\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "en la nueva pantalla escribo en campo proveedorId el valor de \"1\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "presiono el boton de Guardar",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "el sistema me muestra el mensaje de \"Se registro correctamente la Factura\"",
  "keyword": "Then "
});
formatter.match({
  "location": "FacturaIntegrationTest.despues_de_iniciar_sesion_en_la_aplicacion()"
});
formatter.result({
  "duration": 492456985,
  "status": "passed"
});
formatter.match({
  "location": "FacturaIntegrationTest.hago_clic_en_el_enlace_de_Facturas()"
});
formatter.result({
  "duration": 162556,
  "status": "passed"
});
formatter.match({
  "location": "FacturaIntegrationTest.luego_hago_clic_en_el_boton_de_Registro()"
});
formatter.result({
  "duration": 168904,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234",
      "offset": 58
    }
  ],
  "location": "FacturaIntegrationTest.en_la_nueva_pantalla_escribo_en_campo_codigo_el_valor_de(String)"
});
formatter.result({
  "duration": 3294152,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2018-09-26",
      "offset": 69
    }
  ],
  "location": "FacturaIntegrationTest.en_la_nueva_pantalla_escribo_en_campo_fecha_facturacion_el_valor_de(String)"
});
formatter.result({
  "duration": 71581,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2018-10-26",
      "offset": 69
    }
  ],
  "location": "FacturaIntegrationTest.en_la_nueva_pantalla_escribo_en_campo_fecha_vencimiento_el_valor_de(String)"
});
formatter.result({
  "duration": 69113,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "soles",
      "offset": 58
    }
  ],
  "location": "FacturaIntegrationTest.en_la_nueva_pantalla_escribo_en_campo_moneda_el_valor_de(String)"
});
formatter.result({
  "duration": 69818,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1000",
      "offset": 58
    }
  ],
  "location": "FacturaIntegrationTest.en_la_nueva_pantalla_escribo_en_campo_precio_el_valor_de(String)"
});
formatter.result({
  "duration": 73344,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 63
    }
  ],
  "location": "FacturaIntegrationTest.en_la_nueva_pantalla_escribo_en_campo_proveedorId_el_valor_de(String)"
});
formatter.result({
  "duration": 68408,
  "status": "passed"
});
formatter.match({
  "location": "FacturaIntegrationTest.presiono_el_boton_de_Guardar()"
});
formatter.result({
  "duration": 418895355,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Se registro correctamente la Factura",
      "offset": 37
    }
  ],
  "location": "FacturaIntegrationTest.el_sistema_me_muestra_el_mensaje_de(String)"
});
formatter.result({
  "duration": 75108,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Actualizar Factura",
  "description": "",
  "id": "mantenimiento-de-factura;actualizar-factura",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "despues de iniciar sesion en la aplicacion",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "hago clic en el enlace de Facturas",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "busco la factura de codigo \"1234\" para seleccionarla",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "luego hago clic en el boton de Editar",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "en la nueva pantalla escribo en campo codigo el valor de \"4321\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "en la nueva pantalla escribo en campo fecha facturacion el valor de \"2018-09-28\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "en la nueva pantalla escribo en campo fecha vencimiento el valor de \"2018-10-28\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "en la nueva pantalla escribo en campo moneda el valor de \"dolares\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "en la nueva pantalla escribo en campo precio el valor de \"2000\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "en la nueva pantalla escribo en campo proveedorId el valor de \"2\"",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "presiono el boton de Guardar",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "el sistema me muestra el mensaje de \"Se actualizo correctamente la Factura\"",
  "keyword": "Then "
});
formatter.match({
  "location": "FacturaIntegrationTest.despues_de_iniciar_sesion_en_la_aplicacion()"
});
formatter.result({
  "duration": 551494,
  "status": "passed"
});
formatter.match({
  "location": "FacturaIntegrationTest.hago_clic_en_el_enlace_de_Facturas()"
});
formatter.result({
  "duration": 113190,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234",
      "offset": 28
    }
  ],
  "location": "FacturaIntegrationTest.busco_la_factura_de_codigo_para_seleccionarla(String)"
});
formatter.result({
  "duration": 37609466,
  "status": "passed"
});
formatter.match({
  "location": "FacturaIntegrationTest.luego_hago_clic_en_el_boton_de_Editar()"
});
formatter.result({
  "duration": 143162,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4321",
      "offset": 58
    }
  ],
  "location": "FacturaIntegrationTest.en_la_nueva_pantalla_escribo_en_campo_codigo_el_valor_de(String)"
});
formatter.result({
  "duration": 76871,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2018-09-28",
      "offset": 69
    }
  ],
  "location": "FacturaIntegrationTest.en_la_nueva_pantalla_escribo_en_campo_fecha_facturacion_el_valor_de(String)"
});
formatter.result({
  "duration": 61002,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2018-10-28",
      "offset": 69
    }
  ],
  "location": "FacturaIntegrationTest.en_la_nueva_pantalla_escribo_en_campo_fecha_vencimiento_el_valor_de(String)"
});
formatter.result({
  "duration": 59239,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dolares",
      "offset": 58
    }
  ],
  "location": "FacturaIntegrationTest.en_la_nueva_pantalla_escribo_en_campo_moneda_el_valor_de(String)"
});
formatter.result({
  "duration": 58181,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2000",
      "offset": 58
    }
  ],
  "location": "FacturaIntegrationTest.en_la_nueva_pantalla_escribo_en_campo_precio_el_valor_de(String)"
});
formatter.result({
  "duration": 77223,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 63
    }
  ],
  "location": "FacturaIntegrationTest.en_la_nueva_pantalla_escribo_en_campo_proveedorId_el_valor_de(String)"
});
formatter.result({
  "duration": 59945,
  "status": "passed"
});
formatter.match({
  "location": "FacturaIntegrationTest.presiono_el_boton_de_Guardar()"
});
formatter.result({
  "duration": 94995830,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Se actualizo correctamente la Factura",
      "offset": 37
    }
  ],
  "location": "FacturaIntegrationTest.el_sistema_me_muestra_el_mensaje_de(String)"
});
formatter.result({
  "duration": 68055,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "Actualizar FacturaID",
  "description": "",
  "id": "mantenimiento-de-factura;actualizar-facturaid",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 35,
  "name": "despues de iniciar sesion en la aplicacion",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "hago clic en el enlace de Facturas",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "busco la factura de id \"1\" para seleccionarla",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "luego hago clic en el boton de Editar",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "en la nueva pantalla escribo en campo codigo el valor de \"4321\"",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "en la nueva pantalla escribo en campo fecha facturacion el valor de \"2018-09-28\"",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "en la nueva pantalla escribo en campo fecha vencimiento el valor de \"2018-10-28\"",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "en la nueva pantalla escribo en campo moneda el valor de \"dolares\"",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "en la nueva pantalla escribo en campo precio el valor de \"2000\"",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "en la nueva pantalla escribo en campo proveedorId el valor de \"2\"",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "presiono el boton de Guardar",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "el sistema me muestra el mensaje de \"Se actualizo correctamente la Factura\"",
  "keyword": "Then "
});
formatter.match({
  "location": "FacturaIntegrationTest.despues_de_iniciar_sesion_en_la_aplicacion()"
});
formatter.result({
  "duration": 493312,
  "status": "passed"
});
formatter.match({
  "location": "FacturaIntegrationTest.hago_clic_en_el_enlace_de_Facturas()"
});
formatter.result({
  "duration": 131173,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 24
    }
  ],
  "location": "FacturaIntegrationTest.busco_la_factura_de_id_para_seleccionarla(String)"
});
formatter.result({
  "duration": 9142311,
  "status": "passed"
});
formatter.match({
  "location": "FacturaIntegrationTest.luego_hago_clic_en_el_boton_de_Editar()"
});
formatter.result({
  "duration": 229907,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4321",
      "offset": 58
    }
  ],
  "location": "FacturaIntegrationTest.en_la_nueva_pantalla_escribo_en_campo_codigo_el_valor_de(String)"
});
formatter.result({
  "duration": 66292,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2018-09-28",
      "offset": 69
    }
  ],
  "location": "FacturaIntegrationTest.en_la_nueva_pantalla_escribo_en_campo_fecha_facturacion_el_valor_de(String)"
});
formatter.result({
  "duration": 64529,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2018-10-28",
      "offset": 69
    }
  ],
  "location": "FacturaIntegrationTest.en_la_nueva_pantalla_escribo_en_campo_fecha_vencimiento_el_valor_de(String)"
});
formatter.result({
  "duration": 70170,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dolares",
      "offset": 58
    }
  ],
  "location": "FacturaIntegrationTest.en_la_nueva_pantalla_escribo_en_campo_moneda_el_valor_de(String)"
});
formatter.result({
  "duration": 82160,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2000",
      "offset": 58
    }
  ],
  "location": "FacturaIntegrationTest.en_la_nueva_pantalla_escribo_en_campo_precio_el_valor_de(String)"
});
formatter.result({
  "duration": 79691,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 63
    }
  ],
  "location": "FacturaIntegrationTest.en_la_nueva_pantalla_escribo_en_campo_proveedorId_el_valor_de(String)"
});
formatter.result({
  "duration": 70170,
  "status": "passed"
});
formatter.match({
  "location": "FacturaIntegrationTest.presiono_el_boton_de_Guardar()"
});
formatter.result({
  "duration": 76620585,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Se actualizo correctamente la Factura",
      "offset": 37
    }
  ],
  "location": "FacturaIntegrationTest.el_sistema_me_muestra_el_mensaje_de(String)"
});
formatter.result({
  "duration": 70171,
  "status": "passed"
});
formatter.scenario({
  "line": 48,
  "name": "Listar Factura",
  "description": "",
  "id": "mantenimiento-de-factura;listar-factura",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 49,
  "name": "despues de iniciar sesion en la aplicacion",
  "keyword": "Given "
});
formatter.step({
  "line": 50,
  "name": "hago clic en el enlace de Facturas",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "la nueva pantalla muestra la lista de facturas",
  "keyword": "Then "
});
formatter.match({
  "location": "FacturaIntegrationTest.despues_de_iniciar_sesion_en_la_aplicacion()"
});
formatter.result({
  "duration": 1382261,
  "status": "passed"
});
formatter.match({
  "location": "FacturaIntegrationTest.hago_clic_en_el_enlace_de_Facturas()"
});
formatter.result({
  "duration": 147041,
  "status": "passed"
});
formatter.match({
  "location": "FacturaIntegrationTest.la_nueva_pantalla_muestra_la_lista_de_facturas()"
});
formatter.result({
  "duration": 29547222,
  "status": "passed"
});
formatter.scenario({
  "line": 53,
  "name": "Eliminar Factura",
  "description": "",
  "id": "mantenimiento-de-factura;eliminar-factura",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 54,
  "name": "despues de iniciar sesion en la aplicacion",
  "keyword": "Given "
});
formatter.step({
  "line": 55,
  "name": "hago clic en el enlace de Facturas",
  "keyword": "When "
});
formatter.step({
  "line": 56,
  "name": "la nueva pantalla muestra la lista de facturas",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "hago clic en el boton de Eliminar de la factura con el id \"1\"",
  "keyword": "When "
});
formatter.step({
  "line": 58,
  "name": "el sistema muestra el mensaje de \"Se elimino la Factura\"",
  "keyword": "Then "
});
formatter.match({
  "location": "FacturaIntegrationTest.despues_de_iniciar_sesion_en_la_aplicacion()"
});
formatter.result({
  "duration": 454877,
  "status": "passed"
});
formatter.match({
  "location": "FacturaIntegrationTest.hago_clic_en_el_enlace_de_Facturas()"
});
formatter.result({
  "duration": 141399,
  "status": "passed"
});
formatter.match({
  "location": "FacturaIntegrationTest.la_nueva_pantalla_muestra_la_lista_de_facturas()"
});
formatter.result({
  "duration": 14256321,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 59
    }
  ],
  "location": "FacturaIntegrationTest.hago_clic_en_el_boton_de_Eliminar_de_la_factura_con_el_id(String)"
});
formatter.result({
  "duration": 83850299,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Se elimino la Factura",
      "offset": 34
    }
  ],
  "location": "FacturaIntegrationTest.el_sistema_muestra_el_mensaje_de(String)"
});
formatter.result({
  "duration": 76870,
  "status": "passed"
});
formatter.uri("Proveedor.feature");
formatter.feature({
  "line": 1,
  "name": "Mantenimiento de Proveedor",
  "description": "Yo como Personal de RRHH deseo gestionar proveedores, para tener un mejor \nmanejo de la informacion.",
  "id": "mantenimiento-de-proveedor",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Registrar Proveedor",
  "description": "",
  "id": "mantenimiento-de-proveedor;registrar-proveedor",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "luego de iniciar sesion en la aplicacion",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "hago clic en el enlace de Proveedores",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "luego hago click en el boton de Registro",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "en la nueva pantalla escribo en campo nombre el valor de \"Petro Peru\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "hago click en el boton de Guardar",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "el sistema me muestra un mensaje de \"Se registro correctamente el Proveedor\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ProveedorIntegrationTest.luego_de_iniciar_sesion_en_la_aplicacion()"
});
formatter.result({
  "duration": 4357293,
  "status": "passed"
});
formatter.match({
  "location": "ProveedorIntegrationTest.hago_clic_en_el_enlace_de_Proveedores()"
});
formatter.result({
  "duration": 131173,
  "status": "passed"
});
formatter.match({
  "location": "ProveedorIntegrationTest.luego_hago_click_en_el_boton_de_Registro()"
});
formatter.result({
  "duration": 116011,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Petro Peru",
      "offset": 58
    }
  ],
  "location": "ProveedorIntegrationTest.en_la_nueva_pantalla_escribo_en_campo_nombre_el_valor_de(String)"
});
formatter.result({
  "duration": 66292,
  "status": "passed"
});
formatter.match({
  "location": "ProveedorIntegrationTest.hago_click_en_el_boton_de_Guardar()"
});
formatter.result({
  "duration": 121101859,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 14,
  "name": "Actualizar Proveedor",
  "description": "",
  "id": "mantenimiento-de-proveedor;actualizar-proveedor",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "luego de iniciar sesion en la aplicacion",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "hago clic en el enlace de Proveedores",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "busco el Proveedor de nombre \"Petro Peru\" para seleccionarlo",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "luego hago click en el boton de Editar",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "en la nueva pantalla escribo en campo nombre el valor de \"Petro Peru SAC\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "hago click en el boton de Guardar",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "el sistema me muestra un mensaje de \"Se actualizo correctamente el Proveedor\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ProveedorIntegrationTest.luego_de_iniciar_sesion_en_la_aplicacion()"
});
formatter.result({
  "duration": 398810,
  "status": "passed"
});
formatter.match({
  "location": "ProveedorIntegrationTest.hago_clic_en_el_enlace_de_Proveedores()"
});
formatter.result({
  "duration": 121653,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Petro Peru",
      "offset": 30
    }
  ],
  "location": "ProveedorIntegrationTest.busco_el_Proveedor_de_nombre_para_seleccionarlo(String)"
});
formatter.result({
  "duration": 6755444,
  "status": "passed"
});
formatter.match({
  "location": "ProveedorIntegrationTest.luego_hago_click_en_el_boton_de_Editar()"
});
formatter.result({
  "duration": 162557,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Petro Peru SAC",
      "offset": 58
    }
  ],
  "location": "ProveedorIntegrationTest.en_la_nueva_pantalla_escribo_en_campo_nombre_el_valor_de(String)"
});
formatter.result({
  "duration": 61002,
  "status": "passed"
});
formatter.match({
  "location": "ProveedorIntegrationTest.hago_click_en_el_boton_de_Guardar()"
});
formatter.result({
  "duration": 7395444,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 23,
  "name": "Actualizar ProveedorId",
  "description": "",
  "id": "mantenimiento-de-proveedor;actualizar-proveedorid",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "luego de iniciar sesion en la aplicacion",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "hago clic en el enlace de Proveedores",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "busco el Proveedor de id \"1\" para seleccionarlo",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "luego hago click en el boton de Editar",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "en la nueva pantalla escribo en campo nombre el valor de \"Petro Peru SAC\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "hago click en el boton de Guardar",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "el sistema me muestra un mensaje de \"Se actualizo correctamente el Proveedor\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ProveedorIntegrationTest.luego_de_iniciar_sesion_en_la_aplicacion()"
});
formatter.result({
  "duration": 504949,
  "status": "passed"
});
formatter.match({
  "location": "ProveedorIntegrationTest.hago_clic_en_el_enlace_de_Proveedores()"
});
formatter.result({
  "duration": 155152,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 26
    }
  ],
  "location": "ProveedorIntegrationTest.busco_el_Proveedor_de_id_para_seleccionarlo(String)"
});
formatter.result({
  "duration": 14804288,
  "status": "passed"
});
formatter.match({
  "location": "ProveedorIntegrationTest.luego_hago_click_en_el_boton_de_Editar()"
});
formatter.result({
  "duration": 133994,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Petro Peru SAC",
      "offset": 58
    }
  ],
  "location": "ProveedorIntegrationTest.en_la_nueva_pantalla_escribo_en_campo_nombre_el_valor_de(String)"
});
formatter.result({
  "duration": 69818,
  "status": "passed"
});
formatter.match({
  "location": "ProveedorIntegrationTest.hago_click_en_el_boton_de_Guardar()"
});
formatter.result({
  "duration": 8205406,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 33,
  "name": "Listar Proveedor",
  "description": "",
  "id": "mantenimiento-de-proveedor;listar-proveedor",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 34,
  "name": "luego de iniciar sesion en la aplicacion",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "hago clic en el enlace de Proveedores",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "la nueva pantalla muestra la lista de Proveedores",
  "keyword": "Then "
});
formatter.match({
  "location": "ProveedorIntegrationTest.luego_de_iniciar_sesion_en_la_aplicacion()"
});
formatter.result({
  "duration": 489433,
  "status": "passed"
});
formatter.match({
  "location": "ProveedorIntegrationTest.hago_clic_en_el_enlace_de_Proveedores()"
});
formatter.result({
  "duration": 140695,
  "status": "passed"
});
formatter.match({
  "location": "ProveedorIntegrationTest.la_nueva_pantalla_muestra_la_lista_de_Proveedores()"
});
formatter.result({
  "duration": 5920093,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "Eliminar Proveedor",
  "description": "",
  "id": "mantenimiento-de-proveedor;eliminar-proveedor",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 39,
  "name": "luego de iniciar sesion en la aplicacion",
  "keyword": "Given "
});
formatter.step({
  "line": 40,
  "name": "hago clic en el enlace de Proveedores",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "la nueva pantalla muestra la lista de Proveedores",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "hago clic en el boton de Eliminar el Proveedor con el id \"1\"",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "el sistema muestra un mensaje de \"Se elimino el Proveedor\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ProveedorIntegrationTest.luego_de_iniciar_sesion_en_la_aplicacion()"
});
formatter.result({
  "duration": 390700,
  "status": "passed"
});
formatter.match({
  "location": "ProveedorIntegrationTest.hago_clic_en_el_enlace_de_Proveedores()"
});
formatter.result({
  "duration": 152331,
  "status": "passed"
});
formatter.match({
  "location": "ProveedorIntegrationTest.la_nueva_pantalla_muestra_la_lista_de_Proveedores()"
});
formatter.result({
  "duration": 8711765,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 58
    }
  ],
  "location": "ProveedorIntegrationTest.hago_clic_en_el_boton_de_Eliminar_el_Proveedor_con_el_id(String)"
});
formatter.result({
  "duration": 39352453,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Se elimino el Proveedor",
      "offset": 34
    }
  ],
  "location": "ProveedorIntegrationTest.el_sistema_muestra_un_mensaje_de(String)"
});
formatter.result({
  "duration": 134347,
  "status": "passed"
});
});