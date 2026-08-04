# Resumen final - Práctica #2

## Proyecto

Proyecto tienda desarrollado con Spring Boot, Thymeleaf, Bootstrap, JPA, Maven y MySQL.

## Objetivo de la práctica

Agregar al proyecto tienda una consulta ampliada que permita filtrar información desde una página web.

## Consulta implementada

Se implementó una consulta ampliada sobre productos.

La consulta permite filtrar por:

- Categoría
- Texto en descripción
- Precio inferior
- Precio superior
- Existencia mínima
- Productos activos

## Ruta de ejecución

La consulta se prueba desde:

http://localhost:8080/consultas/listado

## Flujo utilizado

La implementación sigue el patrón MVC:

1. La vista muestra el formulario de consulta.
2. El controlador recibe los filtros.
3. El servicio procesa la solicitud.
4. El repositorio ejecuta la consulta.
5. La base de datos retorna los productos.
6. La vista muestra los resultados.

## Archivos principales

- ProductoRepository.java
- ProductoService.java
- ConsultaController.java
- consultas/fragmentos.html
- consultas/listado.html

## Entrega

La entrega debe incluir:

- ZIP del proyecto sin la carpeta target
- Captura JPG de la consulta funcionando

## Conclusión

La Práctica #2 cumple con el objetivo de incorporar una consulta ampliada dentro del proyecto tienda, utilizando la estructura MVC vista en clase y aplicando filtros dinámicos sobre los productos registrados en la base de datos.
