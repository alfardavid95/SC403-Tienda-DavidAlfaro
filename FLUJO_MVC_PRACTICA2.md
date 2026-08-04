# Flujo MVC - Práctica #2

## Objetivo

Este documento explica el flujo MVC utilizado en la consulta ampliada de productos de la Práctica #2.

## Vista

La vista se encuentra en:

src/main/resources/templates/consultas/listado.html

Esta página carga los fragmentos visuales necesarios para mostrar el formulario de búsqueda y la tabla de resultados.

El formulario permite al usuario ingresar los filtros de búsqueda.

## Fragmentos

Los fragmentos se encuentran en:

src/main/resources/templates/consultas/fragmentos.html

En este archivo se define la estructura visual del formulario de Práctica #2 y la presentación de los productos encontrados.

## Controlador

El controlador se encuentra en:

src/main/java/com/tienda/controller/ConsultaController.java

Este archivo recibe la solicitud enviada desde la vista, captura los filtros ingresados por el usuario y solicita al servicio la ejecución de la consulta.

## Servicio

El servicio se encuentra en:

src/main/java/com/tienda/service/ProductoService.java

Este archivo funciona como intermediario entre el controlador y el repositorio. Su función es mantener separado el acceso a datos de la lógica de presentación.

## Repositorio

El repositorio se encuentra en:

src/main/java/com/tienda/repository/ProductoRepository.java

Este archivo contiene la consulta que se comunica con la base de datos para obtener los productos que cumplen con los filtros definidos.

## Base de datos

La base de datos utilizada es:

techshop

La consulta obtiene información de los productos registrados y aprovecha la relación entre producto y categoría.

## Resumen del flujo

1. El usuario ingresa a /consultas/listado.
2. La vista muestra el formulario de búsqueda.
3. El usuario ingresa los filtros.
4. El controlador recibe los parámetros.
5. El servicio solicita la consulta.
6. El repositorio consulta la base de datos.
7. Los resultados regresan al controlador.
8. La vista muestra los productos encontrados.
