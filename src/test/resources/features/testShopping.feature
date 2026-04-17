Feature: Realizar prueba funcional automatizada E2E de flujo de compra

  Scenario: Flujo de compra en Saucedemo
    Given El usuario abre la pagina de Saucedemo
    When Nos autenticamos en la pagina
    Then Agregar dos productos al carrito
    And Visualizar el carrito
    When Completar formulario de compra
    Then Finalizar la compra y verificar confirmacion
