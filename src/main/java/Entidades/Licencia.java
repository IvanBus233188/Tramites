package Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Hector e Ivan
 */
/**
 *
 * Clase que representa una licencia como tipo de Tramite.
 *
 * La clase Licencia es una subclase de Tramite y se utiliza para representar un
 * trámite de solicitud de licencia.
 *
 * Licencia es una entidad mapeada con la anotación @Entity y su tabla en la
 * base de datos es "Licencia".
 *
 * La clase Licencia tiene dos constructores, uno con los parámetros de
 * vigencia, tipo, id_tramite, precio, fecha_solicitud, persona
 *
 * y otro con los parámetros de vigencia y tipo.
 *
 * También tiene los métodos getters y setters correspondientes para cada uno de
 * sus atributos.
 */
@Entity
@PrimaryKeyJoinColumn(name = "IdLicencia")
@DiscriminatorValue(value = "Licencia")
@Table(name = "Licencia")
public class Licencia extends Tramite {

    /**
     *
     * Atributo que representa la fecha de vigencia de la licencia.
     */
    @Basic
    @Temporal(TemporalType.DATE)
    @Column(name = "Vigencia")
    private Date vigencia;
    /**
     *
     * Atributo que representa el tipo de la licencia.
     */
    @Basic
    @Column(name = "Tipo")
    private String tipo;

    /**
     * atributo que representa el estado de la licencia
     */
    @Basic
    @Column(name = "Estado")
    private String estado;

    /**
     * Metodo que obtiene el estado de la licencia
     *
     * @return estado estado del tramite
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Metodo que setea el valor del estado de la licencia
     *
     * @param estado estado del tramite
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     *
     * Constructor de la clase Licencia con los parámetros de vigencia, tipo,
     * id_tramite, precio, fecha_solicitud, persona.
     *
     * @param vigencia Fecha de vigencia de la licencia.
     * @param tipo Tipo de la licencia.
     * @param id_tramite Identificador del trámite.
     * @param precio Precio del trámite.
     * @param fecha_solicitud Fecha de solicitud del trámite.
     * @param persona Persona que solicita el trámite.
     * @param estado estado de la licencia
     */
    public Licencia(Date vigencia, String tipo, Integer id_tramite, int precio, Date fecha_solicitud, String estado, Persona persona) {
        super(id_tramite, precio, fecha_solicitud, persona);
        this.vigencia = vigencia;
        this.tipo = tipo;
        this.estado = estado;
    }

    /**
     *
     * Constructor de la clase Licencia con los parámetros de vigencia y tipo.
     *
     * @param vigencia Fecha de vigencia de la licencia.
     * @param tipo Tipo de la licencia.
     */
    public Licencia(Date vigencia, String tipo) {
        this.vigencia = vigencia;
        this.tipo = tipo;
    }

    /**
     *
     * Método getter para el atributo vigencia.
     *
     * @return Fecha de vigencia de la licencia.
     */
    public Date getVigencia() {
        return vigencia;
    }

    /**
     *
     * Método setter para el atributo vigencia.
     *
     * @param vigencia Fecha de vigencia de la licencia.
     */
    public void setVigencia(Date vigencia) {
        this.vigencia = vigencia;
    }

    /**
     *
     * Método getter para el atributo tipo.
     *
     * @return Tipo de la licencia.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     *
     * Método setter para el atributo tipo.
     *
     * @param tipo Tipo de la licencia.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     *
     * Constructor vacío de la clase Licencia.
     */
    public Licencia() {
    }

    /**
     * Metodo que obtiene la persona dueña de la placa
     *
     * @return persona
     */
    @Override
    public Persona getPersona() {
        return super.getPersona();
    }

    /**
     * Metodo que setea la persona dueña de la placa
     *
     * @param persona persona que compra la licencia
     */
    @Override
    public void setPersona(Persona persona) {
        super.setPersona(persona);
    }

}
