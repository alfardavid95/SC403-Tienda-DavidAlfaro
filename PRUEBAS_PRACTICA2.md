# Pruebas manuales - Práctica #2

## Objetivo de las pruebas

Verificar que la consulta ampliada de productos funcione correctamente desde la interfaz web del proyecto tienda.

## Ruta principal

http://localhost:8080/consultas/listado

## Prueba 1 - Cargar pantalla de consultas

Pasos:

1. Ejecutar el proyecto desde NetBeans.
2. Abrir el navegador.
3. Ingresar a la ruta de consultas.

Resultado esperado:

La página debe mostrar el formulario de Práctica #2 y la tabla de resultados.

## Prueba 2 - Buscar productos por texto

Datos de prueba:

- Texto en descripción: Monitor

Resultado esperado:

La consulta debe mostrar productos activos cuya descripción contenga la palabra indicada.

## Prueba 3 - Buscar productos por rango de precio

Datos de prueba:

- Precio inferior: 10000
- Precio superior: 80000

Resultado esperado:

La consulta debe mostrar productos activos dentro del rango de precio indicado.

## Prueba 4 - Buscar productos por existencia mínima

Datos de prueba:

- Existencia mínima: 1

Resultado esperado:

La consulta debe mostrar únicamente productos con existencia igual o superior al valor ingresado.

## Prueba 5 - Consulta combinada

Datos de prueba:

- Categoría: Todas las categorías
- Texto en descripción: Monitor
- Precio inferior: 10000
- Precio superior: 80000
- Existencia mínima: 1

Resultado esperado:

La consulta debe aplicar todos los filtros y mostrar únicamente los productos que cumplan con todos los criterios.
