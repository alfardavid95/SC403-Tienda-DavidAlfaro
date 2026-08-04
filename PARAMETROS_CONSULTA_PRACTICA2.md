# Parámetros de consulta - Práctica #2

## Objetivo

Este documento describe los parámetros utilizados en la consulta ampliada de productos implementada para la Práctica #2.

## Categoría

Permite filtrar los productos según la categoría a la que pertenecen.

Este filtro utiliza la relación entre Producto y Categoría, permitiendo seleccionar productos asociados a una categoría específica.

Cuando se selecciona la opción de todas las categorías, la consulta no limita los resultados por categoría.

## Texto en descripción

Permite buscar productos que contengan una palabra o fragmento de texto dentro de su descripción.

Este filtro facilita encontrar productos por coincidencias parciales, por ejemplo:

Monitor

Con este valor, la consulta debe retornar productos activos cuya descripción incluya ese texto.

## Precio inferior

Define el precio mínimo permitido dentro de la búsqueda.

Los productos con precio menor al valor indicado no deben aparecer en los resultados.

## Precio superior

Define el precio máximo permitido dentro de la búsqueda.

Los productos con precio mayor al valor indicado no deben aparecer en los resultados.

## Existencia mínima

Define la cantidad mínima de unidades disponibles que debe tener un producto.

Este filtro permite mostrar únicamente productos con inventario suficiente.

## Producto activo

La consulta está pensada para mostrar únicamente productos activos.

Esto evita mostrar productos deshabilitados o que no deberían aparecer en el catálogo visible de la tienda.

## Combinación de filtros

La consulta permite combinar todos los filtros anteriores en una sola búsqueda.

Ejemplo recomendado:

- Categoría: Todas las categorías
- Texto en descripción: Monitor
- Precio inferior: 10000
- Precio superior: 80000
- Existencia mínima: 1

Resultado esperado:

La aplicación debe mostrar únicamente productos activos que cumplan con todos los criterios indicados.
