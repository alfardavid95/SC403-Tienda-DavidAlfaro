# Mapa de seguridad del proyecto Tienda

Este documento describe los archivos relacionados con la implementación de Spring Security en el proyecto.

## Objetivo

El objetivo de esta funcionalidad es agregar autenticación, autorización por roles, páginas protegidas y vistas dinámicas según el usuario autenticado.

## Archivos principales

### src/main/java/com/tienda/config/SecurityConfig.java

Archivo principal de configuración de seguridad.

Define:

- Rutas públicas.
- Rutas protegidas.
- Reglas por rol.
- Login personalizado.
- Logout.
- Página de acceso denegado.
- Usuarios de prueba en memoria.

Usuarios configurados:

| Usuario | Contraseña | Rol |
|---------|------------|-----|
| juan | 123 | ADMIN |
| rebeca | 456 | VENDEDOR |
| pedro | 789 | USUARIO |

## Controladores agregados

### src/main/java/com/tienda/controller/LoginController.java

Controlador encargado de mostrar:

- /login
- /perfil
- /acceso_denegado

### src/main/java/com/tienda/controller/SeguridadController.java

Controlador encargado del panel de pruebas de seguridad.

Ruta principal:

- /seguridad/pruebas

## Vistas agregadas

### src/main/resources/templates/login.html

Página personalizada de inicio de sesión.

Incluye:

- Formulario de usuario y contraseña.
- Token CSRF.
- Tabla de usuarios de prueba.
- Mensaje de error cuando el login falla.
- Mensaje de logout correcto.

### src/main/resources/templates/perfil.html

Página de perfil del usuario autenticado.

Muestra:

- Usuario autenticado.
- Rol detectado.
- Accesos disponibles según rol.
- Botones rápidos según permisos.
- Logout.

### src/main/resources/templates/acceso_denegado.html

Página personalizada para usuarios sin permisos.

Muestra:

- Usuario autenticado.
- Mensaje de acceso bloqueado.
- Roles requeridos.
- Botón para volver al inicio.
- Botón para ver perfil.
- Botón para cerrar sesión.

### src/main/resources/templates/seguridad/pruebas.html

Panel de pruebas de seguridad.

Muestra:

- Usuarios de prueba.
- Roles.
- Rutas protegidas.
- Permisos esperados por cada rol.

## Menú dinámico

### src/main/resources/templates/general/fragmentos.html

El menú utiliza Thymeleaf Extras Spring Security para mostrar opciones según el rol.

Comportamiento esperado:

### Sin login

- Inicio
- Consultas
- Idioma
- Login

### ADMIN

- Inicio
- Categorías
- Productos
- Consultas
- Perfil
- Seguridad
- Logout

### VENDEDOR

- Inicio
- Categorías
- Productos
- Consultas
- Perfil
- Logout

### USUARIO

- Inicio
- Consultas
- Perfil
- Logout

## Rutas públicas

| Ruta | Descripción |
|------|-------------|
| / | Inicio |
| /index | Inicio |
| /login | Login personalizado |
| /consultas/** | Consulta ampliada de práctica 2 |
| /webjars/** | Recursos web |
| /css/** | Estilos |
| /js/** | Scripts |
| /images/** | Imágenes |
| /img/** | Imágenes |
| /fav/** | Favicon |
| /error | Página de error |

## Rutas protegidas

| Ruta | Permiso requerido |
|------|-------------------|
| /perfil | Usuario autenticado |
| /producto/** | ADMIN o VENDEDOR |
| /categoria/** | ADMIN o VENDEDOR |
| /seguridad/** | ADMIN |
| /usuario/** | ADMIN |

## Validación esperada

- Juan puede acceder a todas las rutas protegidas.
- Rebeca puede acceder a productos y categorías.
- Pedro solo puede acceder a inicio, consultas y perfil.
- Si un usuario intenta acceder a una ruta no permitida, se redirige a /acceso_denegado.
- El menú cambia visualmente según el rol autenticado.

## Relación con el curso

Esta implementación aplica conceptos vistos en Spring Security:

- Autenticación.
- Autorización.
- Roles.
- Protección de rutas.
- Login personalizado.
- Logout.
- Integración de Spring Security con Thymeleaf.
