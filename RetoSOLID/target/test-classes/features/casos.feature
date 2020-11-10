
@Cucumber
Feature: Pruebas Wong y Api

  este feature se trata de agregar un producto en el carrito en wong, validar
  el resultado al agregar ese producto a partir de su nombre y
  agregar un usuario en una api y validar
  el resultado al agregar ese usuario.

  @Regresion
  Scenario Outline: Validar Producto Agregado A Carrito Por Nombre
    Given Que Daniel entra en wong
    When Daniel agrega un producto con los datos: Email <email> Calle <calle> Numero <numero>
    Then Daniel deberia ver un texto: <mensaje>

    Examples:
      | Descripcion      | email                     | calle                            | numero | mensaje                                |
      | agregar producto | ingdaniel.alv95@gmail.com | Av. José Pardo, Miraflores, Perú | 1      | Pan Centeno Vollkorn Mestemacher 500 g |

  Scenario Outline: Registrar Usuario Api
    Given Que Daniel crea un usuario con los datos
    When Daniel valida la informacion del usuario
    Then Daniel ve registro exitoso

    Examples:
      | Descripcion      | nombre | apellido | genero    | email                     | status    |
      | agregar usuario  | Daniel | Alvarado | Masculino | ingdaniel.alv95@gmail.com | Candidate |