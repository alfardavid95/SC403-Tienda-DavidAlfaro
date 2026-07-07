# Práctica #2 - Proyecto tienda

## Consulta ampliada implementada

Se implementó una consulta ampliada sobre la tabla `producto`, usando también la relación con `categoria`.

La consulta permite filtrar productos activos por:

- Categoría
- Texto en la descripción del producto
- Precio inferior
- Precio superior
- Existencia mínima

Ruta para probarla en el navegador:

```text
http://localhost:8080/consultas/listado
```

Valores sugeridos para la captura:

```text
Categoría: Todas las categorías
Texto en descripción: Monitor
Precio inferior: 10000
Precio superior: 80000
Existencia mínima: 1
```

## Base de datos

El proyecto está configurado para conectarse a MySQL local con la base `techshop`.

Archivo de configuración:

```text
src/main/resources/application.properties
```

Archivo SQL incluido:

```text
src/main/resources/sql/creaTablas.sql
```

## Entrega

Para entregar, subir:

1. ZIP del proyecto sin carpeta `target`.
2. Captura JPG de la página HTML mostrando la consulta ampliada funcionando.
