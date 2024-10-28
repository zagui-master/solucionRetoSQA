@Regresion
Feature:Como usuario de la plataforma Floristería Mundo Flor,
  Quiero poder agregar productos al carrito de compras y también poder eliminarlos.

  Background: Validar el agregado y eliminación de productos del carrito de compra
    Given el usuario se encuentra en la página principal del sitio web Floristería Mundo Flor

  @Scenario1
  Scenario Outline: 01 - el usuario puede agregar un producto de la cartegoria amor
    When el usuariom seleccione la categoria amor
    Then el usuario selecciona un producto <producto> de la categoria amor
    And el usuario valida que el producto correcto
    Then el usuario agrega el producto
    And el usuario puede ver el producto seleecionado en el carrito de compra
    Examples:
      | producto |
      | MDF 0001 |
  @Scenario2
  Scenario Outline: 02 - el usuario puede agregar dos producto de la cartegoria cumpleaños
    When el usuariom seleccione la categoria cumpleaños
    Then el usuario selecciona el primer producto <producto_1> de la categoria cumpleaños
    And el usuario valida que el producto correcto
    Then el usuario agrega el segundo producto <producto_2>
    And el usuario puede ver el producto seleecionado en el carrito de compra
    Examples:
      | producto_1 | producto_2 |
      | MDF 0001   | MDF 00010  |

