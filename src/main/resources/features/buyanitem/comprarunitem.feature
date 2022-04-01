# language: es
Característica: Comprar un articulo
  Yo como usuario ya registrado de la pagina
  Quiero poder anadir un objeto al carrito y proceder a comprarlo
  para asi poder tenerlo en mi poder

  Escenario: Compra exitosa por transferencia bancaria

    Dado que ya realice el proceso de registro
    Cuando cuando realice todos los pasos y seleccione pago por transferencia
    Entonces deberia recibir un mensaje de confirmacion por parte de la pagina

Escenario: Compra exitosa por cheque

  Dado que ya realice el proceso de registro previamente
  Cuando realice todos los pasos necesarios y selecciono el metodo de pago por cheque
  Entonces deberia  recibir un mensaje de que elegi el metodo de pago por cheque
