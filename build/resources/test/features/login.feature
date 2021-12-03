Feature: Login con usuario y clave correcta

  @loginCorrecto
  Scenario: Usuario es capaz de ingresar a la pagina
    Given que el usuario se encuentre en la pagina principal
    When ingrese usuario y clave
    Then el usuario visualiza su nombre en la pagina


