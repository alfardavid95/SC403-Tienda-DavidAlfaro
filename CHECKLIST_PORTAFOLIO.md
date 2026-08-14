# Checklist de validación para portafolio

Este checklist resume las pruebas principales para validar el proyecto TechShop antes de presentarlo como proyecto universitario o de portafolio.

## Validación general

- [ ] El proyecto compila correctamente.
- [ ] La aplicación inicia en el puerto 8080.
- [ ] La página principal carga correctamente.
- [ ] La conexión con MySQL funciona.
- [ ] La consulta ampliada de productos carga correctamente.

## Validación de login

- [ ] La ruta `/login` carga correctamente.
- [ ] El usuario `juan / 123` puede iniciar sesión.
- [ ] El usuario `rebeca / 456` puede iniciar sesión.
- [ ] El usuario `pedro / 789` puede iniciar sesión.
- [ ] El sistema muestra error con credenciales incorrectas.
- [ ] El logout funciona correctamente.

## Validación por rol ADMIN

- [ ] Juan puede entrar a `/perfil`.
- [ ] Juan puede entrar a `/producto/listado`.
- [ ] Juan puede entrar a `/categoria/listado`.
- [ ] Juan puede entrar a `/seguridad/pruebas`.
- [ ] El menú muestra opciones administrativas.

## Validación por rol VENDEDOR

- [ ] Rebeca puede entrar a `/perfil`.
- [ ] Rebeca puede entrar a `/producto/listado`.
- [ ] Rebeca puede entrar a `/categoria/listado`.
- [ ] Rebeca no puede entrar a `/seguridad/pruebas`.
- [ ] El sistema redirige a `/acceso_denegado` cuando intenta entrar a seguridad.

## Validación por rol USUARIO

- [ ] Pedro puede entrar a `/perfil`.
- [ ] Pedro puede entrar a `/consultas/listado`.
- [ ] Pedro no ve Productos en el menú.
- [ ] Pedro no ve Categorías en el menú.
- [ ] Pedro no ve Seguridad en el menú.
- [ ] Pedro no puede entrar a `/producto/listado`.
- [ ] Pedro no puede entrar a `/categoria/listado`.
- [ ] Pedro no puede entrar a `/seguridad/pruebas`.
- [ ] El sistema redirige a `/acceso_denegado`.

## Validación de documentación

- [ ] README actualizado.
- [ ] Guía de ejecución agregada.
- [ ] Documentación de seguridad agregada.
- [ ] Checklist de portafolio agregado.
- [ ] Repositorio subido a GitHub.
