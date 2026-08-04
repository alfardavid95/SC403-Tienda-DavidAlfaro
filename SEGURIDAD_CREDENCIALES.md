# Seguridad de credenciales

## Objetivo

Este documento resume las buenas prácticas aplicadas para evitar exponer credenciales locales dentro del proyecto tienda.

## Archivo sensible

El archivo principal donde se configura la conexión a la base de datos es:

src/main/resources/application.properties

Este archivo puede contener datos sensibles como:

- Usuario de base de datos
- Contraseña de base de datos
- URL de conexión
- Datos de servicios externos

## Recomendación

No se deben publicar contraseñas reales en repositorios públicos.

Para un ambiente local, cada estudiante puede configurar su propia contraseña de MySQL directamente en su entorno de trabajo.

## Archivos ignorados

El archivo .gitignore del proyecto evita subir archivos sensibles o generados automáticamente, como:

- target/
- .env
- *.json
- *.pem
- *.key
- Archivos privados del IDE

## Relación con la Práctica #2

La consulta ampliada de la Práctica #2 necesita conectarse a la base de datos techshop.

Por esta razón, es importante configurar correctamente la conexión local sin exponer credenciales personales en el repositorio.

## Conclusión

La seguridad de credenciales es una parte importante del desarrollo web, especialmente cuando el proyecto se comparte mediante GitHub.
