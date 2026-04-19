# Pruebas Automatizadas con SerenityBDD Screenplay

Este repositorio contiene el proyecto de pruebas automatizadas utilizando **SerenityBDD con Screenplay**, **Maven**, y **Java**. A continuación se describen los pasos para configurar el entorno local y ejecutar las pruebas.

## 1. Prerrequisitos

Antes de comenzar, asegúrate de tener configurado lo siguiente en tu máquina local:

- **Sistema operativo**: Windows 11
- **IDE**: [IntelliJ IDEA](https://www.jetbrains.com/idea/) versión 2024.2.4
- **SerenityBDD**: [IntelliJ IDEA](https://serenity-bdd.github.io/) versión 4.2.0
- **JDK**: Versión 17 (asegurarte de tenerlo configurado en la variable de entorno `JAVA_HOME`)
- **Maven**: Versión 3.9.9 (asegurarte de tenerlo en la variable de entorno `MAVEN_HOME`)

### Verificación de versiones instaladas

Para verificar las versiones correctas de **Java** y **Maven** instaladas, ejecutar los siguientes comandos en tu terminal:

```bash
mvn -version
java -version
```

## 2. Comandos de instalación

Para instalar las dependencias necesarias en tu máquina local, seguir los pasos a continuación:

**2.1 Clonar el repositorio**
```bash
git clone https://github.com/Christian1091/Automatizacion-E2E.git
cd Automatizacion-E2E
```

**2.2 Instalar dependencias del proyecto**
```bash
mvn install -DskipTests
```

## 3. Instrucciones para ejecutar los tests

**3.1 Ejecutar SerenityBDD modo interactivo**
- Abrir el directorio src/test/java/runners en IntelliJ IDEA.
- Dirigirse a la clase **RunnerTest**
- Clic derecho sobre la clase **RunnerTest** y seleccionar **Run 'RunnerTest'** para ejecutar las pruebas.

**3.2 Ejecutar SerenityBDD desde línea de comandos**
```bash
mvn clean verify -Dwebdriver.driver=firefox -Dheadless.mode=false -q
```

## 4. Información adicional

**Reportes** 

Se genera reportes en cucumber detallados de las pruebas ejecutadas, que puedes revisar para obtener información sobre el estado de cada prueba, los reportes se encuentran en el directorio **target/cucumber-reports/cucumber.html** dentro de tu proyecto.

**Ejecución de pruebas en CI**

Para que las pruebas se ejecuten automáticamente en GitHub Actions cada vez que se realice un push en la rama master o un pull request hacia la misma, se disparará automáticamente el flujo de trabajo de CI, que ejecutará la prueba en el navegador Firefox y en modo headless.

**Estructura del proyecto**
```markdown
├───.github
│   └───workflows
├───.idea
├───src
│   ├───main
│   │   └───java
│   │       ├───interfaces
│   │       ├───questions
│   │       └───tasks
│   └───test
│       ├───java
│       │   ├───helpers
│       │   ├───runners
│       │   └───stepDefinitions
│       └───resources
│           ├───data
│           └───features
└───target


