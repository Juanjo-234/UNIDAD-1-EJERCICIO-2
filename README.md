Este programa está diseñado para modelar y gestionar el inventario de botellas de **vino** utilizando programación orientada a objetos (por ejemplo, en Java).

A continuación se detalla exactamente lo que hace cada parte del programa:

* **Define la clase `Vino`:** Modela un vino específico conteniendo los atributos principales: la etiqueta o marca (`etiqueta`), el tipo de cepa (`varietal`), el precio por unidad (`precio`) y la cantidad de botellas disponibles en almacén (`stockBotellas`).
* **Valida el stock a través del constructor:** Asegura la integridad de los datos al exigir que el stock inicial de botellas no sea un valor negativo al momento de crear el objeto.
* **Controla las ventas (`venderBotellas`):** Permite descontar botellas del inventario tras una venta, verificando previamente que existan suficientes unidades disponibles para evitar stock negativo.
* **Actualiza la reposición (`reponerStock`):** Incrementa la cantidad de botellas en stock cuando se reabastece el producto.
* **Ejecuta la prueba (`main`):** Instancia un objeto de tipo `Vino` (por ejemplo, un Malbec o Cabernet Franc), simula una operación de venta y una de reposición, y finalmente muestra por consola el estado final y actualizado del inventario.
