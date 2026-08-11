# Mapa de seguridad del proyecto Tienda

Este documento resume los archivos principales utilizados para implementar seguridad con Spring Security en el proyecto Tienda.

## Objetivo

Agregar autenticacion, autorizacion por roles, login personalizado, logout, perfil de usuario, menu dinamico y paginas protegidas.

## Usuarios de prueba

| Usuario | Contrasena | Rol |
|---------|------------|-----|
| juan | 123 | ADMIN |
| rebeca | 456 | VENDEDOR |
| pedro | 789 | USUARIO |

## Archivo principal de seguridad

### src/main/java/com/tienda/config/SecurityConfig.java

Este archivo define la configuracion principal de Spring Security.

Incluye:

- Rutas publicas.
- Rutas protegidas.
- Reglas de acceso por rol.
- Login personalizado.
- Logout.
- Pagina de acceso denegado.
- Usuarios de prueba en memoria.

## Controladores relacionados

### src/main/java/com/tienda/controller/LoginController.java

Controlador utilizado para mostrar las siguientes paginas:

- /login
- /perfil
- /acceso_denegado

### src/main/java/com/tienda/controller/SeguridadController.java

Controlador utilizado para mostrar el panel de pruebas de seguridad.

Ruta:

- /seguridad/pruebas

## Vistas relacionadas

### src/main/resources/templates/login.html

Pagina personalizada de inicio de sesion.

Incluye:

- Formulario de login.
- Token CSRF.
- Tabla con usuarios de prueba.
- Mensaje de error por credenciales incorrectas.
- Mensaje de cierre de sesion exitoso.

### src/main/resources/templates/perfil.html

Pagina de perfil del usuario autenticado.

Muestra:

- Usuario autenticado.
- Rol detectado.
- Accesos disponibles.
- Botones rapidos segun permisos.
- Opcion para cerrar sesion.

### src/main/resources/templates/acceso_denegado.html

Pagina personalizada para accesos bloqueados.

Muestra:

- Usuario autenticado.
- Mensaje de acceso denegado.
- Roles requeridos.
- Boton para volver al inicio.
- Boton para ver perfil.
- Boton para cerrar sesion.

### src/main/resources/templates/seguridad/pruebas.html

Panel de pruebas de seguridad.

Muestra:

- Usuarios de prueba.
- Roles.
- Rutas protegidas.
- Permisos esperados por cada usuario.

## Menu dinamico

### src/main/resources/templates/general/fragmentos.html

El menu usa Thymeleaf Extras Spring Security para mostrar opciones segun el rol del usuario.

Comportamiento esperado:

Sin login:

- Inicio
- Consultas
- Idioma
- Login

ADMIN:

- Inicio
- Categorias
- Productos
- Consultas
- Perfil
- Seguridad
- Logout

VENDEDOR:

- Inicio
- Categorias
- Productos
- Consultas
- Perfil
- Logout

USUARIO:

- Inicio
- Consultas
- Perfil
- Logout

## Rutas publicas

| Ruta | Descripcion |
|------|-------------|
| / | Inicio |
| /index | Inicio |
| /login | Login personalizado |
| /consultas/** | Consulta ampliada de practica 2 |
| /webjars/** | Recursos web |
| /css/** | Estilos |
| /js/** | Scripts |
| /images/** | Imagenes |
| /img/** | Imagenes |
| /fav/** | Favicon |
| /error | Pagina de error |

## Rutas protegidas

| Ruta | Permiso requerido |
|------|-------------------|
| /perfil | Usuario autenticado |
| /producto/** | ADMIN o VENDEDOR |
| /categoria/** | ADMIN o VENDEDOR |
| /seguridad/** | ADMIN |
| /usuario/** | ADMIN |

## Validacion esperada

- Juan puede acceder a todas las rutas protegidas.
- Rebeca puede acceder a productos y categorias.
- Pedro solo puede acceder a inicio, consultas y perfil.
- Si un usuario intenta acceder a una ruta no permitida, se redirige a /acceso_denegado.
- El menu cambia visualmente segun el rol autenticado.

## Relacion con el curso

Esta implementacion aplica conceptos de Spring Security:

- Autenticacion.
- Autorizacion.
- Roles.
- Proteccion de rutas.
- Login personalizado.
- Logout.
- Integracion de Spring Security con Thymeleaf.
