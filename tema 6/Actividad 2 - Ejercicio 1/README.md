Enunciado del Ejercicio: "El Gremio de Aventureros"

Contexto: Estás programando el sistema de gestión de un Gremio de Aventureros. Cada vez que un héroe completa una misión, gana oro, pero por ley debe pagar un "impuesto" del 20% que va directamente al tesoro común del Gremio. Además, el Gremio necesita saber en todo momento cuántos miembros tiene registrados.

Crea un proyecto llamado "GremioAventureros" con la clase Aventurero con las siguientes características:

1. Atributos de Instancia (propios de cada objeto):
nombre (de tipo String).
oroPersonal (de tipo int), por defecto a 0.
2. Atributos Estáticos (compartidos por toda la clase):
totalMiembros (de tipo int), por defecto a 0. Llevará la cuenta de cuántos aventureros hay.
tesoroGremio (de tipo int), por defecto a 0. Almacenará el oro compartido.
3. Métodos de Instancia:
unirseAlGremio(): Suma 1 al atributo estático totalMiembros e imprime por pantalla: "¡[Nombre] se ha unido al Gremio!".
completarMision(int recompensa): Calcula el 20% de la recompensa (será el impuesto). Suma ese impuesto al tesoroGremio (estático) y el resto de la recompensa se lo suma a su oroPersonal (instancia). Imprime por pantalla un desglose de lo ganado y lo pagado en impuestos.
  4. Métodos Estáticos:
mostrarEstadoGremio(): Al ser estático, no usa el nombre de ningún aventurero. Solo debe imprimir una cabecera y mostrar los valores de totalMiembros y tesoroGremio.
5. Programa Principal (Main):
Crea dos o tres aventureros y asígnales un nombre.
Haz que llamen a su método unirseAlGremio().
Manda a los aventureros a varias misiones usando completarMision(...) con diferentes cantidades de oro.
Llama al método mostrarEstadoGremio() de la clase para comprobar que el tesoro común y el contador de miembros han sumado correctamente los datos de todos los objetos.