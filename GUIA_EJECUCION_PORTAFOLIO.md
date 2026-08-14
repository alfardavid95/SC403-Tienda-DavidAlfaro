# Guía de ejecución del proyecto TechShop

Esta guía explica cómo ejecutar el proyecto TechShop en ambiente local.

## Requisitos

- Java 17
- Maven
- MySQL
- NetBeans o IDE compatible con Spring Boot
- Git

## Base de datos

El proyecto utiliza MySQL y espera una base de datos llamada:

```text
techshop
cat >> README.md <<'EOF'

---

# TechShop - Resumen para portafolio

TechShop es una aplicación web construida con Spring Boot, Thymeleaf, MySQL y Spring Security.

## Descripción

El proyecto implementa una tienda web con consulta ampliada de productos y funcionalidades de seguridad basadas en autenticación y autorización por roles.

## Stack tecnológico

- Java 17
- Spring Boot
- Spring MVC
- Spring Data JPA
- Spring Security
- Thymeleaf
- MySQL
- Bootstrap
- Maven
- Git / GitHub

## Funcionalidades destacadas

- Consulta ampliada de productos.
- Filtros por categoría, texto, precio y existencia mínima.
- Login personalizado.
- Logout seguro.
- Roles ADMIN, VENDEDOR y USUARIO.
- Protección de rutas según rol.
- Menú dinámico según autenticación.
- Perfil de usuario.
- Página personalizada de acceso denegado.
- Panel de pruebas de seguridad.
- Documentación técnica y checklist de validación.

## Usuarios de prueba

| Usuario | Contraseña | Rol |
|---------|------------|-----|
| juan | 123 | ADMIN |
| rebeca | 456 | VENDEDOR |
| pedro | 789 | USUARIO |

## Rutas principales

| Ruta | Descripción |
|------|-------------|
| `/` | Página principal |
| `/login` | Inicio de sesión |
| `/perfil` | Perfil del usuario |
| `/consultas/listado` | Consulta ampliada |
| `/acceso_denegado` | Acceso bloqueado |
| `/seguridad/pruebas` | Panel de seguridad |

## Reglas de seguridad

| Ruta | Acceso |
|------|--------|
| `/consultas/**` | Pública |
| `/perfil` | Usuario autenticado |
| `/producto/**` | ADMIN o VENDEDOR |
| `/categoria/**` | ADMIN o VENDEDOR |
| `/seguridad/**` | ADMIN |
| `/usuario/**` | ADMIN |

## Estado

Proyecto funcional para entrega universitaria y presentación inicial en portafolio.
