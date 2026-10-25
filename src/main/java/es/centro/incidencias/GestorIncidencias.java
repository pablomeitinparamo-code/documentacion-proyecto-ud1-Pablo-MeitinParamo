package es.centro.incidencias;

import java.util.List;

/**
 * Gestiona el catálogo de incidencias del centro educativo.
 * Permite listar, filtrar y buscar incidencias registradas en el sistema.
 *
 * @author Tu Nombre y Apellidos
 * @version 1.0.0
 * @see Incidencia
 * @see IncidenciaNoEncontradaException
 * @since 1.0.0
 */
public final class GestorIncidencias {

    /** Lista interna inmutable con las incidencias del sistema. */
    private final List<Incidencia> incidencias;

    /**
     * Crea un gestor e inicializa el catálogo de incidencias con un conjunto
     * de datos predefinidos para pruebas.
     */
    public GestorIncidencias() {
        incidencias = List.of(
                new Incidencia("INC-001", "No se puede iniciar sesión", "alta", true),
                new Incidencia("INC-002", "Actualizar el navegador", "media", false),
                new Incidencia("INC-003", "Impresora sin conexión", "baja", true),
                new Incidencia("INC-004", "Fallo de red en el aula", "alta", true)
        );
    }

    /**
     * Devuelve todas las incidencias registradas en el gestor.
     *
     * @return Una lista no modificable con todas las {@link Incidencia} registradas.
     */
    public List<Incidencia> listar() {
        return incidencias;
    }

    /**
     * Filtra y devuelve únicamente las incidencias que están marcadas como abiertas.
     *
     * @return Una lista de {@link Incidencia} cuyo estado {@link Incidencia#isAbierta()} sea {@code true}.
     */
    public List<Incidencia> listarAbiertas() {
        return incidencias.stream()
                .filter(Incidencia::isAbierta)
                .toList();
    }

    /**
     * Realiza una búsqueda de incidencias cuyo ID o título contengan el texto indicado.
     *
     * @param texto Criterio o texto de búsqueda.
     * @return Lista de {@link Incidencia} que coinciden con el texto de búsqueda.
     * @see Incidencia#coincideCon(String)
     */
    public List<Incidencia> buscar(String texto) {
        return incidencias.stream()
                .filter(incidencia -> incidencia.coincideCon(texto))
                .toList();
    }

    /**
     * Busca y retorna una incidencia por su identificador exacto.
     *
     * @param id El identificador único de la incidencia a localizar (ej. "INC-001").
     * @return La {@link Incidencia} correspondiente al identificador recibido.
     * @throws IncidenciaNoEncontradaException Si no existe ninguna incidencia con el {@code id} indicado.
     */
    public Incidencia buscarPorId(String id) throws IncidenciaNoEncontradaException {
        return incidencias.stream()
                .filter(incidencia -> incidencia.getId().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(() -> new IncidenciaNoEncontradaException(id));
    }

    /**
     * Obtiene una incidencia por su identificador.
     *
     * @param id El identificador único de la incidencia.
     * @return La {@link Incidencia} encontrada, o {@code null} si no se encuentra.
     * @deprecated Este método no gestiona adecuadamente las ausencias mediante excepciones y puede devolver {@code null}.
     *             Se recomienda utilizar en su lugar {@link #buscarPorId(String)}.
     */
    @Deprecated(since = "1.0.0", forRemoval = false)
    public Incidencia obtenerIncidencia(String id) {
        try {
            return buscarPorId(id);
        } catch (IncidenciaNoEncontradaException excepcion) {
            return null;
        }
    }
}