# Mapa de archivos - Práctica #2

## Objetivo

Este archivo describe la función de los archivos principales usados para implementar la consulta ampliada de la Práctica #2.

## ProductoRepository.java

Ruta:

src/main/java/com/tienda/repository/ProductoRepository.java

Función:

Define la consulta ampliada que permite buscar productos activos aplicando filtros por categoría, texto en descripción, rango de precio y existencia mínima.

## ProductoService.java

Ruta:

src/main/java/com/tienda/service/ProductoService.java

Función:

Sirve como capa de negocio entre el controlador y el repositorio. Expone el método utilizado por el controlador para ejecutar la consulta de la práctica.

## ConsultaController.java

Ruta:

src/main/java/com/tienda/controller/ConsultaController.java

Función:

Recibe las solicitudes desde la página web, carga las categorías disponibles, procesa los filtros ingresados por el usuario y envía los resultados a la vista.

## consultas/fragmentos.html

Ruta:

src/main/resources/templates/consultas/fragmentos.html

Función:

Contiene los fragmentos visuales de la pantalla de consultas, incluyendo el formulario de la Práctica #2 y la tabla de resultados.

## consultas/listado.html

Ruta:

src/main/resources/templates/consultas/listado.html

Función:

Es la página principal de consultas. Carga los fragmentos necesarios para mostrar el formulario y los resultados.
