package es.centro.incidencias;

/**
 * Excepción lanzada cuando no se encuentra ninguna incidencia con el
 * identificador especificado en el sistema.
 *
 * @author Tu Nombre y Apellidos
 * @version 1.0.0
 * @see GestorIncidencias#buscarPorId(String)
 * @since 1.0.0
 */
public class IncidenciaNoEncontradaException extends Exception {

    /**
     * Crea una excepción indicando el identificador de la incidencia que no ha sido localizada.
     *
     * @param id Identificador único de la incidencia no encontrada.
     */
    public IncidenciaNoEncontradaException(String id) {
        super("No existe ninguna incidencia con el identificador " + id + ".");
    }
}
