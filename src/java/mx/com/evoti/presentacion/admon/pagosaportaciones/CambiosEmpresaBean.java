/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.evoti.presentacion.admon.pagosaportaciones;

import java.io.Serializable;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import mx.com.evoti.bo.altasCambiosEmpresa.CambiosEmpresaBo;
import mx.com.evoti.bo.exception.BusinessException;
import mx.com.evoti.presentacion.BaseBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Venette
 */
@ManagedBean(name = "altasCambiosBean")
@RequestScoped
public class CambiosEmpresaBean extends BaseBean implements Serializable {

    private static Logger LOGGER = LoggerFactory.getLogger(CambiosEmpresaBean.class);
    private static final long serialVersionUID = 5213584426058703782L;

    private CambiosEmpresaBo bo;

    private Date catorcenaSeleccionada;

    public CambiosEmpresaBean() {
        this.bo = new CambiosEmpresaBo();
        this.catorcenaSeleccionada = null;
    }

    /**
     * Consulta directo en la base si la fecha que se está inroduciendo es una
     * catorcena
     *
     * @return true si es catorcena, false si no lo es
     */
    public boolean validaSiEsCatorcena() {
        LOGGER.info("Dentro de validasiescatorcena");
        boolean retorno = Boolean.FALSE;
        try {
            retorno = bo.validaSiEsCatorcena(catorcenaSeleccionada);
            if (!retorno) {
                String error = "La fecha que ha seleccionado no es catorcena.";
                super.muestraMensajeError(error, "", "fechaCato");
            } else {
                LOGGER.info("Catorcena encontrada");

            }
        } catch (BusinessException ex) {
            LOGGER.error(ex.getMessage(), ex.getCause());
        }
        return retorno;
    }

    /**
     * Metodo que procesa los cambios de empresa y guarda los registros que
     * estan pendientes en altascambios
     */
    public void procesaAltasCambios() {
        try {
            /**
             * Si es una catorcena válida, aplica los cambios de empresa
             */
            if (validaSiEsCatorcena()) {
                /*
            Se procesan los cambios de empresa
                 */
                int numCambios = bo.realizaCambioEmpresa(catorcenaSeleccionada);

                if (numCambios == 0) {
                    super.muestraMensajeGen("No hay cambios de empresa en esta catorcena. ", "", null, FacesMessage.SEVERITY_WARN);
                } else {
                    super.muestraMensajeExito("Se procesaron " + numCambios + "cambios de empresa.", "", null);

                }
            }
        } catch (BusinessException ex) {
            LOGGER.error(ex.getMessage(), ex);
        }
    }

    /**
     * @return the catorcenaSeleccionada
     */
    public Date getCatorcenaSeleccionada() {
        return catorcenaSeleccionada;
    }

    /**
     * @param catorcenaSeleccionada the catorcenaSeleccionada to set
     */
    public void setCatorcenaSeleccionada(Date catorcenaSeleccionada) {
        this.catorcenaSeleccionada = catorcenaSeleccionada;
    }

}
