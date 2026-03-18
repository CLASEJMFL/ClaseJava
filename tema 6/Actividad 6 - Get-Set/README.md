Seguimos actualizando la Actividad 3, para ello vamos a suponer que existen gestores que administran las cuentas bancarias y atienden a sus propietarios.
Cada cuenta, en caso de tenerlo, cuenta con un único gestor. Diseñar la clase Gestor de la que interesa guardar:
nombre
teléfono
importe máximo autorizado con el que pueden operar.
Con respecto a los gestores, existen las siguientes restricciones:
Un gestor tendrá siempre un nombre y un teléfono.
Si no se asigna, el importe máximo autorizado por operación será de 10 000 euros.
Un gestor, una vez asignado, no podrá cambiar su número de teléfono.
Todo el mundo podrá consultarlo.
El nombre será público y el importe máximo solo será visible por clases vecinas.
Modificar la clase CuentaCorriente para que pueda disponer de un objeto Gestor y los métodos necesarios.