# Preparación del ZIP de entrega - Práctica #2

## Objetivo

Este documento describe cómo preparar el proyecto tienda para la entrega final de la Práctica #2.

## Carpeta del proyecto

La carpeta principal del proyecto es:

tienda

Dentro de esta carpeta deben estar los archivos principales del proyecto, como:

- pom.xml
- src
- README_MONTAJE.md
- nbactions.xml
- .gitignore

## Carpeta que no debe incluirse

Antes de comprimir el proyecto se debe eliminar la carpeta:

target

Esta carpeta contiene archivos generados automáticamente por Maven durante la compilación y no debe entregarse.

## Comando recomendado

Desde la raíz del proyecto tienda, se puede eliminar la carpeta target con:

rm -rf target

## Verificación antes de comprimir

Antes de crear el ZIP se debe revisar que existan:

- pom.xml
- src
- README_MONTAJE.md
- Archivos de documentación de la práctica

Y que no exista:

- target

## Evidencia adicional

Además del ZIP del proyecto, se debe entregar una captura JPG mostrando la consulta ampliada ejecutándose correctamente en el navegador.

## Resumen de entrega

La entrega debe contener:

1. Proyecto tienda comprimido en ZIP.
2. Captura JPG de la consulta funcionando.
