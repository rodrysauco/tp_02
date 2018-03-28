# tp_02 Patron Observer

El ciclo de este patron comienza cuando se modifica un valor en la clase que extiende Observable. Al modificar el valor, mediante el metodo notifyObservers() notifica al observador que cambio el valor y entre parentesis manda los parametros que cambio (puede mandar el mismo objeto mediante el metodo clone, o cualquier otro dato relevante). El Observer recibe el cambio y toma la decision de que hacer.

En el metodo update, el Observer recibe como primer parametro el objeto desde el cual fue llamado, y en el segundo parametro recibe que cambió. Puede ser:

-Una copia del objeto antes de cambiar para comparar que fue lo que cambió.

-El valor que cambió, ya sea en una variable como en una coleccion de datos.

El metodo se ejecuta cuando se hace el llamado notifyObserver()
