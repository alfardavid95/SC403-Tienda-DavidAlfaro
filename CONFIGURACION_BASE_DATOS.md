# Configuración de base de datos

## Objetivo

Este documento resume la configuración necesaria para que el proyecto tienda pueda conectarse correctamente a la base de datos MySQL utilizada en la Práctica #2.

## Motor de base de datos

El proyecto utiliza MySQL como motor de base de datos.

La base de datos esperada por la aplicación es:

techshop

## Archivo de configuración

La configuración principal se encuentra en:

src/main/resources/application.properties

Este archivo contiene la información necesaria para que Spring Boot pueda conectarse a MySQL.

## Propiedades principales

Las propiedades más importantes son:

- spring.datasource.url
- spring.datasource.username
- spring.datasource.password
- spring.datasource.driver-class-name

## Consideraciones importantes

Antes de ejecutar el proyecto se debe verificar que:

1. MySQL esté iniciado.
2. La base de datos techshop exista.
3. Las tablas necesarias hayan sido creadas.
4. El usuario configurado tenga permisos sobre la base de datos.
5. La contraseña local no se exponga innecesariamente en repositorios públicos.

## Relación con la Práctica #2

La consulta ampliada de productos depende de la información almacenada en la base de datos.

Los filtros de categoría, descripción, precio y existencia mínima consultan directamente los datos registrados en las tablas del proyecto tienda.
