package grupog.agendamlg.backing;

import grupog.agendamlg.entities.Localidad;
import grupog.agendamlg.entities.Provincia;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;

/**
 *
 * @author Jean Paul Beaudry
 */
@Named(value = "localidadBean")
@SessionScoped
public class LocalidadBean implements Serializable {

    /**
     * Creates a new instance of LocalidadBean
     */
    private List<Localidad> localidades;

    public LocalidadBean() {
    }
    
    @PostConstruct
    public void init() {
        localidades = new ArrayList<>();
        Provincia provincia = new Provincia();
        provincia.setNombre("Málaga");
        localidades.add(new Localidad("Málaga", provincia));
        localidades.add(new Localidad("Benalmádena", provincia));
        localidades.add(new Localidad("Alhaurín de la Torre", provincia));
        localidades.add(new Localidad("Torremolinos", provincia));
        localidades.add(new Localidad("Rincón de la Victoria", provincia));
        localidades.add(new Localidad("Nerja", provincia));
//        Localidad localidad = new Localidad();
//        localidad.setNombre("Málaga");
//        localidad.setProvincia(provincia);
//        localidades.add(localidad);
//        localidad.setNombre("Benalmádena");
//        localidad.setProvincia(provincia);
//        localidades.add(localidad);
//        localidad.setNombre("Alhaurín de la Torre");
//        localidad.setProvincia(provincia);
//        localidades.add(localidad);
//        localidad.setNombre("Rincón de la Victoria");
//        localidad.setProvincia(provincia);
//        localidades.add(localidad);
//        localidad.setNombre("Nerja");
//        localidad.setProvincia(provincia);
//        localidades.add(localidad);
    }
    
    public List<Localidad> getLocalidades(){
        return localidades;
    }
}
