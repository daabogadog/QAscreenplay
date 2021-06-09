# language: es

  Característica: Realizar compras de articulos
    Como un nuevo cliente
    Quiero ingresar a la pagina www.abc.com
    Para realizar una compra de un articulo

  @EscenarioUno
  Escenario: Agregar articulos al carrito de compras
    Dado que un nuevo cliente accede hasta a web de compras
    Cuando el agrega 3 unidades de 1103713365 de Desarrollo.2021 al carro
    Entonces el ve los productors lsitados en el carro de compras

  @EscenarioDos
  Esquema del escenario: Agregar articulos al carrito de compras
    Dado que un nuevo cliente accede hasta la web de compras
    Cuando el agraga productos al carro
      |<nombreProducoto>|<cantidadAgregar>|
    Entonces l ve los productos listados en el carro de compras

    Ejemplos:
    |nombreProducoto|cantidadAgregar|
    |Tapabocas N95  |100            |
