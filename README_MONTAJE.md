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

## Documentación agregada para la Práctica #2

Además del código fuente del proyecto tienda, se agregaron documentos de apoyo para explicar, probar y entregar la consulta ampliada de la Práctica #2.

Documentos incluidos:

- ENTREGA_PRACTICA2.md
- MAPA_PRACTICA2.md
- PRUEBAS_PRACTICA2.md
- CHECKLIST_ENTREGA.md
- EJECUCION_LOCAL.md
- CONFIGURACION_BASE_DATOS.md
- FLUJO_MVC_PRACTICA2.md
- PARAMETROS_CONSULTA_PRACTICA2.md
- EVIDENCIA_CAPTURA_PRACTICA2.md
- PREPARACION_ZIP_ENTREGA.md
- RESUMEN_FINAL_PRACTICA2.md
- SEGURIDAD_CREDENCIALES.md

Estos archivos sirven como respaldo del trabajo realizado y explican el funcionamiento de la consulta, la estructura MVC, los parámetros utilizados, las pruebas manuales y los pasos de entrega.
