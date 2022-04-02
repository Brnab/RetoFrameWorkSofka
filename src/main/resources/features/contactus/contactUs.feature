# language: es

  Característica: Contactarse con la pagina web
    Yo como usuario de la pagina
    Deseo porder comunicarte con ellos
  Para poder poner mis quejas


  Escenario: Envio de mensaje sin adjuntar archivo

    Dado que me encuentro en la pagina web
    Cuando lleno la informacion pertinente, sin adjuntar un archivo
    Entonces el sistema debe mostrar que mi mensaje fue enviado.


Escenario: Envio de mensaje sin enviar codigo de referencia
  Dado que ya me encuentro en la pagina web
  Cuando Lleno la informacion solicitada menos adjuntar archivo ni colocar numero de referencia
  Entonces el sistema deberia mostrar que el mensaje fue enviado


