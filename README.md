# Documentacion-proyecto-ud1-Pablo-MeitinParamo

# Gestor de Incidencias

Aplicación de consola desarrollada en Java para la consulta y gestión de avisos de soporte técnico de un centro educativo.

##  Descripción y Finalidad
Este proyecto tiene como objetivo transformar una aplicación Java básica en un proyecto profesional documentado mediante **Javadoc**, estructurado con Apache Maven y publicado en línea a través de **GitHub Pages**.

##  Versión de Java
- **Versión de Java:** JDK 17[cite: 3]
- **Gestor de dependencias:** Apache Maven

##  Funcionalidades
La aplicación permite realizar las siguientes operaciones:
- **Listar todas las incidencias:** Muestra el catálogo completo de avisos registrados[cite: 1, 4].
- **Listar incidencias abiertas:** Filtra y muestra únicamente aquellas incidencias que siguen pendientes de resolución[cite: 1, 4].
- **Búsqueda por texto:** Permite buscar incidencias introduciendo palabras clave que coincidan con su identificador o título[cite: 1, 4].
- **Consulta de detalle por ID:** Muestra la información detallada de una incidencia específica a partir de su identificador único[cite: 1, 4].
- **Menú interactivo y CLI:** Soporta tanto una interfaz interactiva guiada por consola como la ejecución directa mediante comandos por argumentos.

##  Compilación y Ejecución
Puedes compilar y ejecutar la aplicación utilizando el wrapper de Maven incluido en el proyecto:

**Modo interactivo (Menú por consola):**
```bash
.\mvnw.cmd clean compile exec:java
