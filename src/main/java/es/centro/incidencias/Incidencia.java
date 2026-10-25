package es.centro.incidencias;

import java.util.Locale;

/**
 * Representa una incidencia de soporte técnico registrada en el centro educativo.
 * Contiene información sobre su identificador, título, nivel de prioridad y estado actual.
 *
 * @author Tu Nombre y Apellidos
 * @version 1.0.0
 * @since 1.0.0
 */
public final class Incidencia {

    /** Identificador único de la incidencia (ej. INC-001). */
    private final String id;

    /** Título descriptivo del problema o aviso. */
    private final String titulo;

    /** Nivel de prioridad de la incidencia (ej. alta, media, baja). */
    private final String prioridad;

    /** Estado de la incidencia: {@code true} si está abierta, {@code false} si está cerrada. */
    private final boolean abierta;

    /**
     * Construye una nueva instancia de {@code Incidencia} con todos sus atributos.
     *
     * @param id Identificador único de la incidencia.
     * @param titulo Descripción corta de la incidencia.
     * @param prioridad Grado de prioridad ("alta", "media", "baja").
     * @param abierta {@code true} si la incidencia está abierta; {@code false} en caso contrario.
     */
    public Incidencia(String id, String titulo, String prioridad, boolean abierta) {
        this.id = id;
        this.titulo = titulo;
        this.prioridad = prioridad;
        this.abierta = abierta;
    }

    /**
     * Obtiene el identificador único de la incidencia.
     *
     * @return El identificador de la incidencia.
     */
    public String getId() {
        return id;
    }

    /**
     * Obtiene el título o descripción corta de la incidencia.
     *
     * @return El título de la incidencia.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Obtiene la prioridad asignada a la incidencia.
     *
     * @return La prioridad de la incidencia.
     */
    public String getPrioridad() {
        return prioridad;
    }

    /**
     * Indica si la incidencia se encuentra actualmente abierta o pendiente de resolución.
     *
     * @return {@code true} si está abierta; {@code false} si está cerrada.
     */
    public boolean isAbierta() {
        return abierta;
    }

    /**
     * Comprueba si el texto especificado coincide parcial o totalmente con el
     * identificador o el título de la incidencia, sin diferenciar mayúsculas de minúsculas.
     *
     * @param texto Cadena de texto a buscar dentro del identificador o título.
     * @return {@code true} si existe alguna coincidencia; {@code false} en caso contrario.
     */
    public boolean coincideCon(String texto) {
        String criterio = texto.toLowerCase(Locale.ROOT);
        return id.toLowerCase(Locale.ROOT).contains(criterio)
                || titulo.toLowerCase(Locale.ROOT).contains(criterio);
    }

    @Override
    public String toString() {
        return String.format("[%s] %s (Prioridad: %s, Estado: %s)",
                id, titulo, prioridad, abierta ? "Abierta" : "Cerrada");
    }
}
