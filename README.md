
## Funcionalidades de seguridad agregadas

El proyecto incorpora una configuración básica de seguridad con Spring Security.

### Funcionalidades implementadas

- Login personalizado.
- Logout.
- Usuarios de prueba en memoria.
- Roles ADMIN, VENDEDOR y USUARIO.
- Protección de rutas según rol.
- Menú dinámico según el usuario autenticado.
- Página de perfil del usuario.
- Página personalizada de acceso denegado.
- Panel de pruebas de seguridad.
- Documentación de pruebas de seguridad.

### Usuarios de prueba

| Usuario | Contraseña | Rol |
|---------|------------|-----|
| juan | 123 | ADMIN |
| rebeca | 456 | VENDEDOR |
| pedro | 789 | USUARIO |

### Rutas principales

| Ruta | Descripción |
|------|-------------|
| /login | Inicio de sesión personalizado |
| /perfil | Perfil del usuario autenticado |
| /acceso_denegado | Página para accesos bloqueados |
| /seguridad/pruebas | Panel de pruebas de seguridad |
| /consultas/listado | Consulta ampliada de productos |

### Reglas de acceso

| Ruta | Permiso |
|------|---------|
| /consultas/** | Pública |
| /perfil | Usuario autenticado |
| /producto/** | ADMIN o VENDEDOR |
| /categoria/** | ADMIN o VENDEDOR |
| /seguridad/** | ADMIN |
| /usuario/** | ADMIN |
