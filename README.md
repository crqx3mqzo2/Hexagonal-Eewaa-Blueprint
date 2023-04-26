## Hexagonal-Eewaa-Blueprint
Prueba de concepto de la arquitectura Hexagonal.

## Estructura de Carpetas y Paquetes
Este proyecto utiliza la arquitectura hexagonal para organizar sus componentes. A continuación se muestra una descripción de los paquetes utilizados en el proyecto:

application.entrypoints.rest: Este paquete contiene las clases encargadas de exponer los endpoints de la API REST. Aquí se encuentra la capa de adaptación de entrada que conecta la capa de dominio con la capa de presentación.
commons.utils: Este paquete contiene clases de utilidad que pueden ser utilizadas por cualquier componente del proyecto.
domain.adapter: Este paquete contiene las implementaciones de los adaptadores de puertos que se utilizan para comunicarse con la capa externa de la aplicación (como la base de datos, servicios externos, etc.).
domain.dtos: Este paquete contiene los objetos de transferencia de datos (DTO) que se utilizan para transferir datos entre las distintas capas de la aplicación.
domain.entities: Este paquete contiene las entidades de negocio que representan los objetos de dominio de la aplicación.
domain.interfaces: Este paquete contiene las interfaces de los puertos de entrada y salida del dominio. Estas interfaces definen los métodos que pueden ser utilizados por las capas externas para interactuar con el dominio.
domain.interfaces.repositories: Este paquete contiene las interfaces de los puertos de salida que se utilizan para comunicarse con la capa externa de persistencia (como una base de datos).
domain.services: Este paquete contiene las implementaciones de los servicios de negocio que utilizan las entidades y objetos de valor definidos en el dominio.
domain.services.interfaces: Este paquete contiene las interfaces de los servicios de negocio, que definen los métodos que pueden ser utilizados por otras capas de la aplicación para interactuar con el dominio.
Es importante mencionar que la distribución de carpetas y paquetes en la arquitectura hexagonal no tiene una forma única y depende del desarrollador. La estructura presentada aquí es solo una de las muchas posibles.

## Requisitos de configuración
Antes de utilizar este API, asegúrese de cumplir con los siguientes requisitos de configuración:

Base de datos: Para evitar errores de compilación, se recomienda cambiar la configuración de la base de datos en el archivo pom.xml a una base de datos H2. Puede hacer esto actualizando la dependencia de la base de datos en el archivo pom.xml y actualizando la configuración correspondiente en el archivo application.yml.

Puertos: Este API utiliza el puerto 9090 para los endpoints HTTP. Asegúrese de que este puerto esté disponible en su sistema antes de ejecutar el API.

## Requisitos de uso
Para utilizar este API, siga los siguientes pasos:

Ejecute el API: Para ejecutar el API, ejecute la clase Application.java en su entorno de desarrollo Java. El API estará disponible en http://localhost:9090.

Cree o modifique un cliente: Para crear un nuevo cliente, haga una solicitud POST a http://localhost:9090/api/clientes/create con el siguiente cuerpo de ejemplo:
{
  "id": 1,
  "companyName": "Example Company",
  "companyType": "Software",
  "companyAddress1": "123 Main St.",
  "companyAddress2": "Suite 456",
  "companyPhone1": "+1 (555) 555-5555",
  "companyPhone2": "+1 (555) 555-5556",
  "email": "example@example.com"
}

Para modificar un cliente existente, haga una solicitud POST a http://localhost:9090/api/clientes/modify con el mismo cuerpo de ejemplo.

Verifique la respuesta: Después de realizar una solicitud, verifique la respuesta para asegurarse de que se haya creado o modificado el cliente correctamente.


## Licencia

Este proyecto se distribuye bajo la Licencia GNU GPL v3.

La Licencia GNU GPL v3 permite a los usuarios utilizar, modificar y distribuir el software, siempre y cuando se cumplan ciertas condiciones, como la inclusión de una copia de la licencia en la distribución del software y la publicación del código fuente de cualquier software derivado bajo la misma licencia.

Para obtener más información sobre los términos y condiciones de la Licencia GNU GPL v3, consulte el archivo LICENSE.md en el repositorio.

Si desea utilizar, modificar o distribuir este software, asegúrese de cumplir con los términos y condiciones de la Licencia GNU GPL v3.
