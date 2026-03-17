1.Mantener el constructor completo que recibe:
 • nombre (String)
 • salario (double)
 • horasSemanales (int)

2.Este constructor debe seguir validando:
 • el salario sea mayor o igual que 0
 • las horasSemanales estén entre 1 y 40
 • Si alguno de los valores no es válido, debe asignarse automáticamente el valor 0.
3.Añadir dos constructores sobrecargados:
 • Uno que permita crear un empleado indicando nombre y salario. En este caso, 
   horasSemanales debe tomar el valor 40 por defecto.
 • Otro que permita crear un empleado indicando solo el nombre. En este caso, salario 
   debe valer 0 y horasSemanales debe valer 40.
4.Crear una segunda clase llamada Ej03 que contenga el método main. Este método debe:
 • crear un empleado con los valores: "Ana", 1800, 38
 • crear un empleado con los valores: "Luis", 1200
 • crear un empleado con los valores: "Marta"
 • mostrar por pantalla sus datos
