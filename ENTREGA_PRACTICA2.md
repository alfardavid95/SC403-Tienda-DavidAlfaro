# Entrega Práctica #2

## Descripción

Este proyecto corresponde a la Práctica #2 del curso Desarrollo de Aplicaciones Web y Patrones.

Se implementó una consulta ampliada sobre la tabla de productos del proyecto tienda, utilizando también la relación con la entidad categoría.

## Consulta implementada

La consulta permite filtrar productos activos por los siguientes criterios:

- Categoría
- Texto en la descripción
- Precio inferior
- Precio superior
- Existencia mínima

## Ruta de prueba

Para probar la consulta se debe ejecutar el proyecto y acceder a:

http://localhost:8080/consultas/listado

## Valores sugeridos para la prueba

- Categoría: Todas las categorías
- Texto en descripción: Monitor
- Precio inferior: 10000
- Precio superior: 80000
- Existencia mínima: 1

## Archivos principales modificados

- src/main/java/com/tienda/repository/ProductoRepository.java
- src/main/java/com/tienda/service/ProductoService.java
- src/main/java/com/tienda/controller/ConsultaController.java
- src/main/resources/templates/consultas/fragmentos.html
- src/main/resources/templates/consultas/listado.html

## Evidencia requerida

Para la entrega se debe adjuntar:

- Proyecto comprimido sin la carpeta target
- Captura JPG mostrando la consulta ejecutándose en el navegador
