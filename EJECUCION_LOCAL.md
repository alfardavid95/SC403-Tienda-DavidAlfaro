# Ejecución local del proyecto tienda

## Objetivo

Este documento describe los pasos básicos para ejecutar localmente el proyecto tienda y probar la consulta ampliada de la Práctica #2.

## Requisitos previos

Antes de ejecutar el proyecto se debe contar con:

- Java instalado
- NetBeans instalado
- MySQL instalado
- MySQL Workbench instalado
- Base de datos techshop creada
- Proyecto tienda abierto en NetBeans

## Base de datos

El proyecto utiliza la base de datos:

techshop

Antes de ejecutar la aplicación se debe verificar que MySQL esté activo y que la base de datos exista.

## Archivo de configuración

La conexión a la base de datos se define en:

src/main/resources/application.properties

En este archivo se configuran los datos de conexión como:

- URL de la base de datos
- Usuario de MySQL
- Contraseña de MySQL
- Driver de conexión

## Ejecución desde NetBeans

Pasos:

1. Abrir NetBeans.
2. Abrir el proyecto tienda.
3. Verificar que no existan errores en el proyecto.
4. Ejecutar Clean and Build.
5. Ejecutar Run Project.
6. Esperar a que la consola indique que Tomcat inició correctamente.

## Ruta principal de la práctica

Una vez iniciado el proyecto, ingresar en el navegador a:

http://localhost:8080/consultas/listado

## Resultado esperado

La página debe mostrar el formulario de consulta ampliada de la Práctica #2 y permitir filtrar productos por categoría, descripción, precio y existencia mínima.
