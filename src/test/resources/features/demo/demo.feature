# language: es
# encodig: utf-8
# Author:johnny.martinez@techandsolve.com

 Característica: Yo como usuario de la pagina que DemoQA
  Necesito poder iniciar sesión
  Para la demostración de como automazar pruebas funcionales

Escenario: Ingresar Demo QA para iniciar sesion en la aplicación web
 Dado que yo me encuentre la pagina de inicio de sesion
 Cuando cuando logre iniciar sesion con el usuario "DemoQA" y clave "Alejo123456.$"
 Entonces deberia ver mi usuario "DemoQA"