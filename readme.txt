Instrucciones paso a paso de ejecución

Tecnologías usadas 

- Sistema operativo: Windows 11
- IDE: IntelliJ IDEA versión 2024.2.4
- JDK: Versión 17
- Maven: Versión 3.9.9

Verificar las versiones instaladas ejecutando estos comandos:
- Maven: mvn -version
- Java: java -version

Instrucciones para ejecutar los test

Para ejecutar las pruebas automatizadas, seguir los pasos a continuación:

Ejecutar Serenity modo interactivo
- Ingresar al directorio directorio /src/test/java/runners y luego a la clase RunnerTest dar clic derecho sobre la clase. 
- Seleccionar Run 'RunnerTest' para ejecutar el proyecto
- El proyecto se ejecutara	

Ejecutar Serenity mediante línea de comandos
- mvn clean verify -Dwebdriver.driver=firefox -Dheadless.mode=true -q

Ejecutar CI
Cualquier push a la rama master o pull request hacia la misma disparará automáticamente el flujo de trabajo, que ejecutará las pruebas en el navegador de Firefox y en modo headless.