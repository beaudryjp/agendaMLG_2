package grupog.agendamlg.backing;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Jean Paul Beaudry
 */
@Named(value = "eventoBean")
@SessionScoped
public class EventoBean implements Serializable {

    /**
     * Creates a new instance of EventoBean
     */
    public EventoBean() {
    }
    
}
